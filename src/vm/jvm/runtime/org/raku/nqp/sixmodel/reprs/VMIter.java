package org.raku.nqp.sixmodel.reprs;

import org.raku.nqp.runtime.ExceptionHandling;
import org.raku.nqp.runtime.ThreadContext;
import org.raku.nqp.sixmodel.REPR;
import org.raku.nqp.sixmodel.STable;
import org.raku.nqp.sixmodel.SerializationReader;
import org.raku.nqp.sixmodel.SixModelObject;
import org.raku.nqp.sixmodel.StorageSpec;
import org.raku.nqp.sixmodel.TypeObject;

public class VMIter extends REPR {
    public SixModelObject type_object_for(ThreadContext tc, SixModelObject HOW) {
        STable st = new STable(this, HOW);
        SixModelObject obj = new TypeObject();
        obj.st = st;
        st.WHAT = obj;
        return st.WHAT;
    }

    public SixModelObject allocate(ThreadContext tc, STable st) {
        VMIterInstance obj = new VMIterInstance();
        obj.st = st;
        return obj;
    }

    public StorageSpec get_value_storage_spec(ThreadContext tc, STable st) {
        return new StorageSpec();
    }

    public SixModelObject deserialize_stub(ThreadContext tc, STable st) {
        throw ExceptionHandling.dieInternal(tc, "VMIter does not participate in serialization");
    }

    public void deserialize_finish(ThreadContext tc, STable st,
            SerializationReader reader, SixModelObject obj) {
        throw ExceptionHandling.dieInternal(tc, "VMIter does not participate in serialization");
    }
}

package org.raku.nqp.sixmodel;

import org.raku.nqp.runtime.ExceptionHandling;
import org.raku.nqp.runtime.Ops;
import org.raku.nqp.runtime.ThreadContext;

public class TypeObject extends SixModelObject {
    public SixModelObject get_attribute_boxed(ThreadContext tc, SixModelObject class_handle,
            String name, long hint) {
        throw ExceptionHandling.dieInternal(tc, "Cannot look up attributes in a type object");
    }
    public void get_attribute_native(ThreadContext tc, SixModelObject class_handle, String name, long hint) {
        throw ExceptionHandling.dieInternal(tc, "Cannot look up attributes in a type object");
    }
    public void bind_attribute_boxed(ThreadContext tc,SixModelObject class_handle,
            String name, long hint, SixModelObject value) {
        throw ExceptionHandling.dieInternal(tc, "Cannot look up attributes in a type object");
    }
    public void bind_attribute_native(ThreadContext tc,SixModelObject class_handle, String name, long hint) {
        throw ExceptionHandling.dieInternal(tc, "Cannot look up attributes in a type object");
    }
    public long is_attribute_initialized(ThreadContext tc, SixModelObject class_handle,
            String name, long hint) {
        throw ExceptionHandling.dieInternal(tc, "Cannot look up attributes in a type object");
    }

    public long get_int(ThreadContext tc) {
        throw ExceptionHandling.dieInternal(tc, "Cannot unbox a type object");
    }
    public double get_num(ThreadContext tc) {
        throw ExceptionHandling.dieInternal(tc, "Cannot unbox a type object");
    }
    public String get_str(ThreadContext tc) {
        throw ExceptionHandling.dieInternal(tc, "Cannot unbox a type object");
    }

    public SixModelObject at_pos_boxed(ThreadContext tc, long index) {
        return Ops.createNull(tc);
    }
    public void bind_pos_boxed(ThreadContext tc, long index, SixModelObject value) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public void set_elems(ThreadContext tc, long count) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public void push_boxed(ThreadContext tc, SixModelObject value) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public SixModelObject pop_boxed(ThreadContext tc) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public void unshift_boxed(ThreadContext tc, SixModelObject value) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public SixModelObject shift_boxed(ThreadContext tc) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public SixModelObject slice(ThreadContext tc, SixModelObject dest, long beginning, long end) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public void splice(ThreadContext tc, SixModelObject from, long offset, long count) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public SixModelObject at_key_boxed(ThreadContext tc, String key) {
        return Ops.createNull(tc);
    }
    public void bind_key_boxed(ThreadContext tc, String key, SixModelObject value) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public long exists_key(ThreadContext tc, String key) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public void delete_key(ThreadContext tc, String key) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }
    public long elems(ThreadContext tc) {
        throw ExceptionHandling.dieInternal(tc, "Cannot do aggregate operation on a type object");
    }

    public SixModelObject clone(ThreadContext tc) {
        try {
            SixModelObject cloned = (SixModelObject)this.clone();
            cloned.sc = null;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

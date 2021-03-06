package org.raku.nqp.io;

import java.nio.charset.Charset;

import org.raku.nqp.runtime.ThreadContext;

public interface IIOEncodable {
    public void setEncoding(ThreadContext tc, Charset cs);
}

package org.raku.nqp.io;

import org.raku.nqp.runtime.ThreadContext;

public interface IIOPossiblyTTY {
    public boolean isTTY(ThreadContext tc);
}

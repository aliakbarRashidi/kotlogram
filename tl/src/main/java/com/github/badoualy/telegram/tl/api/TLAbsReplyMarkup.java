package com.github.badoualy.telegram.tl.api;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public abstract class TLAbsReplyMarkup extends TLObject {
    protected int flags;

    protected boolean selective;

    public TLAbsReplyMarkup() {
    }

    public boolean getSelective() {
        return selective;
    }

    public void setSelective(boolean selective) {
        this.selective = selective;
    }
}
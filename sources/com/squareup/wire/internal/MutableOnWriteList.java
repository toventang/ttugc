package com.squareup.wire.internal;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class MutableOnWriteList<T> extends AbstractList<T> implements Serializable, RandomAccess {
    private final List<T> immutableList;
    List<T> mutableList;

    static {
        Covode.recordClassIndex(35718);
    }

    private Object writeReplace() {
        return new ArrayList(this.mutableList);
    }

    public final int size() {
        return this.mutableList.size();
    }

    MutableOnWriteList(List<T> list) {
        this.immutableList = list;
        this.mutableList = list;
    }

    @Override // java.util.List, java.util.AbstractList
    public final T get(int i) {
        return this.mutableList.get(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public final T remove(int i) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        return this.mutableList.remove(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i, T t) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        this.mutableList.add(i, t);
    }

    @Override // java.util.List, java.util.AbstractList
    public final T set(int i, T t) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        return this.mutableList.set(i, t);
    }
}

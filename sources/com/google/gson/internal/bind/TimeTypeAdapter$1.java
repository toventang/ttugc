package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import java.sql.Time;

class TimeTypeAdapter$1 implements AbstractC28033w {
    static {
        Covode.recordClassIndex(33537);
    }

    TimeTypeAdapter$1() {
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        if (aVar.rawType == Time.class) {
            return new C27947g();
        }
        return null;
    }
}

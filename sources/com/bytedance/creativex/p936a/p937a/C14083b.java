package com.bytedance.creativex.p936a.p937a;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.a.a.b */
public final class C14083b {

    /* renamed from: a */
    public static final Class<? extends Object>[] f34263a = {Parcelable.class, Serializable.class, Byte.TYPE, Character.TYPE, Boolean.TYPE, Integer.TYPE, Short.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, String.class};

    static {
        Covode.recordClassIndex(16150);
    }

    /* renamed from: com.bytedance.creativex.a.a.b$a */
    public static final class C14084a extends AbstractC89220m implements AbstractC89172b<Class<?>, Boolean> {

        /* renamed from: a */
        public static final C14084a f34264a = new C14084a();

        static {
            Covode.recordClassIndex(16151);
        }

        C14084a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            C89219l.m154721d(cls2, "");
            Class<? extends Object>[] clsArr = C14083b.f34263a;
            int length = clsArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (clsArr[i].isAssignableFrom(cls2)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            return Boolean.valueOf(z);
        }
    }
}

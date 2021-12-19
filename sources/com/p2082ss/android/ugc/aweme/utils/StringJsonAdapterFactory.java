package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;

/* renamed from: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory */
public class StringJsonAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(93439);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory$1 */
    static /* synthetic */ class C801771 {

        /* renamed from: a */
        static final /* synthetic */ int[] f179624a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 93440(0x16d00, float:1.30937E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.p2020c.EnumC27899b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory.C801771.f179624a = r2
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NULL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory.C801771.f179624a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.STRING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory.C801771.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory$a */
    public static class C80178a<T> extends AbstractC28031v<T> {

        /* renamed from: a */
        private final C27910f f179625a;

        /* renamed from: b */
        private final C27895a<T> f179626b;

        static {
            Covode.recordClassIndex(93441);
        }

        @Override // com.google.gson.AbstractC28031v
        public final T read(C27897a aVar) {
            int i = C801771.f179624a[aVar.mo46627f().ordinal()];
            if (i != 1) {
                return i != 2 ? (T) this.f179625a.mo46666a(aVar, this.f179626b.type) : (T) this.f179625a.mo46671a(aVar.mo46629i(), this.f179626b.type);
            }
            aVar.mo46631k();
            return null;
        }

        public C80178a(C27910f fVar, C27895a<T> aVar) {
            this.f179625a = fVar;
            this.f179626b = aVar;
        }

        @Override // com.google.gson.AbstractC28031v
        public final void write(C27900c cVar, T t) {
            cVar.mo46648b(this.f179625a.mo46674b(t));
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        return new C80178a(fVar, aVar);
    }
}

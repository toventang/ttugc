package com.bytedance.covode.number;

import android.content.Context;
import com.bytedance.covode.p922a.C13801a;
import java.io.File;

public abstract class Covode {

    /* renamed from: com.bytedance.covode.number.Covode$b */
    public interface AbstractC13806b {
        /* renamed from: a */
        boolean mo22213a(File file);
    }

    /* access modifiers changed from: protected */
    public abstract boolean report(AbstractC13806b bVar);

    /* access modifiers changed from: protected */
    public abstract boolean start(C13805a aVar);

    private static CovodeNumberImpl getImpl() {
        return CovodeNumberImpl.f33571a;
    }

    /* renamed from: com.bytedance.covode.number.Covode$a */
    public static class C13805a {

        /* renamed from: a */
        C13801a f33569a;

        /* renamed from: b */
        public boolean f33570b;

        /* renamed from: a */
        public final C13805a mo22211a(String str) {
            this.f33569a.f33564a = str;
            return this;
        }

        public C13805a(Context context) {
            C13801a aVar = new C13801a();
            this.f33569a = aVar;
            aVar.f33565b = context;
        }

        /* renamed from: a */
        public final C13805a mo22212a(boolean z) {
            this.f33569a.f33566c = z;
            return this;
        }
    }

    public static boolean reportCollections(AbstractC13806b bVar) {
        return getImpl().report(bVar);
    }

    public static boolean startCollecting(C13805a aVar) {
        return getImpl().start(aVar);
    }

    public static void recordClassIndex(int i) {
        CovodeNumberImpl impl = getImpl();
        if (impl.f33573b == null) {
            C13809a aVar = CovodeNumberImpl.f33572c;
            if (aVar != null && aVar.f33578c) {
                if (i < 32767) {
                    aVar.f33577b.add(Short.valueOf((short) i));
                } else {
                    aVar.f33576a.add(Integer.valueOf(i));
                }
            }
        } else if (impl.f33573b.f33570b) {
            impl.recordClassIndexToFile(i);
        }
    }
}

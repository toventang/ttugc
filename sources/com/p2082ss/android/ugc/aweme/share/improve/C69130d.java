package com.p2082ss.android.ugc.aweme.share.improve;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.C68054cf;
import com.p2082ss.android.ugc.aweme.share.p3754i.C68960a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import java.util.Comparator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d */
public final class C69130d implements Comparator<AbstractC69693h> {

    /* renamed from: a */
    public static final C69131a f154574a = new C69131a((byte) 0);

    /* renamed from: b */
    private final int f154575b = 1000;

    /* renamed from: c */
    private final List<C68054cf> f154576c;

    static {
        Covode.recordClassIndex(81444);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d$a */
    public static final class C69131a {
        static {
            Covode.recordClassIndex(81445);
        }

        private C69131a() {
        }

        public /* synthetic */ C69131a(byte b) {
            this();
        }
    }

    public C69130d() {
        C68960a a = C68960a.m121644a();
        C89219l.m154716b(a, "");
        this.f154576c = a.f154276b;
    }

    /* renamed from: a */
    private final int m122237a(String str, List<? extends C68054cf> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(((C68054cf) list.get(i)).f152439a, str)) {
                return i;
            }
        }
        return this.f154575b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC69693h hVar, AbstractC69693h hVar2) {
        AbstractC69693h hVar3 = hVar;
        AbstractC69693h hVar4 = hVar2;
        if (hVar3 == null) {
            return -1;
        }
        if (hVar4 == null) {
            return 1;
        }
        List<C68054cf> list = this.f154576c;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return m122237a(hVar3.mo61919c(), this.f154576c) - m122237a(hVar4.mo61919c(), this.f154576c);
    }
}

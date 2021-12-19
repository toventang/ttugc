package com.p2082ss.android.ugc.aweme.story.p4043f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.story.f.a */
public final class C77158a {

    /* renamed from: a */
    public static final int f173087a = 1;

    /* renamed from: b */
    public static final boolean f173088b;

    /* renamed from: c */
    public static final C77158a f173089c = new C77158a();

    /* renamed from: d */
    private static final AbstractC89244h f173090d;

    private C77158a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.f.a$a */
    static final class C77159a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C77159a f173091a = new C77159a();

        static {
            Covode.recordClassIndex(90167);
        }

        C77159a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("enable_story_avatar_entrance", 1));
        }
    }

    static {
        Covode.recordClassIndex(90166);
        boolean z = true;
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C77159a.f173091a);
        f173090d = a;
        if (((Number) a.getValue()).intValue() != 1) {
            z = false;
        }
        f173088b = z;
    }
}

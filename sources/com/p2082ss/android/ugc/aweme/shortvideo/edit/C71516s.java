package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.s */
public final class C71516s {

    /* renamed from: a */
    public static final C71516s f160279a = new C71516s();

    /* renamed from: b */
    private static final AbstractC89244h f160280b = C89250i.m154773a((AbstractC89171a) C71517a.f160281a);

    /* renamed from: a */
    static Keva m126391a() {
        return (Keva) f160280b.getValue();
    }

    private C71516s() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.s$a */
    static final class C71517a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C71517a f160281a = new C71517a();

        static {
            Covode.recordClassIndex(84058);
        }

        C71517a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("edit_merge_music_prompt");
        }
    }

    /* renamed from: b */
    public static final boolean m126392b() {
        if (!m126391a().getBoolean("shown", false)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(84057);
    }
}

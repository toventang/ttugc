package com.p2082ss.android.ugc.aweme.story.p4043f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.f.c */
public final class C77161c {

    /* renamed from: a */
    public static final C77160b f173098a = new C77160b((byte) 0);

    /* renamed from: b */
    public static final C77161c f173099b = new C77161c();

    /* renamed from: c */
    private static final AbstractC89244h f173100c = C89250i.m154773a((AbstractC89171a) C77162a.f173101a);

    /* renamed from: a */
    public static C77160b m134769a() {
        return (C77160b) f173100c.getValue();
    }

    private C77161c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.f.c$a */
    static final class C77162a extends AbstractC89220m implements AbstractC89171a<C77160b> {

        /* renamed from: a */
        public static final C77162a f173101a = new C77162a();

        static {
            Covode.recordClassIndex(90170);
        }

        C77162a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77160b invoke() {
            Object a = SettingsManager.m29616a().mo25397a("tt_story_config", C77160b.class, C77161c.f173098a);
            if (a == null) {
                a = C77161c.f173098a;
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    static {
        Covode.recordClassIndex(90169);
    }
}

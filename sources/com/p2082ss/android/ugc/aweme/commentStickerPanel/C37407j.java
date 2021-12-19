package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.j */
public final class C37407j {

    /* renamed from: a */
    public static final AbstractC89244h f88278a = C89250i.m154773a((AbstractC89171a) C37409b.f88280a);

    /* renamed from: b */
    public static final C37408a f88279b = new C37408a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.j$a */
    public static final class C37408a {
        static {
            Covode.recordClassIndex(44789);
        }

        /* renamed from: a */
        static Keva m75450a() {
            return (Keva) C37407j.f88278a.getValue();
        }

        private C37408a() {
        }

        /* renamed from: b */
        public static boolean m75451b() {
            if (m75450a().getInt("comment_panel_tip_count", 0) != 0) {
                return false;
            }
            m75450a().storeInt("comment_panel_tip_count", 1);
            return true;
        }

        public /* synthetic */ C37408a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.j$b */
    static final class C37409b extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C37409b f88280a = new C37409b();

        static {
            Covode.recordClassIndex(44790);
        }

        C37409b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("record_comment_panel");
        }
    }

    static {
        Covode.recordClassIndex(44788);
    }
}

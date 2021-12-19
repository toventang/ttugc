package com.p2082ss.android.ugc.aweme.discover.p2777k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.k.a */
public final class C42175a {

    /* renamed from: a */
    public static final C42175a f98304a = new C42175a();

    /* renamed from: com.ss.android.ugc.aweme.discover.k.a$a */
    public static final class C42176a implements Serializable {
        public static final C42177a Companion = new C42177a((byte) 0);
        @AbstractC27891c(mo46611a = "position")

        /* renamed from: a */
        private int f98305a = -1;
        @AbstractC27891c(mo46611a = "user_note")

        /* renamed from: b */
        private String f98306b;

        static {
            Covode.recordClassIndex(50115);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.k.a$a$a */
        public static final class C42177a {
            static {
                Covode.recordClassIndex(50116);
            }

            private C42177a() {
            }

            public /* synthetic */ C42177a(byte b) {
                this();
            }
        }

        public final int getPosition() {
            return this.f98305a;
        }

        public final String getUserNote() {
            return this.f98306b;
        }

        public final void setPosition(int i) {
            this.f98305a = i;
        }

        public final void setUserNote(String str) {
            this.f98306b = str;
        }
    }

    private C42175a() {
    }

    static {
        Covode.recordClassIndex(50114);
    }

    /* renamed from: a */
    public static C42176a m84430a() {
        try {
            return (C42176a) SettingsManager.m29616a().mo25396a("music_user_note", C42176a.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w */
public interface AbstractC72264w {
    static {
        Covode.recordClassIndex(84929);
    }

    /* renamed from: a */
    C72265a mo114263a();

    /* renamed from: a */
    void mo114264a(boolean z, MusicModel musicModel, String str);

    /* renamed from: e */
    C72265a mo114265e();

    /* renamed from: g */
    void mo114266g();

    /* renamed from: i */
    boolean mo114267i();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w$a */
    public static final class C72265a {

        /* renamed from: a */
        public MusicModel f162000a;

        /* renamed from: b */
        public String f162001b;

        static {
            Covode.recordClassIndex(84930);
        }

        private /* synthetic */ C72265a() {
            this(null, null);
        }

        /* renamed from: a */
        public final boolean mo114486a() {
            String str;
            if (this.f162000a == null || (str = this.f162001b) == null || !C84902i.m145892a(str)) {
                return false;
            }
            return true;
        }

        public C72265a(MusicModel musicModel, String str) {
            this.f162000a = musicModel;
            this.f162001b = str;
        }
    }
}

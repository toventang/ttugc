package com.p2082ss.android.ugc.aweme.player.p3548a;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50542j;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59227a;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.CallableC59228b;
import com.p2082ss.android.ugc.aweme.p2397bm.C34888b;
import com.p2082ss.android.ugc.aweme.player.p3549ab.abs.C62925d;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.p4314h.C84116g;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.player.a.e */
public final class C62904e {

    /* renamed from: i */
    private static int f142776i;

    /* renamed from: a */
    public AbstractC48149ai f142777a;

    /* renamed from: b */
    public String f142778b;

    /* renamed from: c */
    public Video f142779c;

    /* renamed from: d */
    public String f142780d;

    /* renamed from: e */
    public Fragment f142781e;

    /* renamed from: f */
    public int f142782f;

    /* renamed from: g */
    public String f142783g;

    /* renamed from: h */
    public boolean f142784h;

    static {
        Covode.recordClassIndex(73739);
    }

    /* renamed from: a */
    public final void mo100911a() {
        VideoUrlModel playAddr;
        int i;
        AbstractC48149ai aiVar = this.f142777a;
        if (aiVar != null && aiVar.mo80206b() != null && this.f142779c != null && this.f142781e != null && f142776i < C62925d.m113345a() && (playAddr = this.f142779c.getPlayAddr()) != null) {
            try {
                i = C84116g.m144637f();
            } catch (Exception e) {
                e.printStackTrace();
                i = 0;
            }
            boolean c = C49301e.m92370c(this.f142777a.mo80206b().getAid());
            boolean userVisibleHint = this.f142781e.getUserVisibleHint();
            int i2 = this.f142782f;
            int a = C50542j.m94755a(this.f142777a.mo80206b());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C1731i.m5640b(new CallableC62906f(this, userVisibleHint, i, a, playAddr, c, this.f142777a.mo80206b().getAid(), i2, C49907s.m93688b(), C49907s.f115050b.name(), this.f142777a.mo80206b(), C49907s.m93689c(), elapsedRealtime), C39162r.m79452a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.e$a */
    public static class C62905a {

        /* renamed from: a */
        public final C62904e f142785a = new C62904e();

        static {
            Covode.recordClassIndex(73740);
        }

        /* renamed from: a */
        public final C62905a mo100912a(int i) {
            this.f142785a.f142782f = i;
            return this;
        }

        /* renamed from: b */
        public final C62905a mo100918b(String str) {
            this.f142785a.f142780d = str;
            return this;
        }

        /* renamed from: c */
        public final C62905a mo100919c(String str) {
            this.f142785a.f142783g = str;
            return this;
        }

        /* renamed from: a */
        public final C62905a mo100913a(Fragment fragment) {
            this.f142785a.f142781e = fragment;
            return this;
        }

        /* renamed from: a */
        public final C62905a mo100914a(AbstractC48149ai aiVar) {
            this.f142785a.f142777a = aiVar;
            return this;
        }

        /* renamed from: a */
        public final C62905a mo100915a(Video video) {
            this.f142785a.f142779c = video;
            return this;
        }

        /* renamed from: a */
        public final C62905a mo100916a(String str) {
            this.f142785a.f142778b = str;
            return this;
        }

        /* renamed from: a */
        public final C62905a mo100917a(boolean z) {
            this.f142785a.f142784h = z;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo100910a(boolean z, int i, int i2, VideoUrlModel videoUrlModel, boolean z2, String str, int i3, String str2, String str3, Aweme aweme, long j, long j2) {
        int i4;
        int i5;
        C39163s a = new C39163s().mo67941a("request_id", this.f142780d).mo67941a("duration", this.f142778b);
        if (!z) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        C39163s a2 = a.mo67941a("is_success", String.valueOf(i4)).mo67941a("internet_speed", String.valueOf(i)).mo67941a("video_quality", String.valueOf(i2)).mo67941a("is_cache", String.valueOf(C80662ac.m139889a(videoUrlModel) ? 1 : 0));
        if (z2) {
            i5 = -1;
        } else if (C59227a.f135144a) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        JSONObject a3 = a2.mo67941a("is_first", String.valueOf(i5)).mo67941a("group_id", str).mo67941a("status", String.valueOf(i3)).mo67941a("is_from_feed_cache", String.valueOf(z2 ? 1 : 0)).mo67941a("top_activity", str2).mo67941a("feed_tab", str3).mo67941a("play_sess", String.valueOf(this.f142783g)).mo67941a("is_audio_mode", String.valueOf(this.f142784h ? 1 : 0)).mo67941a("has_tts", Integer.toString(C50532ah.m94733i(aweme))).mo67941a("has_cla", Integer.toString(C50532ah.m94732h(aweme))).mo67942a();
        if (!z2) {
            C59227a.f135144a = false;
        }
        C39162r.onEvent(MobClick.obtain().setEventName("video_request_response").setLabelName("perf_monitor").setValue(str).setJsonObject(a3));
        C39162r.m79461a("video_request_response", a3);
        C34888b.m71266b("video_request_response", a3);
        long j3 = 0;
        if (j > 0) {
            j3 = j2 - j;
        }
        String l = Long.toString(j3);
        if (!C59227a.m108850a()) {
            C1731i.m5640b(new CallableC59228b(a3, "video_request_response", "duration", l, C17867d.m33078a()), C1731i.f5562a);
        }
        f142776i++;
        return null;
    }
}

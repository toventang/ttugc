package com.p2082ss.android.ugc.aweme.video.simplayer.p4226b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.p2397bm.C34888b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.aweme.video.simplayer.C81027s;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4225a.C80992a;
import com.p2082ss.android.ugc.aweme.video.util.C81078d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.b.b */
public final class C80996b {

    /* renamed from: b */
    public static boolean f181044b;

    /* renamed from: a */
    public int f181045a = 1;

    /* renamed from: c */
    public C81079v f181046c;

    /* renamed from: d */
    public boolean f181047d;

    /* renamed from: e */
    private long f181048e = -1;

    /* renamed from: f */
    private long f181049f = -1;

    /* renamed from: g */
    private Object f181050g = new Object();

    /* renamed from: h */
    private volatile boolean f181051h = false;

    /* renamed from: i */
    private AbstractC63051l f181052i;

    /* renamed from: j */
    private volatile boolean f181053j = false;

    /* renamed from: k */
    private final Object f181054k = new Object();

    static {
        Covode.recordClassIndex(94314);
    }

    /* renamed from: a */
    public final void mo124434a(boolean z) {
        MethodCollector.m26663i(3598);
        if (C80695q.m139908a()) {
            C34888b.m71265a("coldstartplayer", "preCreateNextSessionPlayer : force " + z + ", mNextSessionCreateLock:" + this.f181053j);
        }
        if (!this.f181053j) {
            synchronized (this.f181054k) {
                try {
                    if (!this.f181053j) {
                        if (z || C16048b.m29633a().mo25412a(true, "feed_cold_start_precreate_prerender_session", 0) != 0) {
                            if (this.f181046c.mo123894q() == null && !this.f181046c.f181205b) {
                                this.f181052i.mo101003b(new C80992a());
                            }
                            this.f181053j = true;
                        } else {
                            return;
                        }
                    }
                    MethodCollector.m26664o(3598);
                } finally {
                    MethodCollector.m26664o(3598);
                }
            }
        } else {
            MethodCollector.m26664o(3598);
        }
    }

    /* renamed from: a */
    public final void mo124433a(Aweme aweme) {
        if (C16048b.m29633a().mo25412a(true, "feed_cold_start_enable_prerender", 0) != 1) {
            if (C80695q.m139908a()) {
                C34888b.m71265a("PreCreateHelper", "tryPrepareVideo2FirstStart aweme:".concat(String.valueOf(aweme)));
            }
            mo124435b(true);
            if (this.f181045a == 2 && aweme != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f181048e = -1;
                Video video = aweme.getVideo();
                C80942a.m140472a(C81027s.m140679a(C80942a.m140477a(video))).setSourceId(aweme.getAid());
                this.f181046c.mo123923a(video, aweme.getAudio(), C81078d.m140774a(aweme), false);
                this.f181045a = 3;
                f181044b = true;
                if (C16048b.m29633a().mo25412a(true, "enable_player_pre_create_pause", 1) == 1) {
                    this.f181052i.mo101012f();
                }
                this.f181048e = SystemClock.elapsedRealtime() - elapsedRealtime;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("create_time", this.f181049f);
                    jSONObject.put("prepare_time", this.f181048e);
                    C39162r.m79461a("pre_create_player", jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo124435b(boolean z) {
        MethodCollector.m26663i(3610);
        if (C80695q.m139908a()) {
            C34888b.m71265a("PreCreateHelper", "preCreatePlayer force:" + z + ", mPreloaded:" + this.f181051h);
        }
        if (!this.f181051h) {
            synchronized (this.f181050g) {
                try {
                    if (!this.f181051h) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (z || C16048b.m29633a().mo25412a(true, "player_precreateplayer", 0) == 1) {
                            this.f181049f = -1;
                            if (this.f181045a == 1 && this.f181046c.mo123894q() == null && !this.f181046c.f181205b) {
                                this.f181052i.mo100989a(new C80992a());
                                this.f181052i.mo100999b();
                                this.f181045a = 2;
                            }
                            this.f181049f = SystemClock.elapsedRealtime() - elapsedRealtime;
                            this.f181051h = true;
                        } else {
                            this.f181051h = true;
                            return;
                        }
                    }
                    MethodCollector.m26664o(3610);
                } finally {
                    MethodCollector.m26664o(3610);
                }
            }
        } else {
            MethodCollector.m26664o(3610);
        }
    }

    public C80996b(C81079v vVar, AbstractC63051l lVar) {
        this.f181046c = vVar;
        this.f181052i = lVar;
    }
}

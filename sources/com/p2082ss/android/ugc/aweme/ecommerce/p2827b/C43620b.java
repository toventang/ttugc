package com.p2082ss.android.ugc.aweme.ecommerce.p2827b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50542j;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80250bk;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.b.b */
public final class C43620b {

    /* renamed from: a */
    static long f101680a = -1;

    /* renamed from: b */
    public static final C43620b f101681b = new C43620b();

    private C43620b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.b$d */
    static final class CallableC43624d<V> implements Callable {

        /* renamed from: a */
        public static final CallableC43624d f101691a = new CallableC43624d();

        static {
            Covode.recordClassIndex(51882);
        }

        CallableC43624d() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enter_from", "TEMAI");
                C39162r.m79461a("video_request", jSONObject);
            } catch (Exception e) {
                C51423a.m95786a(e);
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(51878);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.b$b */
    static final class CallableC43622b<V> implements Callable {

        /* renamed from: a */
        public static final CallableC43622b f101688a = new CallableC43622b();

        static {
            Covode.recordClassIndex(51880);
        }

        CallableC43622b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime() - C43620b.f101680a;
                if (C43620b.f101680a != -1 && elapsedRealtime > 80) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", elapsedRealtime);
                    jSONObject.put("enter_from", "TEMAI");
                    C39162r.m79461a("video_block", jSONObject);
                }
                C43620b.f101680a = -1;
            } catch (Exception e) {
                C51423a.m95786a(e);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.b$a */
    static final class CallableC43621a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Video f101682a;

        /* renamed from: b */
        final /* synthetic */ C84216o f101683b;

        /* renamed from: c */
        final /* synthetic */ long f101684c;

        /* renamed from: d */
        final /* synthetic */ int f101685d;

        /* renamed from: e */
        final /* synthetic */ int f101686e;

        /* renamed from: f */
        final /* synthetic */ int f101687f;

        static {
            Covode.recordClassIndex(51879);
        }

        CallableC43621a(Video video, C84216o oVar, long j, int i, int i2, int i3) {
            this.f101682a = video;
            this.f101683b = oVar;
            this.f101684c = j;
            this.f101685d = i;
            this.f101686e = i2;
            this.f101687f = i3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Integer num;
            try {
                VideoUrlModel playAddr = this.f101682a.getPlayAddr();
                int videoLength = this.f101682a.getVideoLength();
                int b = C50542j.m94757b(playAddr);
                int f = C84116g.m144637f();
                int b2 = C80662ac.m139890b(this.f101682a.getPlayAddr()) / 1024;
                boolean isBytevc1 = this.f101683b.isBytevc1();
                if (C80250bk.f179733b != null) {
                    num = C80250bk.f179733b;
                } else {
                    num = -1;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", this.f101684c);
                jSONObject.put("vduration", ((long) videoLength) * 1000);
                jSONObject.put("video_quality", b);
                jSONObject.put("internet_speed", f);
                jSONObject.put("pre_cache_size", b2);
                jSONObject.put("video_bitrate", this.f101685d);
                jSONObject.put("play_bitrate", this.f101686e);
                jSONObject.put("is_bytevc1", isBytevc1);
                jSONObject.put("codec_name", this.f101687f);
                C89219l.m154716b(num, "");
                jSONObject.put("cpu_rate", num.intValue());
                jSONObject.put("enter_from", "TEMAI");
                C39162r.m79461a("video_play_quality", jSONObject);
            } catch (Exception e) {
                C51423a.m95786a(e);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.b$c */
    static final class CallableC43623c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Video f101689a;

        /* renamed from: b */
        final /* synthetic */ C84208l f101690b;

        static {
            Covode.recordClassIndex(51881);
        }

        CallableC43623c(Video video, C84208l lVar) {
            this.f101689a = video;
            this.f101690b = lVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            String videoUrlModel;
            try {
                int videoLength = this.f101689a.getVideoLength();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", String.valueOf(this.f101690b.f188035d));
                jSONObject.put("error_internal_code", String.valueOf(this.f101690b.f188036e));
                jSONObject.put("error_info", this.f101690b.f188037f.toString());
                int i2 = 1;
                if (this.f101690b.f188033b) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_bytevc1", String.valueOf(i));
                if (!this.f101690b.f188034c) {
                    i2 = 0;
                }
                jSONObject.put("is_dash", String.valueOf(i2));
                jSONObject.put("is_ad", "0");
                jSONObject.put("vduration", ((long) videoLength) * 1000);
                jSONObject.put("internet_speed", String.valueOf(C84116g.m144637f()));
                jSONObject.put("cache_size", String.valueOf(C80662ac.m139893c(this.f101689a.getPlayAddr())));
                jSONObject.put("video_size", String.valueOf(C80662ac.m139896d(this.f101689a.getPlayAddr())));
                if (this.f101689a.getPlayAddr() == null) {
                    videoUrlModel = "null";
                } else {
                    videoUrlModel = this.f101689a.getPlayAddr().toString();
                    C89219l.m154716b(videoUrlModel, "");
                }
                jSONObject.put("play_url", videoUrlModel);
                jSONObject.put("is_from_feed_cache", "0");
                jSONObject.put("enter_from", "TEMAI");
                C39162r.m79461a("video_play_failed", jSONObject);
            } catch (Exception e) {
                C51423a.m95786a(e);
            }
            return C89391z.f203057a;
        }
    }
}

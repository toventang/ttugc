package com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20729f;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.ui.a.b */
public final class C57359b {

    /* renamed from: a */
    public static final C57359b f130745a = new C57359b();

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.a.b$a */
    public interface AbstractC57360a {
        static {
            Covode.recordClassIndex(67278);
        }
    }

    private C57359b() {
    }

    static {
        Covode.recordClassIndex(67277);
    }

    /* renamed from: a */
    public static boolean m103967a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.a.b$b */
    public static final class C57361b implements AbstractC20729f {

        /* renamed from: a */
        final /* synthetic */ boolean f130746a = false;

        /* renamed from: b */
        final /* synthetic */ C34602l f130747b;

        /* renamed from: c */
        final /* synthetic */ Video f130748c;

        static {
            Covode.recordClassIndex(67279);
        }

        C57361b(C34602l lVar, Video video) {
            this.f130747b = lVar;
            this.f130748c = video;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20729f
        /* renamed from: a */
        public final void mo34151a(final int i) {
            C1731i.m5640b(new Callable(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.C57359b.C57361b.CallableC573621 */

                /* renamed from: a */
                final /* synthetic */ C57361b f130749a;

                static {
                    Covode.recordClassIndex(67280);
                }

                {
                    this.f130749a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (this.f130749a.f130746a && i >= 6 && !this.f130749a.f130747b.mo61062a() && this.f130749a.f130748c.getPlayAddr() != null) {
                        VideoUrlModel playAddr = this.f130749a.f130748c.getPlayAddr();
                        C89219l.m154716b(playAddr, "");
                        if (!TextUtils.isEmpty(playAddr.getUri())) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("frames", i);
                                VideoUrlModel playAddr2 = this.f130749a.f130748c.getPlayAddr();
                                C89219l.m154716b(playAddr2, "");
                                jSONObject.put("vid", playAddr2.getUri());
                                jSONObject.put("url", this.f130749a.f130747b.f81655b.get(0));
                                C34611o.m70668a("aweme_animated_image_frames_error", jSONObject);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    return null;
                }
            }, C40780g.m82246c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.a.b$c */
    public static final class C57363c extends AbstractC20727d {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f130751a;

        /* renamed from: b */
        final /* synthetic */ AbstractC57360a f130752b;

        /* renamed from: c */
        final /* synthetic */ boolean f130753c = true;

        /* renamed from: d */
        final /* synthetic */ UrlModel f130754d;

        /* renamed from: e */
        final /* synthetic */ C34602l f130755e;

        /* renamed from: f */
        final /* synthetic */ Video f130756f;

        /* renamed from: g */
        final /* synthetic */ boolean f130757g;

        static {
            Covode.recordClassIndex(67281);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            String str;
            if (this.f130757g && !this.f130755e.mo61062a() && this.f130756f.getPlayAddr() != null) {
                VideoUrlModel playAddr = this.f130756f.getPlayAddr();
                C89219l.m154716b(playAddr, "");
                if (!TextUtils.isEmpty(playAddr.getUri())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("frames", -1);
                        VideoUrlModel playAddr2 = this.f130756f.getPlayAddr();
                        C89219l.m154716b(playAddr2, "");
                        jSONObject.put("vid", playAddr2.getUri());
                        jSONObject.put("url", this.f130755e.f81655b.get(0));
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = null;
                        }
                        jSONObject.put("errMsg", str);
                        C34611o.m70668a("aweme_animated_image_frames_error", jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            this.f130751a.setUserVisibleHint(true);
            if (this.f130753c) {
                this.f130751a.mo34197b();
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(this.f130754d.getUri());
            urlModel.setUrlList(this.f130755e.f81655b);
            this.f130756f.setCachedOuterCoverUrl(urlModel);
        }

        C57363c(SmartImageView smartImageView, AbstractC57360a aVar, UrlModel urlModel, C34602l lVar, Video video) {
            this.f130751a = smartImageView;
            this.f130752b = aVar;
            this.f130754d = urlModel;
            this.f130755e = lVar;
            this.f130756f = video;
            this.f130757g = false;
        }
    }
}

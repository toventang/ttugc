package com.p2082ss.android.ugc.aweme.livewallpaper.p3414b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.app.p2324e.C33730a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58893b;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.LiveWallPaperPreviewActivity;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.b */
public final class C58833b extends AbstractC58829a {
    static {
        Covode.recordClassIndex(69147);
    }

    /* renamed from: i */
    private static boolean m108056i() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a
    /* renamed from: e */
    public final void mo96234e() {
        mo96240c(this.f133924h);
        C58901f.m108232b(0, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a
    /* renamed from: f */
    public final void mo96235f() {
        mo96226a();
        C29339a.m58754b(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58833b.RunnableC588341 */

            static {
                Covode.recordClassIndex(69148);
            }

            public final void run() {
                if (C58833b.this.f133918b != null && !C58833b.this.f133918b.isFinishing()) {
                    C58833b.this.mo96229b();
                    new C79459a(C58833b.this.f133918b).mo123050a(R.string.bba).mo123053a();
                }
            }
        });
    }

    /* renamed from: g */
    public final void mo96241g() {
        C29339a.m58754b(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58833b.RunnableC588396 */

            static {
                Covode.recordClassIndex(69153);
            }

            public final void run() {
                C58833b.this.mo96229b();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a
    /* renamed from: d */
    public final String mo96233d() {
        if (this.f133918b == null || this.f133918b.isFinishing()) {
            return "";
        }
        return this.f133918b.getString(R.string.cxb);
    }

    /* renamed from: h */
    private void m108055h() {
        if (C58901f.m108228a(this.f133918b, this.f133918b.getPackageName())) {
            C58895d.f134069e.mo96318a("video_share", new C58893b(this.f133917a.getAid()));
        } else if (this.f133918b instanceof ActivityC17312a) {
            ((ActivityC17312a) this.f133918b).activityConfiguration(new C58841c(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a
    /* renamed from: c */
    public final void mo96232c() {
        this.f133921e = C58901f.m108219a();
        this.f133922f = C13607d.m24442b(this.f133917a.getVideo().getPlayAddrH264().getUri());
        this.f133924h = this.f133921e + this.f133922f + ".mp4";
        this.f133923g = this.f133921e + "temp/";
        if (!C80720e.m139927b(this.f133923g)) {
            C80720e.m139917a(this.f133923g, false);
        }
    }

    public C58833b(Activity activity) {
        super(activity);
        this.f133918b = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo96238a(int i) {
        if (i == 100 && C58901f.m108228a(this.f133918b, this.f133918b.getPackageName())) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.hay).mo123053a();
            C58901f.m108224a(this.f133917a.getAid(), "share", true);
            C58901f.m108220a(0, "");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a
    /* renamed from: b */
    public final boolean mo96231b(Aweme aweme) {
        VideoUrlModel playAddrH264;
        String str;
        Video video = aweme.getVideo();
        if (video == null || (playAddrH264 = video.getPlayAddrH264()) == null) {
            return false;
        }
        List<String> urlList = playAddrH264.getUrlList();
        if (C13603b.m24435a((Collection) urlList)) {
            return false;
        }
        if (urlList.size() > 2) {
            str = urlList.get(2);
        } else {
            str = urlList.get(0);
        }
        this.f133920d = C33730a.m69052a(aweme, str);
        if (!TextUtils.isEmpty(this.f133920d)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a
    /* renamed from: b */
    public final void mo96230b(String str) {
        if (str != null) {
            this.f133923g = str;
            if (str.length() == 0) {
                C51423a.m95790a((Throwable) new Exception("LiveWallPaperHelper download file size == 0: " + this.f133920d));
                mo96235f();
                C58901f.m108232b(1, "file size == 0");
                return;
            }
            String trim = str.trim();
            this.f133924h = this.f133921e + trim.substring(trim.lastIndexOf("/") + 1);
            C80720e.m139932c(str, this.f133924h);
            mo96226a();
            C29339a.m58754b(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58833b.RunnableC588352 */

                static {
                    Covode.recordClassIndex(69149);
                }

                public final void run() {
                    C58833b.this.mo96229b();
                    C58833b bVar = C58833b.this;
                    bVar.mo96240c(bVar.f133924h);
                }
            });
            C58901f.m108232b(0, "");
        }
    }

    /* renamed from: c */
    public final void mo96239c(final Aweme aweme) {
        UrlModel cover;
        if (aweme != null && !C58901f.m108226a(this.f133918b, aweme.getAid(), aweme)) {
            if (this.f133918b != null && !this.f133918b.isFinishing()) {
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m108056i();
                }
                if (!C58029j.f132256h) {
                    new C79459a(this.f133918b).mo123052a(this.f133918b.getString(R.string.fg_)).mo123053a();
                    return;
                }
            }
            Video video = aweme.getVideo();
            if (video != null && (cover = video.getCover()) != null) {
                mo96228a(mo96233d());
                C34577e.m70590a(cover, new C34577e.AbstractC34582a() {
                    /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58833b.C588363 */

                    static {
                        Covode.recordClassIndex(69150);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.base.C34577e.AbstractC34582a
                    /* renamed from: a */
                    public final void mo61037a() {
                        C58833b bVar = C58833b.this;
                        Aweme aweme = aweme;
                        if (aweme == null || aweme.getVideo() == null) {
                            bVar.mo96241g();
                            C58901f.m108232b(1, "aweme is empty");
                            return;
                        }
                        UrlModel cover = aweme.getVideo().getCover();
                        if (cover == null) {
                            bVar.mo96241g();
                            C58901f.m108232b(1, "cover is empty");
                            return;
                        }
                        C1731i.m5640b(new Callable<Boolean>(cover, aweme) {
                            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58833b.CallableC588385 */

                            /* renamed from: a */
                            final /* synthetic */ UrlModel f133936a;

                            /* renamed from: b */
                            final /* synthetic */ Aweme f133937b;

                            static {
                                Covode.recordClassIndex(69152);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Boolean call() {
                                int lastIndexOf;
                                List<String> urlList = this.f133936a.getUrlList();
                                if (C13603b.m24435a((Collection) urlList)) {
                                    C58833b.this.mo96241g();
                                    C58901f.m108232b(1, "urlList is empty");
                                } else {
                                    for (String str : urlList) {
                                        if (str != null) {
                                            String a = C34577e.m70588a(str);
                                            if (C80720e.m139927b(a) && (lastIndexOf = a.lastIndexOf("/") + 1) >= 0 && lastIndexOf < a.length()) {
                                                String substring = a.substring(lastIndexOf);
                                                if (!TextUtils.isEmpty(substring)) {
                                                    String str2 = C58901f.m108219a() + substring;
                                                    if (C80720e.m139927b(str2) || C80720e.m139932c(a, str2)) {
                                                        C29339a.m58754b(new Runnable(str2, this.f133937b) {
                                                            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58833b.RunnableC588407 */

                                                            /* renamed from: a */
                                                            final /* synthetic */ String f133940a;

                                                            /* renamed from: b */
                                                            final /* synthetic */ Aweme f133941b;

                                                            static {
                                                                Covode.recordClassIndex(69154);
                                                            }

                                                            public final void run() {
                                                                C58895d.f134069e.f134072c.setThumbnailPath(this.f133940a);
                                                                C58833b.this.mo96227a(this.f133941b);
                                                            }

                                                            {
                                                                this.f133940a = r2;
                                                                this.f133941b = r3;
                                                            }
                                                        });
                                                        return true;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                                return false;
                            }

                            {
                                this.f133936a = r2;
                                this.f133937b = r3;
                            }
                        }, C1731i.f5562a).mo5532a((AbstractC1729g) new AbstractC1729g<Boolean, Object>() {
                            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.C58833b.C588374 */

                            static {
                                Covode.recordClassIndex(69151);
                            }

                            @Override // p077b.AbstractC1729g
                            public final Object then(C1731i<Boolean> iVar) {
                                if (iVar != null && iVar.mo5545d().booleanValue()) {
                                    return null;
                                }
                                C58833b.this.mo96241g();
                                C58901f.m108232b(1, "copy video thumbnail fail");
                                return null;
                            }
                        });
                    }

                    @Override // com.p2082ss.android.ugc.aweme.base.C34577e.AbstractC34582a
                    /* renamed from: a */
                    public final void mo61038a(Exception exc) {
                        if (C58833b.this.f133918b != null && !C58833b.this.f133918b.isFinishing()) {
                            new C79459a(C58833b.this.f133918b).mo123050a(R.string.bba).mo123053a();
                            C58833b.this.mo96229b();
                            C58901f.m108232b(1, "request image fail " + exc.getMessage());
                        }
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public final void mo96240c(String str) {
        int i;
        int i2;
        if (this.f133918b != null && !this.f133918b.isFinishing() && C80720e.m139927b(str) && this.f133917a != null) {
            Video video = this.f133917a.getVideo();
            boolean z = false;
            if (video != null) {
                i2 = video.getWidth();
                i = video.getHeight();
            } else {
                i = 0;
                i2 = 0;
            }
            C58895d.f134069e.f134072c.setId(this.f133917a.getAid());
            C58895d.f134069e.f134072c.setVideoPath(str);
            C58895d.f134069e.f134072c.setWidth(i2);
            C58895d.f134069e.f134072c.setHeight(i);
            C58895d.f134069e.f134072c.setSource("video_share");
            C58895d.f134069e.f134072c.setVolume(0.0f);
            Music music = this.f133917a.getMusic();
            if ((music != null && music.isPgc()) || C68863ah.f154027a.mo109411a(this.f133917a)) {
                z = true;
            }
            C58895d.f134069e.f134072c.setShouldMute(z);
            m108055h();
            C58895d.f134069e.mo96315a();
            m108054a(this.f133918b, C58895d.f134069e.f134072c);
        }
    }

    /* renamed from: a */
    private static void m108053a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static void m108054a(Context context, LiveWallPaperBean liveWallPaperBean) {
        Intent intent = new Intent(context, LiveWallPaperPreviewActivity.class);
        intent.putExtra("live_wall_paper", liveWallPaperBean);
        intent.putExtra("hide_more_button", true);
        intent.putExtra("from", "share");
        m108053a(context, intent);
    }
}

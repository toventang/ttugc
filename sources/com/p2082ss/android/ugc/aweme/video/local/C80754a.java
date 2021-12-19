package com.p2082ss.android.ugc.aweme.video.local;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30426r;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.video.local.a */
public final class C80754a {

    /* renamed from: c */
    public static int f180559c = -1;

    /* renamed from: d */
    public static final C80755a f180560d = new C80755a((byte) 0);

    /* renamed from: e */
    private static final String f180561e = "DownloaderVideoWrapper";

    /* renamed from: f */
    private static final Map<String, Integer> f180562f = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public int f180563a = -1;

    /* renamed from: b */
    public AbsDownloadListener f180564b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.local.a$c */
    public static final class C80757c implements AbstractC30426r {

        /* renamed from: a */
        public static final C80757c f180570a = new C80757c();

        static {
            Covode.recordClassIndex(94048);
        }

        C80757c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.a$a */
    public static final class C80755a {
        static {
            Covode.recordClassIndex(94046);
        }

        private C80755a() {
        }

        public /* synthetic */ C80755a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.a$b */
    public static final class C80756b implements LocalVideoPlayerManager.AbstractC80753a {

        /* renamed from: a */
        final /* synthetic */ C80754a f180565a;

        /* renamed from: b */
        final /* synthetic */ Context f180566b;

        /* renamed from: c */
        final /* synthetic */ String f180567c;

        /* renamed from: d */
        final /* synthetic */ String f180568d;

        /* renamed from: e */
        final /* synthetic */ String f180569e;

        static {
            Covode.recordClassIndex(94047);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.AbstractC80753a
        /* renamed from: a */
        public final void mo96628a() {
            this.f180565a.mo123965a(this.f180566b, this.f180567c, this.f180568d, this.f180569e);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.AbstractC80753a
        /* renamed from: a */
        public final void mo96629a(String str) {
            C89219l.m154721d(str, "");
            File file = new File(str);
            RuntimeBehaviorServiceImpl.m94812c().mo85865a("download_success");
            DownloadInfo downloadInfo = new DownloadInfo();
            DownloadInfo.C30585a aVar = new DownloadInfo.C30585a();
            downloadInfo.setCurBytes(file.length());
            downloadInfo.setTotalBytes(file.length());
            AbsDownloadListener absDownloadListener = this.f180565a.f180564b;
            if (absDownloadListener != null) {
                absDownloadListener.onProgress(downloadInfo);
            }
            String str2 = File.separator;
            C89219l.m154716b(str2, "");
            String i = C89361p.m154938i(str, str2);
            String str3 = File.separator;
            C89219l.m154716b(str3, "");
            String h = C89361p.m154936h(str, str3);
            AbsDownloadListener absDownloadListener2 = this.f180565a.f180564b;
            if (absDownloadListener2 != null) {
                aVar.f72961a = i;
                aVar.f72964d = h;
                absDownloadListener2.onSuccessed(aVar.mo54673a());
            }
        }

        C80756b(C80754a aVar, Context context, String str, String str2, String str3) {
            this.f180565a = aVar;
            this.f180566b = context;
            this.f180567c = str;
            this.f180568d = str2;
            this.f180569e = str3;
        }
    }

    /* renamed from: a */
    private static List<HttpHeader> m140070a() {
        return C89070n.m154516a(new HttpHeader("downloader_scene", "video"));
    }

    static {
        Covode.recordClassIndex(94045);
    }

    /* renamed from: a */
    public final void mo123967a(AbsDownloadListener absDownloadListener) {
        C89219l.m154721d(absDownloadListener, "");
        this.f180564b = absDownloadListener;
    }

    /* renamed from: a */
    public final void mo123964a(Context context) {
        C89219l.m154721d(context, "");
        DownloadServiceManager.INSTANCE.getDownloadService().getPageLifeMonitor(this.f180563a).mo29100a();
    }

    /* renamed from: a */
    public final void mo123965a(Context context, String str, String str2, String str3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.f100626c = str2;
        AbstractC43167a a = with.mo73401a(m140070a());
        a.f100629f = str3;
        AbstractC43167a a2 = a.mo73399a(DownloadServiceManager.INSTANCE.getRetryExpCount());
        a2.f100600C = this.f180564b;
        int a3 = a2.mo73400a("feed_video").mo73396a(C80757c.f180570a);
        this.f180563a = a3;
        f180559c = a3;
    }

    /* renamed from: a */
    public final void mo123966a(Context context, String str, String str2, String str3, String str4) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        if (!LocalVideoPlayerManager.m140055a().mo123961a(str, str4 + str3, new C80756b(this, context, str2, str3, str4))) {
            mo123965a(context, str2, str3, str4);
        }
    }
}

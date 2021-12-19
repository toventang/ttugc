package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.C70762ea;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70464i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70406a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b */
public final class C70428b {

    /* renamed from: j */
    public static final C70429a f157376j = new C70429a((byte) 0);

    /* renamed from: a */
    Context f157377a;

    /* renamed from: b */
    public int f157378b;

    /* renamed from: c */
    final ArrayList<String> f157379c = new ArrayList<>();

    /* renamed from: d */
    final ArrayList<String> f157380d = new ArrayList<>();

    /* renamed from: e */
    AbstractC70430b f157381e;

    /* renamed from: f */
    C70762ea f157382f;

    /* renamed from: g */
    public boolean f157383g;

    /* renamed from: h */
    final ArrayList<String> f157384h = new ArrayList<>();

    /* renamed from: i */
    public final HandlerC70432d f157385i = new HandlerC70432d(this, Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$b */
    public interface AbstractC70430b {
        static {
            Covode.recordClassIndex(82873);
        }

        /* renamed from: a */
        void mo110991a(C70762ea eaVar, boolean z);
    }

    static {
        Covode.recordClassIndex(82871);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$a */
    public static final class C70429a {
        static {
            Covode.recordClassIndex(82872);
        }

        private C70429a() {
        }

        public /* synthetic */ C70429a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo110993a() {
        if (this.f157378b >= this.f157379c.size()) {
            AbstractC70430b bVar = this.f157381e;
            if (bVar != null) {
                bVar.mo110991a(this.f157382f, this.f157383g);
            }
            this.f157385i.removeCallbacksAndMessages(null);
            return;
        }
        String str = this.f157379c.get(this.f157378b);
        String str2 = this.f157380d.get(this.f157378b);
        String str3 = this.f157384h.get(this.f157378b);
        C89219l.m154716b(str3, "");
        String str4 = str3;
        if (TextUtils.isEmpty(str)) {
            this.f157385i.sendEmptyMessage(1);
        } else if (C80720e.m139927b(str2)) {
            this.f157383g |= true;
            this.f157385i.sendEmptyMessage(1);
        } else {
            C70418a.m124205a(this.f157377a, this.f157379c.get(this.f157378b), this.f157380d.get(this.f157378b), new C70431c(this, str, str4));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$c */
    public static final class C70431c extends C70406a {

        /* renamed from: a */
        final /* synthetic */ C70428b f157386a;

        /* renamed from: b */
        final /* synthetic */ String f157387b;

        /* renamed from: c */
        final /* synthetic */ String f157388c;

        static {
            Covode.recordClassIndex(82874);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70406a
        public final void onSuccessed(DownloadInfo downloadInfo) {
            this.f157386a.f157385i.sendEmptyMessage(1);
            this.f157386a.f157383g = true;
            C70464i.m124296a(true, this.f157387b, this.f157388c, null);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70406a
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            this.f157386a.f157385i.sendEmptyMessage(1);
            C70464i.m124296a(false, this.f157387b, this.f157388c, baseException);
        }

        C70431c(C70428b bVar, String str, String str2) {
            this.f157386a = bVar;
            this.f157387b = str;
            this.f157388c = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$d */
    public static final class HandlerC70432d extends Handler {

        /* renamed from: a */
        final /* synthetic */ C70428b f157389a;

        static {
            Covode.recordClassIndex(82875);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what == 1) {
                this.f157389a.f157378b++;
                this.f157389a.mo110993a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC70432d(C70428b bVar, Looper looper) {
            super(looper);
            this.f157389a = bVar;
        }
    }
}

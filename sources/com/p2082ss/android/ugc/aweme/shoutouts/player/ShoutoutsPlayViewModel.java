package com.p2082ss.android.ugc.aweme.shoutouts.player;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74438b;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74439c;
import com.p2082ss.android.ugc.aweme.utils.C80408et;
import java.util.List;
import p078c.p080b.C1757e;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel */
public final class ShoutoutsPlayViewModel extends JediViewModel<ShoutoutsPlayState> {

    /* renamed from: a */
    public final C1213t<C74438b> f167474a = new C1213t<>();

    /* renamed from: b */
    int f167475b = -1;

    /* renamed from: c */
    private final C74476b f167476c = new C74476b(this);

    static {
        Covode.recordClassIndex(87275);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ ShoutoutsPlayState mo23027d() {
        return new ShoutoutsPlayState(0, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel$b */
    public static final class C74476b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayViewModel f167478a;

        static {
            Covode.recordClassIndex(87277);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74476b(ShoutoutsPlayViewModel shoutoutsPlayViewModel) {
            this.f167478a = shoutoutsPlayViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel$b$c */
        static final class C74479c extends AbstractC89220m implements AbstractC89172b<ShoutoutsPlayState, ShoutoutsPlayState> {

            /* renamed from: a */
            final /* synthetic */ int f167481a;

            static {
                Covode.recordClassIndex(87280);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C74479c(int i) {
                super(1);
                this.f167481a = i;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
                ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
                C89219l.m154721d(shoutoutsPlayState2, "");
                return shoutoutsPlayState2.copy(this.f167481a, EnumC74482a.DOWNLOADING);
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            this.f167478a.mo33689c(C74477a.f167479a);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            C89219l.m154721d(downloadInfo, "");
            super.onSuccessed(downloadInfo);
            this.f167478a.mo33689c(C74480d.f167482a);
        }

        /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel$b$a */
        static final class C74477a extends AbstractC89220m implements AbstractC89172b<ShoutoutsPlayState, ShoutoutsPlayState> {

            /* renamed from: a */
            public static final C74477a f167479a = new C74477a();

            static {
                Covode.recordClassIndex(87278);
            }

            C74477a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
                ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
                C89219l.m154721d(shoutoutsPlayState2, "");
                return ShoutoutsPlayState.copy$default(shoutoutsPlayState2, 0, EnumC74482a.CANCEL, 1, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel$b$b */
        static final class C74478b extends AbstractC89220m implements AbstractC89172b<ShoutoutsPlayState, ShoutoutsPlayState> {

            /* renamed from: a */
            public static final C74478b f167480a = new C74478b();

            static {
                Covode.recordClassIndex(87279);
            }

            C74478b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
                ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
                C89219l.m154721d(shoutoutsPlayState2, "");
                return ShoutoutsPlayState.copy$default(shoutoutsPlayState2, 0, EnumC74482a.FAIL, 1, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel$b$d */
        static final class C74480d extends AbstractC89220m implements AbstractC89172b<ShoutoutsPlayState, ShoutoutsPlayState> {

            /* renamed from: a */
            public static final C74480d f167482a = new C74480d();

            static {
                Covode.recordClassIndex(87281);
            }

            C74480d() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
                ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
                C89219l.m154721d(shoutoutsPlayState2, "");
                return ShoutoutsPlayState.copy$default(shoutoutsPlayState2, 0, EnumC74482a.SUCCESS, 1, null);
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            C89219l.m154721d(downloadInfo, "");
            this.f167478a.mo33689c(new C74479c((int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f)));
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            this.f167478a.mo33689c(C74478b.f167480a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel$c */
    public static final class C74481c implements AbstractC88406ae<C74439c> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayViewModel f167483a;

        static {
            Covode.recordClassIndex(87282);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74481c(ShoutoutsPlayViewModel shoutoutsPlayViewModel) {
            this.f167483a = shoutoutsPlayViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C74439c cVar) {
            C74439c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            if (cVar2.f167402a == 0) {
                this.f167483a.f167474a.setValue(cVar2.f167404c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel$a */
    static final class C74475a extends AbstractC89220m implements AbstractC89172b<ShoutoutsPlayState, ShoutoutsPlayState> {

        /* renamed from: a */
        public static final C74475a f167477a = new C74475a();

        static {
            Covode.recordClassIndex(87276);
        }

        C74475a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
            ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
            C89219l.m154721d(shoutoutsPlayState2, "");
            return shoutoutsPlayState2.copy(0, EnumC74482a.PREPARED);
        }
    }

    /* renamed from: a */
    public final void mo117172a(Context context, Video video) {
        String str;
        UrlModel downloadAddr;
        List<String> urlList;
        C89219l.m154721d(context, "");
        if (video == null || (downloadAddr = video.getDownloadAddr()) == null || (urlList = downloadAddr.getUrlList()) == null) {
            str = null;
        } else {
            str = (String) C89070n.m154583g((List) urlList);
        }
        String str2 = C80408et.m139388a(str) + '_' + System.currentTimeMillis() + ".mp4";
        Uri b = C1757e.m5906b(context, str2, "video/mp4");
        AbstractC43167a a = DownloadServiceManager.INSTANCE.getDownloadService().with(str).mo73408e().mo73398a();
        a.f100629f = b.toString();
        a.f100626c = str2;
        a.mo73403a(this.f167476c.hashCode(), this.f167476c, EnumC30294h.SUB);
        this.f167475b = a.mo73409f();
    }
}

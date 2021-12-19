package com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength;

import android.app.Activity;
import android.view.Window;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.p2082ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker */
public final class VideoLengthChecker implements IVideoLengthChecker {
    static {
        Covode.recordClassIndex(84065);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker$a */
    static final class RunnableC71523a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f160297a;

        static {
            Covode.recordClassIndex(84066);
        }

        RunnableC71523a(Activity activity) {
            this.f160297a = activity;
        }

        public final void run() {
            new C79459a(this.f160297a).mo123050a(R.string.db3).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker$b */
    static final class RunnableC71524b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f160298a;

        static {
            Covode.recordClassIndex(84067);
        }

        RunnableC71524b(Activity activity) {
            this.f160298a = activity;
        }

        public final void run() {
            new C79459a(this.f160298a).mo123050a(R.string.db3).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker$c */
    static final class RunnableC71525c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f160299a;

        static {
            Covode.recordClassIndex(84068);
        }

        RunnableC71525c(Activity activity) {
            this.f160299a = activity;
        }

        public final void run() {
            new C79459a(this.f160299a).mo123050a(R.string.czq).mo123053a();
        }
    }

    /* renamed from: a */
    public static IVideoLengthChecker m126409a() {
        MethodCollector.m26663i(12424);
        Object a = C81908b.m141854a(IVideoLengthChecker.class, false);
        if (a != null) {
            IVideoLengthChecker iVideoLengthChecker = (IVideoLengthChecker) a;
            MethodCollector.m26664o(12424);
            return iVideoLengthChecker;
        }
        if (C81908b.f183371ea == null) {
            synchronized (IVideoLengthChecker.class) {
                try {
                    if (C81908b.f183371ea == null) {
                        C81908b.f183371ea = new VideoLengthChecker();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12424);
                    throw th;
                }
            }
        }
        VideoLengthChecker videoLengthChecker = (VideoLengthChecker) C81908b.f183371ea;
        MethodCollector.m26664o(12424);
        return videoLengthChecker;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker$d */
    static final class C71526d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f160300a;

        static {
            Covode.recordClassIndex(84069);
        }

        C71526d(VideoPublishEditModel videoPublishEditModel) {
            this.f160300a = videoPublishEditModel;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EditVideoInfoServiceImpl.m141997a().setVideoLength(this.f160300a.creationId, (long) ((AbstractC31071f) obj).mo56368j());
            EditVideoInfoServiceImpl.m141997a().setVideoInfoData(this.f160300a.creationId, new VideoInfoData(this.f160300a.voiceVolume, this.f160300a.musicVolume));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker$e */
    static final class C71527e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC72510a f160301a;

        /* renamed from: b */
        final /* synthetic */ FTCEditToolbarViewModel f160302b;

        static {
            Covode.recordClassIndex(84070);
        }

        C71527e(AbstractC72510a aVar, FTCEditToolbarViewModel fTCEditToolbarViewModel) {
            this.f160301a = aVar;
            this.f160302b = fTCEditToolbarViewModel;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC72510a aVar = this.f160301a;
            if (aVar != null) {
                AbstractC31071f value = aVar.mo114778C().getValue();
                if (value == null) {
                    C89219l.m154715b();
                }
                if (value.mo56368j() >= 61000) {
                    this.f160302b.mo88157d(1, false);
                    C71529w.m126419a("music", -1);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    /* renamed from: a */
    public final void mo113255a(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C69905c cVar = C70005cr.m123611a().f156482a;
        IInternalCommerceService h = AVCommerceServiceImpl.m102988h();
        C89219l.m154716b(h, "");
        boolean b = h.mo93965b();
        if (C71528a.m126416a(videoPublishEditModel) && b && cVar != null && !cVar.isCommerceMusic()) {
            C70005cr.m123611a().mo70083a((C69905c) null);
            C71528a.m126414a(videoPublishEditModel, "");
            Window window = activity.getWindow();
            C89219l.m154716b(window, "");
            window.getDecorView().post(new RunnableC71523a(activity));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    /* renamed from: a */
    public final void mo113256a(Activity activity, VideoPublishEditModel videoPublishEditModel, AbstractC82561d dVar) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(dVar, "");
        C69905c cVar = C70005cr.m123611a().f156482a;
        IInternalCommerceService h = AVCommerceServiceImpl.m102988h();
        C89219l.m154716b(h, "");
        boolean b = h.mo93965b();
        if (C71528a.m126416a(videoPublishEditModel) && b && cVar != null && (!cVar.isCommerceMusic() || C71528a.m126415a(cVar))) {
            C70005cr.m123611a().mo70083a((C69905c) null);
            C71528a.m126414a(videoPublishEditModel, "");
            dVar.mo127624ap().mo127274a();
            Window window = activity.getWindow();
            C89219l.m154716b(window, "");
            window.getDecorView().post(new RunnableC71524b(activity));
        } else if (C71528a.m126416a(videoPublishEditModel) && cVar != null && C71528a.m126415a(cVar)) {
            C70005cr.m123611a().mo70083a((C69905c) null);
            C71528a.m126414a(videoPublishEditModel, "");
            dVar.mo127624ap().mo127274a();
            Window window2 = activity.getWindow();
            C89219l.m154716b(window2, "");
            window2.getDecorView().post(new RunnableC71525c(activity));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    /* renamed from: a */
    public final void mo113258a(AbstractC72510a aVar, AbstractC1204m mVar, FTCEditToolbarViewModel fTCEditToolbarViewModel) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(fTCEditToolbarViewModel, "");
        if (aVar != null) {
            aVar.mo114778C().observe(mVar, new C71527e(aVar, fTCEditToolbarViewModel));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    /* renamed from: a */
    public final void mo113257a(VideoPublishEditModel videoPublishEditModel, AbstractC72510a aVar, AbstractC1204m mVar, EditToolbarViewModel editToolbarViewModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(editToolbarViewModel, "");
        if (aVar != null) {
            aVar.mo114778C().observe(mVar, new C71526d(videoPublishEditModel));
        }
    }
}

package com.p2082ss.android.ugc.aweme.ftc.pages;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.C0576b;
import androidx.core.graphics.drawable.AbstractC0706b;
import androidx.core.graphics.drawable.C0708d;
import androidx.core.p036g.C0692e;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.C43211i;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.ftc.p3028c.C51917c;
import com.p2082ss.android.ugc.aweme.ftc.p3042m.C52741a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69783m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.C69787n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71897c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71899e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3875u.C73298a;
import com.p2082ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.DialogC74289j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.aweme.widgetcompat.ProgressDialogC81636a;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ftc.pages.d */
public final class C52780d extends Fragment {

    /* renamed from: h */
    public static final C52783b f121458h = new C52783b((byte) 0);

    /* renamed from: a */
    public VideoPublishEditModel f121459a;

    /* renamed from: b */
    public ProgressDialogC81636a f121460b;

    /* renamed from: c */
    final AtomicInteger f121461c = new AtomicInteger(0);

    /* renamed from: d */
    public final int f121462d = 150;

    /* renamed from: e */
    public Bitmap f121463e;

    /* renamed from: f */
    public View.OnTouchListener f121464f = new View$OnTouchListenerC52788g(this);

    /* renamed from: g */
    DialogC74289j f121465g;

    /* renamed from: i */
    private int f121466i;

    /* renamed from: j */
    private boolean f121467j;

    /* renamed from: k */
    private boolean f121468k;

    /* renamed from: l */
    private final C52789h f121469l = new C52789h(this);

    /* renamed from: m */
    private final AbstractC89703z f121470m;

    /* renamed from: n */
    private final CoroutineExceptionHandler f121471n;

    /* renamed from: o */
    private final AbstractC89516am f121472o;

    /* renamed from: p */
    private HashMap f121473p;

    static {
        Covode.recordClassIndex(62179);
    }

    /* renamed from: a */
    public final View mo88446a(int i) {
        if (this.f121473p == null) {
            this.f121473p = new HashMap();
        }
        View view = (View) this.f121473p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f121473p.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$b */
    public static final class C52783b {
        static {
            Covode.recordClassIndex(62182);
        }

        private C52783b() {
        }

        public /* synthetic */ C52783b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$a */
    public static final class C52781a extends AbstractC89097a implements CoroutineExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ C52780d f121474a;

        static {
            Covode.recordClassIndex(62180);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$a$a */
        static final class C52782a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C52781a f121475a;

            static {
                Covode.recordClassIndex(62181);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52782a(C52781a aVar) {
                super(0);
                this.f121475a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f121475a.f121474a.mo88447a();
                return C89391z.f203057a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52781a(AbstractC89127f.AbstractC89132c cVar, C52780d dVar) {
            super(cVar);
            this.f121474a = dVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C80558hx.m139642a(0, new C52782a(this));
            C84911q.m145923a("FTCVideoPublishFragment", th);
        }
    }

    /* renamed from: a */
    public final void mo88447a() {
        DialogC74289j jVar;
        DialogC74289j jVar2 = this.f121465g;
        if (jVar2 != null && jVar2.isShowing() && (jVar = this.f121465g) != null) {
            jVar.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        m97665a(getView(), null);
        super.onDestroyView();
        HashMap hashMap = this.f121473p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public C52780d() {
        AbstractC89703z a = C89582cd.m155517a(null);
        this.f121470m = a;
        C52781a aVar = new C52781a(CoroutineExceptionHandler.f203145c, this);
        this.f121471n = aVar;
        this.f121472o = C89517an.m155448a(C31068c.f74429a.plus(a).plus(aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$n */
    public static final class C52796n implements IDraftService.DraftSaveListener {

        /* renamed from: a */
        final /* synthetic */ C52780d f121492a;

        static {
            Covode.recordClassIndex(62195);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
        public final void onDraftSaveSuccess() {
            C52780d dVar = this.f121492a;
            dVar.mo88447a();
            VideoPublishEditModel videoPublishEditModel = dVar.f121459a;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            Iterator<T> it = videoPublishEditModel.getPreviewInfo().getVideoList().iterator();
            long j = 0;
            while (it.hasNext()) {
                j += it.next().getVideoFileInfo().getDuration() / 1000;
            }
            C84425b a = new C84425b().mo129404a("duration", j);
            VideoPublishEditModel videoPublishEditModel2 = dVar.f121459a;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            C84425b a2 = a.mo129406a("creation_id", videoPublishEditModel2.creationId).mo129406a("shoot_way", "direct_shoot").mo129406a("enter_from", "personal_homepage").mo129406a("shoot_entrance", "direct_shoot");
            VideoPublishEditModel videoPublishEditModel3 = dVar.f121459a;
            if (videoPublishEditModel3 == null) {
                C89219l.m154710a("mModel");
            }
            C84425b a3 = a2.mo129406a("prop_list", videoPublishEditModel3.mStickerID);
            VideoPublishEditModel videoPublishEditModel4 = dVar.f121459a;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            C84425b a4 = a3.mo129406a("effect_list", videoPublishEditModel4.getEditEffectList());
            VideoPublishEditModel videoPublishEditModel5 = dVar.f121459a;
            if (videoPublishEditModel5 == null) {
                C89219l.m154710a("mModel");
            }
            C39162r.m79460a("video_save_end", a4.mo129406a("filter_list", videoPublishEditModel5.mCurFilterIds).f188764a);
            VideoPublishEditModel videoPublishEditModel6 = dVar.f121459a;
            if (videoPublishEditModel6 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel6.mIsFromDraft) {
                AbstractC81915c.m141874a(new C51917c(1));
            } else {
                AbstractC81915c.m141874a(new C51917c(2));
            }
            SmartRouter.buildRoute(dVar.getActivity(), "//kids/main").withParam("key_init_page_index", 4).open();
            C84911q.m145921a("NewKidsMode, Publish SaveDraft and goto KidsMain.");
            AbstractC81915c.m141874a(new C71897c());
            AbstractC81915c.m141874a(new C71899e());
            Intent intent = new Intent();
            intent.putExtra("publish result", "PublishActivity success");
            ActivityC0945e activity = dVar.getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
            }
            ActivityC0945e activity2 = dVar.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            dVar.requireActivity().overridePendingTransition(0, R.anim.x);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52796n(C52780d dVar) {
            this.f121492a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
        public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
            C89219l.m154721d(draftSaveResult, "");
            C52780d dVar = this.f121492a;
            boolean a = C43211i.m86178a(draftSaveResult);
            dVar.mo88447a();
            if (a) {
                new C79459a(C63238c.f143574a).mo123052a(dVar.getString(R.string.bce)).mo123053a();
            } else {
                new C79459a(C63238c.f143574a).mo123052a(dVar.getString(R.string.bcf)).mo123053a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m97666b() {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.pages.C52780d.m97666b():void");
    }

    /* renamed from: c */
    private final void m97667c() {
        boolean z;
        VideoPublishEditModel videoPublishEditModel = this.f121459a;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.mIsFromDraft) {
            C1743j jVar = new C1743j();
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                C89219l.m154716b(activity, "");
                this.f121461c.incrementAndGet();
                if (this.f121460b == null && !activity.isFinishing()) {
                    this.f121460b = ProgressDialogC81636a.m141497a(activity, getString(R.string.fbq));
                    C84911q.m145928d("FTCVideoPublish prepareEffectPlatformImpl:" + this.f121460b);
                }
            }
            C63244g.m114602a().mo73293u();
            VideoPublishEditModel videoPublishEditModel2 = this.f121459a;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            ArrayList<EffectPointModel> arrayList = videoPublishEditModel2.mEffectList;
            if (arrayList == null || arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                HashSet hashSet = new HashSet();
                VideoPublishEditModel videoPublishEditModel3 = this.f121459a;
                if (videoPublishEditModel3 == null) {
                    C89219l.m154710a("mModel");
                }
                Iterator<EffectPointModel> it = videoPublishEditModel3.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    C89219l.m154716b(next, "");
                    if (!C80720e.m139927b(next.getResDir())) {
                        hashSet.add(next.getKey());
                    }
                }
                if (!hashSet.isEmpty()) {
                    ActivityC0945e requireActivity = requireActivity();
                    C89219l.m154716b(requireActivity, "");
                    AbstractC46415f a = C46404c.m89554a(requireActivity, null);
                    a.mo78886a(this);
                    a.mo78912a((List<String>) new ArrayList(hashSet), (Map<String, String>) null, true, (IFetchEffectListListener) new C52790i(jVar));
                } else {
                    C84911q.m145928d("All effects needn't download");
                    jVar.mo5555a((Object) null);
                }
            } else {
                C84911q.m145928d("ignore fetch specialfilter because of empty effects");
                jVar.mo5555a((Object) null);
            }
            C1731i a2 = C1731i.m5633a((Object) null);
            C1743j jVar2 = new C1743j();
            jVar2.mo5555a((Object) null);
            ArrayList a3 = C27404ap.m54809a(a2, jVar.f5610a, jVar2.f5610a);
            C89219l.m154716b(a3, "");
            C1731i.m5638b((Collection<? extends C1731i<?>>) a3).mo5534a(new C52791j(this), C1731i.f5564c, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$c */
    public static final class C52784c extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52780d f121476a;

        static {
            Covode.recordClassIndex(62183);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52784c(C52780d dVar) {
            this.f121476a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x006d, code lost:
            if (r1 == null) goto L_0x006f;
         */
        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo77200a(android.view.View r8) {
            /*
            // Method dump skipped, instructions count: 201
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.pages.C52780d.C52784c.mo77200a(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$e */
    public static final class C52786e extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52780d f121478a;

        static {
            Covode.recordClassIndex(62185);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52786e(C52780d dVar) {
            this.f121478a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            ActivityC0945e requireActivity = this.f121478a.requireActivity();
            C89219l.m154716b(requireActivity, "");
            VideoPublishEditModel a = C52780d.m97664a(this.f121478a);
            C89219l.m154721d(requireActivity, "");
            C89219l.m154721d(a, "");
            Intent intent = new Intent(requireActivity, FTCChooseCoverActivity.class);
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", (Serializable) a);
            requireActivity.startActivityForResult(intent, 4);
            requireActivity.overridePendingTransition(R.anim.w, R.anim.x);
            C84425b a2 = new C84425b().mo129406a("creation_id", C52780d.m97664a(this.f121478a).creationId).mo129406a("enter_from", "video_post_page");
            if (C52780d.m97664a(this.f121478a).draftId != 0) {
                a2.mo129403a("draft_id", C52780d.m97664a(this.f121478a).draftId);
            }
            C39162r.m79460a("select_cover", a2.f188764a);
            C39162r.m79460a("cover_click", new C84425b().mo129406a("creation_id", C52780d.m97664a(this.f121478a).creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_entrance", "direct_shoot").mo129406a("shoot_way", "direct_shoot").f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$f */
    public static final class C52787f extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C52780d f121479a;

        static {
            Covode.recordClassIndex(62186);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52787f(C52780d dVar) {
            super(600);
            this.f121479a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            MethodCollector.m26663i(7521);
            this.f121479a.getLifecycle().mo4012a(new VideoCoverBitmapHolder());
            ImageView imageView = (ImageView) this.f121479a.mo88446a(R.id.brx);
            C89219l.m154716b(imageView, "");
            imageView.buildDrawingCache(true);
            Bitmap copy = imageView.getDrawingCache(true).copy(Bitmap.Config.RGB_565, false);
            imageView.destroyDrawingCache();
            if (this.f121479a.f121463e != null) {
                copy = this.f121479a.f121463e;
            }
            VideoCoverBitmapHolder.f164604a = copy;
            ActivityC0945e requireActivity = this.f121479a.requireActivity();
            C89219l.m154716b(requireActivity, "");
            ImageView imageView2 = (ImageView) this.f121479a.mo88446a(R.id.brx);
            C89219l.m154716b(imageView2, "");
            TuxTextView tuxTextView = (TuxTextView) this.f121479a.mo88446a(R.id.erb);
            C89219l.m154716b(tuxTextView, "");
            VideoPublishEditModel a = C52780d.m97664a(this.f121479a);
            C89219l.m154721d(requireActivity, "");
            C89219l.m154721d(imageView2, "");
            C89219l.m154721d(tuxTextView, "");
            C89219l.m154721d(a, "");
            Intent intent = new Intent(requireActivity, FTCVideoPublishPreviewActivity.class);
            intent.putExtra("args", (Serializable) a);
            C0792v.m2752a(imageView2, "transition_view_v1");
            C0792v.m2752a(tuxTextView, "transition_view_v2");
            C0692e a2 = C0692e.m2449a(imageView2, "transition_view_v1");
            C89219l.m154716b(a2, "");
            C0692e a3 = C0692e.m2449a(tuxTextView, "transition_view_v2");
            C89219l.m154716b(a3, "");
            C0576b a4 = C0576b.m2190a(requireActivity, a2, a3);
            C89219l.m154716b(a4, "");
            Bundle a5 = a4.mo2564a();
            C84349a.m145093a(intent, requireActivity);
            requireActivity.startActivity(intent, a5);
            MethodCollector.m26664o(7521);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$h */
    public static final class C52789h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C52780d f121481a;

        static {
            Covode.recordClassIndex(62188);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52789h(C52780d dVar) {
            this.f121481a = dVar;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                int length = editable.length();
                if (length > 0) {
                    int i = length - 1;
                    if (editable.charAt(i) == '\n') {
                        editable.delete(i, length);
                    }
                }
                DmtEditText dmtEditText = (DmtEditText) this.f121481a.mo88446a(R.id.awy);
                C89219l.m154716b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text != null) {
                    C89219l.m154716b(text, "");
                    if (text.length() > this.f121481a.f121462d) {
                        int selectionEnd = Selection.getSelectionEnd(text);
                        String obj = text.toString();
                        int i2 = this.f121481a.f121462d;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        String substring = obj.substring(0, i2);
                        C89219l.m154716b(substring, "");
                        ((DmtEditText) this.f121481a.mo88446a(R.id.awy)).setText(substring);
                        DmtEditText dmtEditText2 = (DmtEditText) this.f121481a.mo88446a(R.id.awy);
                        C89219l.m154716b(dmtEditText2, "");
                        Editable text2 = dmtEditText2.getText();
                        if (text2 != null) {
                            C89219l.m154716b(text2, "");
                            if (selectionEnd > text2.length()) {
                                selectionEnd = text2.length();
                            }
                            Selection.setSelection(text2, selectionEnd);
                            new C79459a(this.f121481a.requireContext()).mo123050a(R.string.hc7).mo123053a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$i */
    public static final class C52790i implements IFetchEffectListListener {

        /* renamed from: a */
        final /* synthetic */ C1743j f121482a;

        static {
            Covode.recordClassIndex(62189);
        }

        C52790i(C1743j jVar) {
            this.f121482a = jVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            C84911q.m145926b("uniformFetchList fail : ".concat(String.valueOf(exceptionResult)));
            this.f121482a.mo5555a((Object) null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            C89219l.m154721d(list, "");
            C84911q.m145928d("uniformFetchList onSuccess");
            this.f121482a.mo5555a((Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$m */
    public static final class C52795m implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ C52780d f121491a;

        static {
            Covode.recordClassIndex(62194);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52795m(C52780d dVar) {
            this.f121491a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
            new C79459a(C63238c.f143574a).mo123050a(R.string.f205096dmt).mo123053a();
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            if (this.f121491a.mo88446a(R.id.brx) != null && this.f121491a.getContext() != null) {
                Bitmap mergeCoverText = C52780d.m97664a(this.f121491a).getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
                AbstractC0706b a = C0708d.m2514a(this.f121491a.getResources(), mergeCoverText);
                C89219l.m154716b(a, "");
                a.mo2738a(C13628n.m24520b(C63238c.f143574a, 4.0f));
                ((ImageView) this.f121491a.mo88446a(R.id.brx)).setImageDrawable(a);
                this.f121491a.f121463e = mergeCoverText;
                C73298a.m129355a(mergeCoverText, C52780d.m97664a(this.f121491a).getVideoCoverPath());
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m97664a(C52780d dVar) {
        VideoPublishEditModel videoPublishEditModel = dVar.f121459a;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        return videoPublishEditModel;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$k */
    public static final class C52792k extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f121484a;

        /* renamed from: b */
        final /* synthetic */ C52780d f121485b;

        /* renamed from: c */
        final /* synthetic */ String f121486c;

        /* renamed from: d */
        private /* synthetic */ Object f121487d;

        static {
            Covode.recordClassIndex(62191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52792k(C52780d dVar, String str, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f121485b = dVar;
            this.f121486c = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C52792k kVar = new C52792k(this.f121485b, this.f121486c, dVar);
            kVar.f121487d = obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C52792k) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$k$a */
        public static final class C52793a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Bitmap>, Object> {

            /* renamed from: a */
            int f121488a;

            /* renamed from: b */
            final /* synthetic */ C52792k f121489b;

            static {
                Covode.recordClassIndex(62192);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52793a(C52792k kVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f121489b = kVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C52793a(this.f121489b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Bitmap> dVar) {
                return ((C52793a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                MethodCollector.m26663i(7212);
                if (this.f121488a == 0) {
                    C89382r.m154942a(obj);
                    Bitmap decodeFile = BitmapFactory.decodeFile(this.f121489b.f121486c);
                    MethodCollector.m26664o(7212);
                    return decodeFile;
                }
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                MethodCollector.m26664o(7212);
                throw illegalStateException;
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Resources resources;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f121484a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89531av avVar = C89624i.m155556b((AbstractC89516am) this.f121487d, C89546bf.f203267b, null, new C52793a(this, null), 2);
                resources = this.f121485b.getResources();
                this.f121487d = resources;
                this.f121484a = 1;
                obj = avVar.mo144106a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                resources = (Resources) this.f121487d;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0706b a = C0708d.m2514a(resources, (Bitmap) obj);
            C89219l.m154716b(a, "");
            a.mo2738a(C13628n.m24520b(this.f121485b.getContext(), 4.0f));
            ((ImageView) this.f121485b.mo88446a(R.id.brx)).setImageDrawable(a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$j */
    public static final class C52791j<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C52780d f121483a;

        static {
            Covode.recordClassIndex(62190);
        }

        C52791j(C52780d dVar) {
            this.f121483a = dVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C84911q.m145928d("FTCVideoPublish finishPrepareEffectPlatform:" + this.f121483a.f121460b);
            C52780d dVar = this.f121483a;
            ActivityC0945e activity = dVar.getActivity();
            if (activity != null) {
                C89219l.m154716b(activity, "");
                if (dVar.f121461c.decrementAndGet() == 0 && dVar.f121460b != null) {
                    ProgressDialogC81636a aVar = dVar.f121460b;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    if (aVar.isShowing() && !activity.isFinishing()) {
                        ProgressDialogC81636a aVar2 = dVar.f121460b;
                        if (aVar2 != null) {
                            aVar2.dismiss();
                        }
                        dVar.f121460b = null;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$g */
    static final class View$OnTouchListenerC52788g implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C52780d f121480a;

        static {
            Covode.recordClassIndex(62187);
        }

        View$OnTouchListenerC52788g(C52780d dVar) {
            this.f121480a = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C71827ew.m126828b(this.f121480a.getActivity());
            return false;
        }
    }

    /* renamed from: a */
    private final void m97665a(View view, View.OnTouchListener onTouchListener) {
        if (!(view instanceof EditText)) {
            if (view == null) {
                C89219l.m154715b();
            }
            view.setOnTouchListener(onTouchListener);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m97665a(viewGroup.getChildAt(i), onTouchListener);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$d */
    static final class View$OnFocusChangeListenerC52785d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C52780d f121477a;

        static {
            Covode.recordClassIndex(62184);
        }

        View$OnFocusChangeListenerC52785d(C52780d dVar) {
            this.f121477a = dVar;
        }

        public final void onFocusChange(View view, boolean z) {
            String str;
            String obj;
            if (z) {
                C84425b a = new C84425b().mo129406a("creation_id", C52780d.m97664a(this.f121477a).creationId);
                DmtEditText dmtEditText = (DmtEditText) this.f121477a.mo88446a(R.id.awy);
                C89219l.m154716b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text == null || (obj = text.toString()) == null) {
                    str = null;
                } else {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                    str = C89361p.m154910b((CharSequence) obj).toString();
                }
                C84425b a2 = a.mo129406a("desc_detail", str);
                if (C52780d.m97664a(this.f121477a).draftId != 0) {
                    a2.mo129403a("draft_id", C52780d.m97664a(this.f121477a).draftId);
                }
                C39162r.m79460a("describe_video", a2.f188764a);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            ActivityC0945e requireActivity = requireActivity();
            C89219l.m154716b(requireActivity, "");
            Window window = requireActivity.getWindow();
            C89219l.m154716b(window, "");
            window.setSharedElementReenterTransition(autoTransition);
            ActivityC0945e requireActivity2 = requireActivity();
            C89219l.m154716b(requireActivity2, "");
            Window window2 = requireActivity2.getWindow();
            C89219l.m154716b(window2, "");
            window2.setSharedElementExitTransition(new AutoTransition());
        }
        m97665a(view, this.f121464f);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("args");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof VideoPublishEditModel)) {
            serializable = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
        if (videoPublishEditModel != null) {
            this.f121459a = videoPublishEditModel;
            if (!videoPublishEditModel.isPreviewInfoValid()) {
                ActivityC0945e activity = getActivity();
                if (activity != null) {
                    C89219l.m154716b(activity, "");
                    C69787n.m123312a(new AbstractC69783m.C69784a(activity));
                }
                C84911q.m145926b("VideoPublishPage finish because of null EditPreviewInfo");
                return;
            }
            VideoPublishEditModel videoPublishEditModel2 = this.f121459a;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                z = arguments2.getBoolean("fromDraft", false);
            } else {
                z = false;
            }
            videoPublishEditModel2.mIsFromDraft = z;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                i = arguments3.getInt("extra_stick_point_type", 0);
            } else {
                i = 0;
            }
            this.f121466i = i;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                z2 = arguments4.getBoolean("enter_record_from_other_platform", false);
            } else {
                z2 = false;
            }
            this.f121467j = z2;
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                z3 = arguments5.getBoolean("edit_publish_session_end_together", false);
            } else {
                z3 = false;
            }
            this.f121468k = z3;
            Typeface a = C17301b.m32033a().mo27611a(C17303d.f41573g);
            if (a != null) {
                TuxTextView tuxTextView = (TuxTextView) mo88446a(R.id.era);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setTypeface(a);
            }
            VideoPublishEditModel videoPublishEditModel3 = this.f121459a;
            if (videoPublishEditModel3 == null) {
                C89219l.m154710a("mModel");
            }
            String str = videoPublishEditModel3.title;
            if (!(str == null || str.length() == 0)) {
                ((DmtEditText) mo88446a(R.id.awy)).setText(str);
            }
            ((DmtEditText) mo88446a(R.id.awy)).setOnFocusChangeListener(new View$OnFocusChangeListenerC52785d(this));
            DmtEditText dmtEditText = (DmtEditText) mo88446a(R.id.awy);
            C89219l.m154716b(dmtEditText, "");
            dmtEditText.setFilters(new C52741a[]{new C52741a(this.f121462d)});
            ((DmtEditText) mo88446a(R.id.awy)).removeTextChangedListener(this.f121469l);
            ((DmtEditText) mo88446a(R.id.awy)).addTextChangedListener(this.f121469l);
            ((TuxTextView) mo88446a(R.id.erb)).setOnClickListener(new C52786e(this));
            ImageView imageView = (ImageView) mo88446a(R.id.brx);
            C89219l.m154716b(imageView, "");
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            VideoPublishEditModel videoPublishEditModel4 = this.f121459a;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel4.mIsFromDraft) {
                VideoPublishEditModel videoPublishEditModel5 = this.f121459a;
                if (videoPublishEditModel5 == null) {
                    C89219l.m154710a("mModel");
                }
                if (videoPublishEditModel5.getVideoCoverPath() != null) {
                    VideoPublishEditModel videoPublishEditModel6 = this.f121459a;
                    if (videoPublishEditModel6 == null) {
                        C89219l.m154710a("mModel");
                    }
                    C80720e.m139931c(videoPublishEditModel6.getVideoCoverPath());
                    VideoPublishEditModel videoPublishEditModel7 = this.f121459a;
                    if (videoPublishEditModel7 == null) {
                        C89219l.m154710a("mModel");
                    }
                    videoPublishEditModel7.generateVideoCoverPath();
                }
            }
            m97666b();
            ((ImageView) mo88446a(R.id.brx)).setOnClickListener(new C52787f(this));
            ((FrameLayout) mo88446a(R.id.wr)).setOnClickListener(new C52784c(this));
            m97667c();
            C71827ew.m126828b(getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a12, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializableExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 4 && i2 == -1 && intent != null && (serializableExtra = intent.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT")) != null) {
            Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            this.f121459a = (VideoPublishEditModel) serializableExtra;
            m97666b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.d$l */
    public static final class C52794l implements AbstractC85304ab {

        /* renamed from: a */
        final /* synthetic */ C52780d f121490a;

        static {
            Covode.recordClassIndex(62193);
        }

        C52794l(C52780d dVar) {
            this.f121490a = dVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            MethodCollector.m26663i(11653);
            C89219l.m154721d(byteBuffer, "");
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            EffectTextModel effectTextModel = C52780d.m97664a(this.f121490a).getCoverPublishModel().getEffectTextModel();
            C89219l.m154716b(createBitmap, "");
            Bitmap mergeCoverText = effectTextModel.mergeCoverText(createBitmap);
            AbstractC0706b a = C0708d.m2514a(this.f121490a.getResources(), mergeCoverText);
            C89219l.m154716b(a, "");
            a.mo2738a(C13628n.m24520b(this.f121490a.getContext(), 4.0f));
            ((ImageView) this.f121490a.mo88446a(R.id.brx)).setImageDrawable(a);
            if (TextUtils.isEmpty(C52780d.m97664a(this.f121490a).multiEditVideoRecordData.coverImagePath)) {
                C52780d.m97664a(this.f121490a).multiEditVideoRecordData.coverImagePath = C71429d.m126154a();
            }
            String str = C52780d.m97664a(this.f121490a).multiEditVideoRecordData.coverImagePath;
            C89219l.m154716b(str, "");
            C71429d.m126155a(mergeCoverText, str);
            MethodCollector.m26664o(11653);
            return false;
        }
    }
}

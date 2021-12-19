package com.p2082ss.android.ugc.aweme.external.p2916b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.external.C47166i;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53506t;
import com.p2082ss.android.ugc.aweme.p2730de.ExecutorC40975j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import com.p2082ss.android.ugc.aweme.scheduler.PublishService;
import com.p2082ss.android.ugc.aweme.services.external.IUIService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IEditService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IPublishPageService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ITestActivityService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IVideo2GifUIService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.PublishConfig;
import com.p2082ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.C70045a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoPublishActivity;
import com.p2082ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.p4548e.C88254b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.b.e */
public final class C47134e implements IUIService {

    /* renamed from: a */
    final AbstractC89244h f109756a = C89250i.m154773a((AbstractC89171a) C47138c.f109761a);

    static {
        Covode.recordClassIndex(55738);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.e$a */
    public static final class C47135a implements IVideo2GifUIService {
        static {
            Covode.recordClassIndex(55739);
        }

        C47135a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.e$a$a */
        static final class CallableC47136a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C53506t f109757a;

            /* renamed from: b */
            final /* synthetic */ IVideoChoose.Callback f109758b;

            /* renamed from: c */
            final /* synthetic */ ActivityC0945e f109759c;

            /* renamed from: d */
            final /* synthetic */ Integer f109760d;

            static {
                Covode.recordClassIndex(55740);
            }

            CallableC47136a(C53506t tVar, IVideoChoose.Callback callback, ActivityC0945e eVar, Integer num) {
                this.f109757a = tVar;
                this.f109758b = callback;
                this.f109759c = eVar;
                this.f109760d = num;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                AbstractC0952i supportFragmentManager = this.f109759c.getSupportFragmentManager();
                if (supportFragmentManager == null) {
                    return null;
                }
                AbstractC0976n a = supportFragmentManager.mo3552a();
                Integer num = this.f109760d;
                if (num == null) {
                    C89219l.m154715b();
                }
                a.mo3453a(num.intValue(), this.f109757a).mo3473c();
                return null;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IVideo2GifUIService
        public final Fragment video2GifFragment(VideoShare2GifEditContext videoShare2GifEditContext) {
            C89219l.m154721d(videoShare2GifEditContext, "");
            C70045a aVar = new C70045a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_edit_context", videoShare2GifEditContext);
            aVar.setArguments(bundle);
            C89219l.m154716b(aVar, "");
            return aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IVideo2GifUIService
        public final IVideoChoose toMusVideoChooseFragment(ActivityC0945e eVar, Fragment fragment, IVideoChoose.Callback callback, Integer num) {
            C89219l.m154721d(eVar, "");
            if (fragment instanceof C53506t) {
                return (IVideoChoose) fragment;
            }
            int color = C63247i.f143610a.getResources().getColor(R.color.a_);
            int color2 = C63247i.f143610a.getResources().getColor(R.color.a3);
            int color3 = C63247i.f143610a.getResources().getColor(R.color.l);
            C53506t tVar = new C53506t();
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_NUM_COLUMNS", 3);
            bundle.putFloat("ARG_HORIZONTAL_SPACING", 1.5f);
            bundle.putFloat("ARG_VERTICAL_SPACING", 1.5f);
            bundle.putInt("ARG_GRID_PADDING", 0);
            bundle.putInt("ARG_TEXT_COLOR", color);
            bundle.putInt("ARG_SHADOW_COLOR", color2);
            bundle.putDouble("ARG_ITEM_HEIGHT_WIDTH_RATIO", 1.0d);
            bundle.putInt("ARG_TEXT_SIZE", 13);
            bundle.putBoolean("ARG_TEXT_BACKGROUND", false);
            bundle.putBoolean("ARG_TEXT_INDICATOR", false);
            bundle.putInt("ARG_BG_COLOR", color3);
            tVar.setArguments(bundle);
            tVar.f122840i = callback;
            C1731i.m5640b(new CallableC47136a(tVar, callback, eVar, num), ExecutorC40975j.f95810a);
            C89219l.m154716b(tVar, "");
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.e$b */
    public static final class C47137b implements IDraftService {
        static {
            Covode.recordClassIndex(55741);
        }

        C47137b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService
        public final void removeRecoverDraft() {
            if (!C68747m.m121180a()) {
                C63244g.m114602a().mo73287o().mo104793m().mo104825a(null);
            }
            PublishService.C67284a.m119208a();
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService
        public final void getRecoverDraftIfHave(Context context, IDraftService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(onGetRecoverDraftCallback, "");
            C65682o.m117572a(context, onGetRecoverDraftCallback);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService
        public final void enterDraftBoxActivity(Context context, Bundle bundle) {
            C89219l.m154721d(context, "");
            C63238c.f143565C.mo73290r().mo86005c().mo86020a();
            if (bundle == null) {
                DraftBoxActivity.m136565a(context);
            } else {
                DraftBoxActivity.m136567a(context, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.e$e */
    public static final class C47141e implements ITestActivityService {
        static {
            Covode.recordClassIndex(55745);
        }

        C47141e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.e$c */
    static final class C47138c extends AbstractC89220m implements AbstractC89171a<C47166i> {

        /* renamed from: a */
        public static final C47138c f109761a = new C47138c();

        static {
            Covode.recordClassIndex(55742);
        }

        C47138c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47166i invoke() {
            return new C47166i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IUIService
    public final IVideo2GifUIService abilityUiService() {
        return new C47135a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IUIService
    public final IDraftService draftService() {
        return new C47137b();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IUIService
    public final IEditService editService() {
        return new C47115b();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IUIService
    public final IPublishPageService publishService() {
        return new C47139d(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IUIService
    public final IRecordService recordService() {
        return new C47132d();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IUIService
    public final ITestActivityService schemaTestService() {
        return new C47141e();
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.e$d */
    public static final class C47139d implements IPublishPageService {

        /* renamed from: a */
        final /* synthetic */ C47134e f109762a;

        static {
            Covode.recordClassIndex(55743);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47139d(C47134e eVar) {
            this.f109762a = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.e$d$a */
        static final class C47140a<T> implements AbstractC0688a {

            /* renamed from: a */
            final /* synthetic */ Intent f109763a;

            /* renamed from: b */
            final /* synthetic */ PublishConfig f109764b;

            /* renamed from: c */
            final /* synthetic */ Activity f109765c;

            static {
                Covode.recordClassIndex(55744);
            }

            C47140a(Intent intent, PublishConfig publishConfig, Activity activity) {
                this.f109763a = intent;
                this.f109764b = publishConfig;
                this.f109765c = activity;
            }

            @Override // androidx.core.p036g.AbstractC0688a
            /* renamed from: a */
            public final /* synthetic */ void mo2720a(Object obj) {
                List a = C89070n.m154516a(obj);
                Intent intent = this.f109763a;
                Objects.requireNonNull(a, "null cannot be cast to non-null type java.io.Serializable");
                intent.putExtra("challenge", (Serializable) a);
                Activity activity = this.f109765c;
                Intent intent2 = this.f109763a;
                C84349a.m145093a(intent2, activity);
                activity.startActivity(intent2);
                this.f109765c.finish();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IPublishPageService
        public final void startPublish(Activity activity, PublishConfig publishConfig) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(publishConfig, "");
            ((C47166i) this.f109762a.f109756a.getValue()).refreshData();
            Intent intent = new Intent();
            intent.setClass(activity, VideoPublishActivity.class);
            intent.putExtra("shoot_way", publishConfig.getShootway());
            intent.putExtra("creation_id", publishConfig.getCreationId());
            String musicId = publishConfig.getMusicId();
            if (musicId != null) {
                intent.putExtra("id", musicId);
            }
            if (TextUtils.isEmpty(publishConfig.getChallenge())) {
                C84349a.m145093a(intent, activity);
                activity.startActivity(intent);
                activity.finish();
                return;
            }
            C63238c.f143577d.mo93808a(publishConfig.getChallenge(), new C47140a(intent, publishConfig, activity));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IUIService
    public final void startSuperEntraceActivity(Context context) {
        C89219l.m154721d(context, "");
        C88254b.C88255a.m153365a();
        C89219l.m154721d(context, "");
    }
}

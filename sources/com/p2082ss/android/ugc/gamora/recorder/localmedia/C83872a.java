package com.p2082ss.android.ugc.gamora.recorder.localmedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.p936a.C14080a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.AbstractC22233n;
import com.bytedance.scene.C22217i;
import com.bytedance.scene.ktx.C22227b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65417d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73759m;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a */
public final class C83872a extends AbstractC22219j {

    /* renamed from: a */
    public static final AbstractC89244h f187209a = C89250i.m154773a((AbstractC89171a) C83874b.f187212a);

    /* renamed from: b */
    public static final C83873a f187210b = new C83873a((byte) 0);

    /* renamed from: c */
    private ShortVideoContext f187211c;

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$a */
    public static final class C83873a {
        static {
            Covode.recordClassIndex(97764);
        }

        /* renamed from: a */
        public static int m144236a() {
            return ((Number) C83872a.f187209a.getValue()).intValue();
        }

        private C83873a() {
        }

        public /* synthetic */ C83873a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$c */
    static final class C83875c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83872a f187213a;

        /* renamed from: b */
        final /* synthetic */ Bundle f187214b;

        /* renamed from: c */
        final /* synthetic */ LocalMediaArgument f187215c;

        static {
            Covode.recordClassIndex(97766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83875c(C83872a aVar, Bundle bundle, LocalMediaArgument localMediaArgument) {
            super(0);
            this.f187213a = aVar;
            this.f187214b = bundle;
            this.f187215c = localMediaArgument;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo128771a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo128771a() {
            Intent intent = new Intent(this.f187213a.f52549m, MvChoosePhotoActivity.class);
            intent.putExtras(this.f187214b);
            if (this.f187215c.f187200b > 0) {
                Activity t = this.f187213a.mo36486t();
                intent.putExtra("key_start_activity_request_code", this.f187215c.f187200b);
                t.startActivityForResult(intent, this.f187215c.f187200b);
            } else {
                m144237a(this.f187213a.mo36486t(), intent);
            }
            C22227b.m41826b(this.f187213a).mo36536b(this.f187213a);
        }

        /* renamed from: a */
        private static void m144237a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$d */
    static final class C83876d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83872a f187216a;

        /* renamed from: b */
        final /* synthetic */ Bundle f187217b;

        /* renamed from: c */
        final /* synthetic */ LocalMediaArgument f187218c;

        static {
            Covode.recordClassIndex(97767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83876d(C83872a aVar, Bundle bundle, LocalMediaArgument localMediaArgument) {
            super(0);
            this.f187216a = aVar;
            this.f187217b = bundle;
            this.f187218c = localMediaArgument;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo128772a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo128772a() {
            MethodCollector.m26663i(9005);
            Activity activity = this.f187216a.f52549m;
            if (activity != null) {
                final FrameLayout k = ((AbstractC73759m) activity).mo115993k();
                C89219l.m154716b(k, "");
                if (k.findViewById(C83873a.m144236a()) != null) {
                    MethodCollector.m26664o(9005);
                    return;
                }
                C72084ao aoVar = new C72084ao();
                Bundle bundle = this.f187217b;
                Bundle bundle2 = this.f187216a.f52554r;
                if (bundle2 != null) {
                    bundle.putBoolean("from_upload_btn_click", bundle2.getBoolean("from_upload_btn_click"));
                    Bundle bundle3 = this.f187216a.f52554r;
                    if (bundle3 == null) {
                        C89219l.m154715b();
                    }
                    bundle.putLong("click_album_icon_time", bundle3.getLong("click_album_icon_time", 0));
                }
                if (this.f187218c.f187200b > 0) {
                    bundle.putInt("key_start_activity_request_code", this.f187218c.f187200b);
                }
                aoVar.f52554r = this.f187217b;
                final FrameLayout frameLayout = new FrameLayout(activity);
                frameLayout.setId(C83873a.m144236a());
                k.addView(frameLayout, -1, -1);
                C22217i.C22218a a = C22217i.m41761a(activity, C72084ao.class);
                a.f52533e = false;
                C22217i.C22218a a2 = a.mo36468a("attachMvChoosePhotoScene");
                a2.f52534f = new C83878a(aoVar);
                a2.f52530b = false;
                a2.f52531c = false;
                a2.f52532d = frameLayout.getId();
                final AbstractC22233n a3 = a2.mo36469a();
                C89219l.m154716b(a3, "");
                JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity).mo33800a(ChooseMediaViewModel.class);
                C89219l.m154716b(a4, "");
                AbstractC88412b unused = ((ChooseMediaViewModel) a4).mo33677a(this.f187216a, C83879b.f187224a, new C20370ah(), new AbstractC89172b<ClosingChooseMediaPageState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.gamora.recorder.localmedia.C83872a.C83876d.C838771 */

                    /* renamed from: a */
                    final /* synthetic */ C83876d f187219a;

                    static {
                        Covode.recordClassIndex(97768);
                    }

                    {
                        this.f187219a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
                        MethodCollector.m26663i(8459);
                        C89219l.m154721d(closingChooseMediaPageState, "");
                        if (C89219l.m154714a(closingChooseMediaPageState, ClosingChooseMediaPageState.Closed.INSTANCE)) {
                            a3.mo36341b();
                            k.removeView(frameLayout);
                            C22227b.m41826b(this.f187219a.f187216a).mo36536b(this.f187219a.f187216a);
                        }
                        C89391z zVar = C89391z.f203057a;
                        MethodCollector.m26664o(8459);
                        return zVar;
                    }
                });
                MethodCollector.m26664o(9005);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.IShootPageLayoutGetter");
            MethodCollector.m26664o(9005);
            throw nullPointerException;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$d$a */
        public static final class C83878a implements AbstractC22231l {

            /* renamed from: a */
            final /* synthetic */ C72084ao f187223a;

            static {
                Covode.recordClassIndex(97769);
            }

            C83878a(C72084ao aoVar) {
                this.f187223a = aoVar;
            }

            @Override // com.bytedance.scene.AbstractC22231l
            public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
                C89219l.m154721d(classLoader, "");
                C89219l.m154721d(str, "");
                if (TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao", str)) {
                    return this.f187223a;
                }
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$b */
    static final class C83874b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C83874b f187212a = new C83874b();

        static {
            Covode.recordClassIndex(97765);
        }

        C83874b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0792v.m2735a());
        }
    }

    static {
        Covode.recordClassIndex(97763);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        Parcelable a2 = C14080a.m25675a(((ShortVideoContextViewModel) a).f155842a);
        C89219l.m154716b(a2, "");
        this.f187211c = (ShortVideoContext) a2;
        Bundle bundle2 = this.f52554r;
        if (bundle2 == null) {
            C89219l.m154715b();
        }
        Object a3 = m144233a(bundle2, "local_media_argument");
        Objects.requireNonNull(a3, "null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument");
        LocalMediaArgument localMediaArgument = (LocalMediaArgument) a3;
        Bundle bundle3 = new Bundle();
        bundle3.putInt("key_support_flag", localMediaArgument.f187201c);
        bundle3.putBoolean("Key_enable_multi_video", localMediaArgument.f187202d);
        bundle3.putLong("Key_min_duration", localMediaArgument.f187204f);
        bundle3.putInt("key_photo_select_min_count", localMediaArgument.f187205g);
        bundle3.putInt("key_photo_select_max_count", localMediaArgument.f187206h);
        bundle3.putInt("key_video_select_min_count", localMediaArgument.f187207i);
        bundle3.putInt("key_video_select_max_count", localMediaArgument.f187208j);
        bundle3.putInt("key_choose_scene", localMediaArgument.f187203e);
        ShortVideoContext shortVideoContext = this.f187211c;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        bundle3.putParcelable("key_short_video_context", shortVideoContext);
        bundle3.putInt("key_choose_request_code", localMediaArgument.f187199a);
        C83875c cVar = new C83875c(this, bundle3, localMediaArgument);
        C83876d dVar = new C83876d(this, bundle3, localMediaArgument);
        C73975b.C73976a.f166071a.step(OpenAlbumPanelPerformanceMonitor.f166158a, "startPhotoChoose");
        if (C65417d.m117136a()) {
            Bundle bundle4 = this.f52554r;
            if (bundle4 == null) {
                C89219l.m154715b();
            }
            if (bundle4.getBoolean("from_upload_btn_click") && !C63244g.m114602a().mo73255A().mo93901a()) {
                dVar.mo128772a();
                return;
            }
        }
        cVar.mo128771a();
    }

    /* renamed from: a */
    private static Object m144233a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(8612);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View view = new View(viewGroup.getContext());
        MethodCollector.m26664o(8612);
        return view;
    }
}

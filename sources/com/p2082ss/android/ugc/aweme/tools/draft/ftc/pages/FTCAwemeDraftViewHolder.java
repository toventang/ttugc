package com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.app.ActivityC0580d;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71948o;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCDraftItemView;
import com.p2082ss.android.ugc.aweme.tools.draft.p4100a.AbstractC78124a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.utils.C80564i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder */
public final class FTCAwemeDraftViewHolder extends AbstractC78124a<C43223c> implements WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: a */
    ExpandableMentionTextView f175789a;

    /* renamed from: b */
    ViewGroup f175790b;

    /* renamed from: c */
    TextView f175791c;

    /* renamed from: d */
    TextView f175792d;

    /* renamed from: e */
    ImageView f175793e;

    /* renamed from: f */
    public SimpleDraweeView f175794f;

    /* renamed from: g */
    View f175795g;

    /* renamed from: h */
    ImageView f175796h;

    /* renamed from: i */
    AppCompatCheckBox f175797i;

    /* renamed from: j */
    FTCDraftItemView f175798j;

    /* renamed from: k */
    Space f175799k;

    /* renamed from: l */
    RelativeLayout f175800l;

    /* renamed from: m */
    public boolean f175801m;

    /* renamed from: n */
    public boolean f175802n;

    /* renamed from: o */
    final AbstractC78263a f175803o;

    /* renamed from: p */
    final Context f175804p;

    /* renamed from: q */
    long f175805q;

    /* renamed from: r */
    final Map<ImageView, C24117a<AbstractC24454c>> f175806r;

    /* renamed from: s */
    private Space f175807s;

    /* renamed from: w */
    private ProgressDialogC84958b f175808w;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder$a */
    public interface AbstractC78263a {
        static {
            Covode.recordClassIndex(91379);
        }

        /* renamed from: a */
        void mo122156a(int i, C43223c cVar);

        /* renamed from: a */
        void mo122157a(View view, C43223c cVar);
    }

    static {
        Covode.recordClassIndex(91378);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder$d */
    public static final class C78266d implements FTCDraftItemView.AbstractC78269a {

        /* renamed from: a */
        final /* synthetic */ FTCAwemeDraftViewHolder f175812a;

        static {
            Covode.recordClassIndex(91382);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78266d(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
            this.f175812a = fTCAwemeDraftViewHolder;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCDraftItemView.AbstractC78269a
        /* renamed from: a */
        public final void mo122159a(int i, boolean z) {
            int i2;
            int i3;
            FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = this.f175812a;
            ViewGroup viewGroup = fTCAwemeDraftViewHolder.f175790b;
            if (viewGroup == null) {
                C89219l.m154710a("mAwemeTitleContainer");
                C89219l.m154715b();
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ExpandableMentionTextView expandableMentionTextView = fTCAwemeDraftViewHolder.f175789a;
            if (expandableMentionTextView == null) {
                C89219l.m154710a("mAwemeTitle");
                C89219l.m154715b();
            }
            int i4 = 1;
            if (C78099c.m136517a(expandableMentionTextView.getContext())) {
                int i5 = marginLayoutParams.leftMargin;
                if (z) {
                    i4 = -1;
                }
                i2 = i5 + (i * i4);
                i3 = marginLayoutParams.rightMargin;
            } else {
                i2 = marginLayoutParams.leftMargin;
                int i6 = marginLayoutParams.rightMargin;
                if (!z) {
                    i4 = -1;
                }
                i3 = (i * i4) + i6;
            }
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            ViewGroup viewGroup2 = fTCAwemeDraftViewHolder.f175790b;
            if (viewGroup2 == null) {
                C89219l.m154710a("mAwemeTitleContainer");
                C89219l.m154715b();
            }
            viewGroup2.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SimpleDraweeView m136752a(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
        SimpleDraweeView simpleDraweeView = fTCAwemeDraftViewHolder.f175794f;
        if (simpleDraweeView == null) {
            C89219l.m154710a("mCover");
        }
        return simpleDraweeView;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder$f */
    static final class View$OnLongClickListenerC78268f implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ FTCAwemeDraftViewHolder f175814a;

        static {
            Covode.recordClassIndex(91384);
        }

        View$OnLongClickListenerC78268f(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
            this.f175814a = fTCAwemeDraftViewHolder;
        }

        public final boolean onLongClick(View view) {
            C43223c cVar;
            C89219l.m154721d(view, "");
            FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = this.f175814a;
            C70005cr.m123611a();
            if (!C70005cr.m123613a(view.getContext()) || (cVar = (C43223c) fTCAwemeDraftViewHolder.f175453t) == null) {
                return true;
            }
            fTCAwemeDraftViewHolder.f175803o.mo122157a(view, cVar);
            return true;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C89219l.m154721d(message, "");
        Context context = this.f175804p;
        Object obj = message.obj;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.Intent");
        Intent intent = (Intent) obj;
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
        ProgressDialogC84958b bVar = this.f175808w;
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
            this.f175808w = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder$c */
    public static final class C78265c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ FTCAwemeDraftViewHolder f175810a;

        /* renamed from: b */
        final /* synthetic */ C43223c f175811b;

        static {
            Covode.recordClassIndex(91381);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            if (!bitmap.isRecycled() && FTCAwemeDraftViewHolder.m136752a(this.f175810a) != null) {
                SimpleDraweeView a = FTCAwemeDraftViewHolder.m136752a(this.f175810a);
                if (a == null) {
                    C89219l.m154715b();
                }
                if (C89219l.m154714a(a.getTag(), (Object) this.f175811b.mo73726r())) {
                    SimpleDraweeView a2 = FTCAwemeDraftViewHolder.m136752a(this.f175810a);
                    if (!bitmap.isRecycled()) {
                        a2.setImageBitmap(bitmap);
                    }
                    C24117a<AbstractC24454c> a3 = C71948o.m127025a(bitmap);
                    C43223c cVar = (C43223c) this.f175810a.f175453t;
                    if (cVar == null) {
                        C89219l.m154715b();
                    }
                    C71948o.m127026a(a3, cVar.mo73726r());
                    FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = this.f175810a;
                    SimpleDraweeView a4 = FTCAwemeDraftViewHolder.m136752a(fTCAwemeDraftViewHolder);
                    C24117a<AbstractC24454c> b = a3.clone();
                    C89219l.m154716b(b, "");
                    C24117a<AbstractC24454c> put = fTCAwemeDraftViewHolder.f175806r.put(a4, b);
                    if (put != null) {
                        C24117a.m45712c(put);
                    }
                }
            }
        }

        C78265c(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder, C43223c cVar) {
            this.f175810a = fTCAwemeDraftViewHolder;
            this.f175811b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder$e */
    static final class View$OnClickListenerC78267e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FTCAwemeDraftViewHolder f175813a;

        static {
            Covode.recordClassIndex(91383);
        }

        View$OnClickListenerC78267e(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
            this.f175813a = fTCAwemeDraftViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154721d(view, "");
            FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = this.f175813a;
            if (fTCAwemeDraftViewHolder.f175801m) {
                AppCompatCheckBox appCompatCheckBox = fTCAwemeDraftViewHolder.f175797i;
                if (appCompatCheckBox == null) {
                    C89219l.m154710a("mCheckBox");
                    C89219l.m154715b();
                }
                Object obj = fTCAwemeDraftViewHolder.f175453t;
                if (obj == null) {
                    C89219l.m154715b();
                }
                appCompatCheckBox.setChecked(!((C43223c) obj).f100925y);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - fTCAwemeDraftViewHolder.f175805q >= 500) {
                fTCAwemeDraftViewHolder.f175805q = currentTimeMillis;
                C43223c cVar = (C43223c) fTCAwemeDraftViewHolder.f175453t;
                if (cVar != null) {
                    fTCAwemeDraftViewHolder.f175803o.mo122156a(fTCAwemeDraftViewHolder.getAdapterPosition(), cVar);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder$b */
    static final class C78264b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ FTCAwemeDraftViewHolder f175809a;

        static {
            Covode.recordClassIndex(91380);
        }

        C78264b(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
            this.f175809a = fTCAwemeDraftViewHolder;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C43223c cVar = (C43223c) this.f175809a.f175453t;
            if (cVar == null) {
                C89219l.m154715b();
            }
            cVar.f100925y = z;
            IDraftService a = C78397c.m136927a();
            C43223c cVar2 = (C43223c) this.f175809a.f175453t;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            a.notifyDraftCheckedChanged(cVar2, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCAwemeDraftViewHolder(View view, Map<ImageView, C24117a<AbstractC24454c>> map, AbstractC78263a aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(aVar, "");
        View c = C0792v.m2762c(view, (int) R.id.p9);
        C89219l.m154716b(c, "");
        this.f175789a = (ExpandableMentionTextView) c;
        View c2 = C0792v.m2762c(view, (int) R.id.cet);
        C89219l.m154716b(c2, "");
        this.f175790b = (ViewGroup) c2;
        View c3 = C0792v.m2762c(view, (int) R.id.evf);
        C89219l.m154716b(c3, "");
        this.f175791c = (TextView) c3;
        View c4 = C0792v.m2762c(view, (int) R.id.p0);
        C89219l.m154716b(c4, "");
        this.f175792d = (TextView) c4;
        View c5 = C0792v.m2762c(view, (int) R.id.a3h);
        C89219l.m154716b(c5, "");
        this.f175793e = (ImageView) c5;
        View c6 = C0792v.m2762c(view, (int) R.id.afn);
        C89219l.m154716b(c6, "");
        this.f175794f = (SimpleDraweeView) c6;
        View c7 = C0792v.m2762c(view, (int) R.id.eu7);
        C89219l.m154716b(c7, "");
        this.f175795g = c7;
        View c8 = C0792v.m2762c(view, (int) R.id.aop);
        C89219l.m154716b(c8, "");
        this.f175796h = (ImageView) c8;
        View c9 = C0792v.m2762c(view, (int) R.id.a4l);
        C89219l.m154716b(c9, "");
        this.f175797i = (AppCompatCheckBox) c9;
        View c10 = C0792v.m2762c(view, (int) R.id.ccp);
        C89219l.m154716b(c10, "");
        FTCDraftItemView fTCDraftItemView = (FTCDraftItemView) c10;
        this.f175798j = fTCDraftItemView;
        if (fTCDraftItemView == null) {
            C89219l.m154710a("mContainerLl");
        }
        fTCDraftItemView.setOnScrollListener(new C78266d(this));
        View c11 = C0792v.m2762c(view, (int) R.id.aoo);
        C89219l.m154716b(c11, "");
        this.f175807s = (Space) c11;
        View c12 = C0792v.m2762c(view, (int) R.id.aon);
        C89219l.m154716b(c12, "");
        this.f175799k = (Space) c12;
        View c13 = C0792v.m2762c(view, (int) R.id.aok);
        C89219l.m154716b(c13, "");
        RelativeLayout relativeLayout = (RelativeLayout) c13;
        this.f175800l = relativeLayout;
        if (relativeLayout == null) {
            C89219l.m154710a("mDraftListItemLayout");
        }
        relativeLayout.setOnClickListener(new View$OnClickListenerC78267e(this));
        RelativeLayout relativeLayout2 = this.f175800l;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDraftListItemLayout");
        }
        relativeLayout2.setOnLongClickListener(new View$OnLongClickListenerC78268f(this));
        this.f175803o = aVar;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f175804p = context;
        Activity a = C80564i.m139647a(context);
        if (a instanceof ActivityC0945e) {
            ((ActivityC0580d) a).getLifecycle().mo4012a(this);
        }
        this.f175806r = map;
    }
}

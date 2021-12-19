package com.bytedance.android.livesdk.wishlist.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.C6889az;
import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class WishGiftView extends LinearLayout {

    /* renamed from: c */
    public static final C11557a f27668c = new C11557a((byte) 0);

    /* renamed from: a */
    public C8860x.C8861a f27669a;

    /* renamed from: b */
    public DataChannel f27670b;

    /* renamed from: d */
    private final AbstractC89244h f27671d;

    /* renamed from: e */
    private final AbstractC89244h f27672e;

    /* renamed from: f */
    private final AbstractC89244h f27673f;

    /* renamed from: g */
    private final AbstractC89244h f27674g;

    /* renamed from: h */
    private final AbstractC89244h f27675h;

    /* renamed from: i */
    private final AbstractC89244h f27676i;

    /* renamed from: j */
    private final AbstractC89244h f27677j;

    /* renamed from: k */
    private final AbstractC89244h f27678k;

    /* renamed from: l */
    private final AbstractC89244h f27679l;

    static {
        Covode.recordClassIndex(13217);
    }

    public WishGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final LiveTextView getMGiftDiamondCount() {
        return (LiveTextView) this.f27674g.getValue();
    }

    public final HSImageView getMGiftIcon() {
        return (HSImageView) this.f27671d.getValue();
    }

    public final ConstraintLayout getMGiftInfoLayout() {
        return (ConstraintLayout) this.f27673f.getValue();
    }

    public final LiveTextView getMGiftName() {
        return (LiveTextView) this.f27672e.getValue();
    }

    public final ProgressBar getMProgressBar() {
        return (ProgressBar) this.f27675h.getValue();
    }

    public final LiveTextView getMProgressText() {
        return (LiveTextView) this.f27676i.getValue();
    }

    public final LiveTextView getMSendGiftText() {
        return (LiveTextView) this.f27677j.getValue();
    }

    public final ImageView getMWishFinishIcon() {
        return (ImageView) this.f27678k.getValue();
    }

    /* access modifiers changed from: package-private */
    public final LiveNewSendGiftAnimationForWishListView getMWishGiftComboView() {
        return (LiveNewSendGiftAnimationForWishListView) this.f27679l.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$a */
    public static final class C11557a {
        static {
            Covode.recordClassIndex(13218);
        }

        private C11557a() {
        }

        public /* synthetic */ C11557a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$c */
    static final class RunnableC11559c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27682a;

        static {
            Covode.recordClassIndex(13220);
        }

        RunnableC11559c(WishGiftView wishGiftView) {
            this.f27682a = wishGiftView;
        }

        public final void run() {
            this.f27682a.mo18358a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$d */
    static final class C11560d extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27683a;

        static {
            Covode.recordClassIndex(13221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11560d(WishGiftView wishGiftView) {
            super(0);
            this.f27683a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f27683a.findViewById(R.id.f75);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$e */
    static final class C11561e extends AbstractC89220m implements AbstractC89171a<HSImageView> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27684a;

        static {
            Covode.recordClassIndex(13222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11561e(WishGiftView wishGiftView) {
            super(0);
            this.f27684a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HSImageView invoke() {
            return this.f27684a.findViewById(R.id.c1f);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$f */
    static final class C11562f extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27685a;

        static {
            Covode.recordClassIndex(13223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11562f(WishGiftView wishGiftView) {
            super(0);
            this.f27685a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f27685a.findViewById(R.id.ba9);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$g */
    static final class C11563g extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27686a;

        static {
            Covode.recordClassIndex(13224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11563g(WishGiftView wishGiftView) {
            super(0);
            this.f27686a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f27686a.findViewById(R.id.f77);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$h */
    static final class C11564h extends AbstractC89220m implements AbstractC89171a<ProgressBar> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27687a;

        static {
            Covode.recordClassIndex(13225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11564h(WishGiftView wishGiftView) {
            super(0);
            this.f27687a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProgressBar invoke() {
            return this.f27687a.findViewById(R.id.fjf);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$i */
    static final class C11565i extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27688a;

        static {
            Covode.recordClassIndex(13226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11565i(WishGiftView wishGiftView) {
            super(0);
            this.f27688a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f27688a.findViewById(R.id.f78);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$j */
    static final class C11566j extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27689a;

        static {
            Covode.recordClassIndex(13227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11566j(WishGiftView wishGiftView) {
            super(0);
            this.f27689a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f27689a.findViewById(R.id.f79);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$k */
    static final class C11567k extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27690a;

        static {
            Covode.recordClassIndex(13228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11567k(WishGiftView wishGiftView) {
            super(0);
            this.f27690a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f27690a.findViewById(R.id.c1e);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$l */
    static final class C11568l extends AbstractC89220m implements AbstractC89171a<LiveNewSendGiftAnimationForWishListView> {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27691a;

        static {
            Covode.recordClassIndex(13229);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11568l(WishGiftView wishGiftView) {
            super(0);
            this.f27691a = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveNewSendGiftAnimationForWishListView invoke() {
            return this.f27691a.findViewById(R.id.ba2);
        }
    }

    public final long getWishGiftId() {
        C8860x.C8861a aVar = this.f27669a;
        if (aVar == null) {
            C89219l.m154710a("mWishInfo");
        }
        return aVar.f21802a;
    }

    /* renamed from: a */
    public final void mo18358a() {
        getMWishGiftComboView().setVisibility(8);
        getMSendGiftText().setVisibility(0);
        getMGiftInfoLayout().setVisibility(0);
    }

    /* renamed from: b */
    public final void mo18361b() {
        C8860x.C8861a aVar = this.f27669a;
        if (aVar == null) {
            C89219l.m154710a("mWishInfo");
        }
        int i = aVar.f21804c;
        C8860x.C8861a aVar2 = this.f27669a;
        if (aVar2 == null) {
            C89219l.m154710a("mWishInfo");
        }
        if (i >= aVar2.f21805d) {
            getMWishFinishIcon().setVisibility(0);
        }
    }

    /* renamed from: b */
    private final void m20391b(int i) {
        C8860x.C8861a aVar = this.f27669a;
        if (aVar == null) {
            C89219l.m154710a("mWishInfo");
        }
        mo18360a(i, aVar.f21805d);
        C8860x.C8861a aVar2 = this.f27669a;
        if (aVar2 == null) {
            C89219l.m154710a("mWishInfo");
        }
        mo18362b(i, aVar2.f21805d);
        mo18361b();
    }

    /* renamed from: a */
    public final void mo18359a(int i) {
        C8860x.C8861a aVar = this.f27669a;
        if (aVar == null) {
            C89219l.m154710a("mWishInfo");
        }
        aVar.f21804c += i;
        C8860x.C8861a aVar2 = this.f27669a;
        if (aVar2 == null) {
            C89219l.m154710a("mWishInfo");
        }
        m20391b(aVar2.f21804c);
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.view.WishGiftView$b */
    public static final class View$OnClickListenerC11558b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WishGiftView f27680a;

        /* renamed from: b */
        final /* synthetic */ C8860x.C8861a.C8862a f27681b;

        static {
            Covode.recordClassIndex(13219);
        }

        public View$OnClickListenerC11558b(WishGiftView wishGiftView, C8860x.C8861a.C8862a aVar) {
            this.f27680a = wishGiftView;
            this.f27681b = aVar;
        }

        public final void onClick(View view) {
            User owner;
            boolean z;
            boolean z2;
            AnimatorSet animatorSet;
            WishGiftView wishGiftView = this.f27680a;
            C8860x.C8861a.C8862a aVar = this.f27681b;
            DataChannel dataChannel = wishGiftView.f27670b;
            if (dataChannel == null) {
                C89219l.m154710a("mDataChannel");
            }
            Room room = (Room) dataChannel.mo28318b(C9093de.class);
            if (!(room == null || (owner = room.getOwner()) == null)) {
                C10715e eVar = C10715e.f25799h;
                C8860x.C8861a aVar2 = wishGiftView.f27669a;
                if (aVar2 == null) {
                    C89219l.m154710a("mWishInfo");
                }
                long j = aVar2.f21802a;
                if (aVar.f21810d != 1) {
                    z = true;
                } else {
                    z = false;
                }
                eVar.mo17642a(j, z, "wishlist", "", (Integer) 0, (Integer) 0);
                GiftDialogViewModel.EnumC10039a aVar3 = GiftDialogViewModel.EnumC10039a.GIFT;
                C8860x.C8861a aVar4 = wishGiftView.f27669a;
                if (aVar4 == null) {
                    C89219l.m154710a("mWishInfo");
                }
                C10700d dVar = new C10700d(aVar3, aVar4.f21802a, false);
                dVar.f25764f = aVar.f21809c;
                if (aVar.f21810d != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dVar.f25769k = z2;
                dVar.f25767i = owner;
                dVar.f25768j = "wishlist";
                DataChannel dataChannel2 = wishGiftView.f27670b;
                if (dataChannel2 == null) {
                    C89219l.m154710a("mDataChannel");
                }
                dataChannel2.mo28320c(C6889az.class, dVar);
                LiveNewSendGiftAnimationForWishListView mWishGiftComboView = wishGiftView.getMWishGiftComboView();
                RunnableC11559c cVar = new RunnableC11559c(wishGiftView);
                if (mWishGiftComboView.f25686f == null || !(mWishGiftComboView.f25686f.f21695b instanceof Prop) || ((Prop) mWishGiftComboView.f25686f.f21695b).count >= mWishGiftComboView.f25685e) {
                    mWishGiftComboView.f25685e++;
                    if (mWishGiftComboView.f25684d == 0) {
                        mWishGiftComboView.mo17586a();
                        mWishGiftComboView.f25683c = new AnimatorSet();
                        mWishGiftComboView.f25683c.playTogether(ObjectAnimator.ofFloat(mWishGiftComboView.f25681a, "scaleX", 1.0f, 1.1f, 1.0f), ObjectAnimator.ofFloat(mWishGiftComboView.f25681a, "scaleY", 1.0f, 1.1f, 1.0f), ObjectAnimator.ofFloat(mWishGiftComboView.f25682b, "scaleX", 1.0f, 1.1f, 1.0f), ObjectAnimator.ofFloat(mWishGiftComboView.f25682b, "scaleY", 1.0f, 1.1f, 1.0f));
                        mWishGiftComboView.f25683c.setDuration(300L);
                        if (Build.VERSION.SDK_INT >= 21) {
                            mWishGiftComboView.f25683c.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
                        }
                        mWishGiftComboView.f25683c.addListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012c: INVOKE  
                              (wrap: android.animation.AnimatorSet : 0x0125: IGET  (r1v32 android.animation.AnimatorSet) = 
                              (r9v1 'mWishGiftComboView' com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView)
                             com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.c android.animation.AnimatorSet)
                              (wrap: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$1 : 0x0129: CONSTRUCTOR  (r0v75 com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$1) = 
                              (r9v1 'mWishGiftComboView' com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView)
                              (r12v1 'cVar' com.bytedance.android.livesdk.wishlist.view.WishGiftView$c)
                             call: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.1.<init>(com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView, java.lang.Runnable):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.bytedance.android.livesdk.wishlist.view.WishGiftView.b.onClick(android.view.View):void, file: classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0129: CONSTRUCTOR  (r0v75 com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$1) = 
                              (r9v1 'mWishGiftComboView' com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView)
                              (r12v1 'cVar' com.bytedance.android.livesdk.wishlist.view.WishGiftView$c)
                             call: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.1.<init>(com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView, java.lang.Runnable):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.wishlist.view.WishGiftView.b.onClick(android.view.View):void, file: classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 29 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 35 more
                            */
                        /*
                        // Method dump skipped, instructions count: 808
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wishlist.view.WishGiftView.View$OnClickListenerC11558b.onClick(android.view.View):void");
                    }
                }

                /* renamed from: a */
                public final void mo18360a(int i, int i2) {
                    int i3;
                    getMProgressBar().setVisibility(0);
                    ProgressBar mProgressBar = getMProgressBar();
                    double d = (double) i;
                    double d2 = (double) i2;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double d3 = (d / d2) * 100.0d;
                    if (d3 > 100.0d) {
                        i3 = 100;
                    } else {
                        i3 = (int) d3;
                    }
                    mProgressBar.setProgress(i3);
                }

                /* renamed from: b */
                public final void mo18362b(int i, int i2) {
                    SpannableString spannableString;
                    if (!C3966y.m9672g()) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf = String.valueOf(i);
                        Locale locale = Locale.ENGLISH;
                        C89219l.m154716b(locale, "");
                        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                        String upperCase = valueOf.toUpperCase(locale);
                        C89219l.m154716b(upperCase, "");
                        StringBuilder append = sb.append(upperCase).append('/');
                        String valueOf2 = String.valueOf(i2);
                        Locale locale2 = Locale.ENGLISH;
                        C89219l.m154716b(locale2, "");
                        Objects.requireNonNull(valueOf2, "null cannot be cast to non-null type java.lang.String");
                        String upperCase2 = valueOf2.toUpperCase(locale2);
                        C89219l.m154716b(upperCase2, "");
                        spannableString = new SpannableString(append.append(upperCase2).toString());
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#D662FF")), 0, String.valueOf(i).length(), 33);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        String valueOf3 = String.valueOf(i2);
                        Locale locale3 = Locale.ENGLISH;
                        C89219l.m154716b(locale3, "");
                        Objects.requireNonNull(valueOf3, "null cannot be cast to non-null type java.lang.String");
                        String upperCase3 = valueOf3.toUpperCase(locale3);
                        C89219l.m154716b(upperCase3, "");
                        StringBuilder append2 = sb2.append(upperCase3).append('/');
                        String valueOf4 = String.valueOf(i);
                        Locale locale4 = Locale.ENGLISH;
                        C89219l.m154716b(locale4, "");
                        Objects.requireNonNull(valueOf4, "null cannot be cast to non-null type java.lang.String");
                        String upperCase4 = valueOf4.toUpperCase(locale4);
                        C89219l.m154716b(upperCase4, "");
                        String sb3 = append2.append(upperCase4).toString();
                        spannableString = new SpannableString(sb3);
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#D662FF")), sb3.length() - String.valueOf(i).length(), sb3.length(), 33);
                    }
                    getMProgressText().setVisibility(0);
                    getMProgressText().setText(spannableString);
                }

                private /* synthetic */ WishGiftView(Context context, AttributeSet attributeSet, byte b) {
                    this(context, attributeSet, (char) 0);
                }

                private WishGiftView(Context context, AttributeSet attributeSet, char c) {
                    super(context, attributeSet, 0);
                    MethodCollector.m26663i(6089);
                    C1764a.m5927a(LayoutInflater.from(context), R.layout.bfj, this, true);
                    this.f27671d = C89250i.m154773a((AbstractC89171a) new C11561e(this));
                    this.f27672e = C89250i.m154773a((AbstractC89171a) new C11563g(this));
                    this.f27673f = C89250i.m154773a((AbstractC89171a) new C11562f(this));
                    this.f27674g = C89250i.m154773a((AbstractC89171a) new C11560d(this));
                    this.f27675h = C89250i.m154773a((AbstractC89171a) new C11564h(this));
                    this.f27676i = C89250i.m154773a((AbstractC89171a) new C11565i(this));
                    this.f27677j = C89250i.m154773a((AbstractC89171a) new C11566j(this));
                    this.f27678k = C89250i.m154773a((AbstractC89171a) new C11567k(this));
                    this.f27679l = C89250i.m154773a((AbstractC89171a) new C11568l(this));
                    MethodCollector.m26664o(6089);
                }
            }

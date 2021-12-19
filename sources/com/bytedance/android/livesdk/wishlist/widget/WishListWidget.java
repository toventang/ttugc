package com.bytedance.android.livesdk.wishlist.widget;

import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.livesdk.livesetting.gift.LiveWishlistAnchorpanelUrlSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdk.wishlist.p663a.C11513a;
import com.bytedance.android.livesdk.wishlist.p664b.C11518a;
import com.bytedance.android.livesdk.wishlist.p665c.C11541b;
import com.bytedance.android.livesdk.wishlist.p666d.C11543a;
import com.bytedance.android.livesdk.wishlist.view.C11578a;
import com.bytedance.android.livesdk.wishlist.view.WishContributorView;
import com.bytedance.android.livesdk.wishlist.view.WishGiftView;
import com.bytedance.android.livesdk.wishlist.view.WishListInProgressView;
import com.bytedance.android.livesdk.wishlist.view.WishListNotSetView;
import com.bytedance.android.livesdk.wishlist.view.WishListServerErrorView;
import com.bytedance.android.livesdk.wishlist.view.WishListThanksView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class WishListWidget extends RoomRecycleWidget implements C11513a.AbstractC11515b, AbstractC33974au {

    /* renamed from: c */
    public static final C11579a f27714c = new C11579a((byte) 0);

    /* renamed from: a */
    C11518a f27715a;

    /* renamed from: b */
    public final C11513a.AbstractC11514a f27716b = new C11543a();

    /* renamed from: d */
    private final AbstractC89244h f27717d = C89250i.m154773a((AbstractC89171a) new C11582d(this));

    /* renamed from: e */
    private final AbstractC89244h f27718e = C89250i.m154773a((AbstractC89171a) new C11581c(this));

    /* renamed from: f */
    private final AbstractC89244h f27719f = C89250i.m154773a((AbstractC89171a) new C11583e(this));

    /* renamed from: g */
    private final AbstractC89244h f27720g = C89250i.m154773a((AbstractC89171a) new C11580b(this));

    static {
        Covode.recordClassIndex(13244);
    }

    /* renamed from: c */
    private final WishListNotSetView m20397c() {
        return (WishListNotSetView) this.f27717d.getValue();
    }

    /* renamed from: d */
    private final WishListInProgressView m20398d() {
        return (WishListInProgressView) this.f27718e.getValue();
    }

    /* renamed from: e */
    private final WishListThanksView m20399e() {
        return (WishListThanksView) this.f27719f.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo18383b() {
        return ((Boolean) this.f27720g.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgw;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.widget.WishListWidget$a */
    public static final class C11579a {
        static {
            Covode.recordClassIndex(13245);
        }

        private C11579a() {
        }

        public /* synthetic */ C11579a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.widget.WishListWidget$c */
    static final class C11581c extends AbstractC89220m implements AbstractC89171a<WishListInProgressView> {

        /* renamed from: a */
        final /* synthetic */ WishListWidget f27722a;

        static {
            Covode.recordClassIndex(13247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11581c(WishListWidget wishListWidget) {
            super(0);
            this.f27722a = wishListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishListInProgressView invoke() {
            return this.f27722a.findViewById(R.id.fjc);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.widget.WishListWidget$d */
    static final class C11582d extends AbstractC89220m implements AbstractC89171a<WishListNotSetView> {

        /* renamed from: a */
        final /* synthetic */ WishListWidget f27723a;

        static {
            Covode.recordClassIndex(13248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11582d(WishListWidget wishListWidget) {
            super(0);
            this.f27723a = wishListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishListNotSetView invoke() {
            return this.f27723a.findViewById(R.id.fje);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.widget.WishListWidget$e */
    static final class C11583e extends AbstractC89220m implements AbstractC89171a<WishListThanksView> {

        /* renamed from: a */
        final /* synthetic */ WishListWidget f27724a;

        static {
            Covode.recordClassIndex(13249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11583e(WishListWidget wishListWidget) {
            super(0);
            this.f27724a = wishListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WishListThanksView invoke() {
            return this.f27724a.findViewById(R.id.fjh);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.widget.WishListWidget$b */
    static final class C11580b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ WishListWidget f27721a;

        static {
            Covode.recordClassIndex(13246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11580b(WishListWidget wishListWidget) {
            super(0);
            this.f27721a = wishListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean bool;
            DataChannel dataChannel = this.f27721a.dataChannel;
            if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9119ed.class)) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: f */
    private final void m20400f() {
        m20397c().setVisibility(8);
        m20398d().setVisibility(8);
        m20399e().setVisibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        C11518a aVar;
        C11518a aVar2 = this.f27715a;
        if (!(aVar2 == null || !aVar2.mo18054n() || (aVar = this.f27715a) == null)) {
            aVar.dismiss();
        }
        this.f27716b.mo18325a();
    }

    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11515b
    /* renamed from: a */
    public final void mo18331a() {
        SpannableString spannableString;
        int i;
        m20400f();
        View view = getView();
        if (view != null) {
            view.setVisibility(0);
        }
        int i2 = C11585a.f27726a[this.f27716b.mo18328b().ordinal()];
        if (i2 != 1) {
            ImageModel imageModel = null;
            if (i2 == 2) {
                m20398d().setVisibility(0);
                WishListInProgressView d = m20398d();
                List<C8860x.C8861a> c = this.f27716b.mo18329c();
                C89219l.m154721d(c, "");
                if (!c.isEmpty()) {
                    d.f27692g = c;
                }
                if (!d.f27692g.isEmpty()) {
                    d.f27693h = (d.f27693h + 1) % d.f27692g.size();
                    C8860x.C8861a aVar = (C8860x.C8861a) d.f27692g.get(d.f27693h);
                    HSImageView mGiftIcon = d.getMGiftIcon();
                    C8860x.C8861a.C8862a aVar2 = aVar.f21806e;
                    if (aVar2 != null) {
                        imageModel = aVar2.f21808b;
                    }
                    C7577g.m15573a(mGiftIcon, imageModel);
                    int i3 = aVar.f21804c;
                    int i4 = aVar.f21805d;
                    if (!C3966y.m9672g()) {
                        spannableString = new SpannableString(new StringBuilder().append(i3).append('/').append(i4).toString());
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FACE15")), 0, String.valueOf(i3).length(), 33);
                    } else {
                        String sb = new StringBuilder().append(i4).append('/').append(i3).toString();
                        spannableString = new SpannableString(sb);
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FACE15")), sb.length() - String.valueOf(i3).length(), sb.length(), 33);
                    }
                    d.getMWishesProgressText().setText(spannableString);
                    ProgressBar mWishListProgressView = d.getMWishListProgressView();
                    double d2 = (double) i3;
                    double d3 = (double) i4;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = (d2 / d3) * 100.0d;
                    if (d4 > 100.0d) {
                        i = 100;
                    } else {
                        i = (int) d4;
                    }
                    mWishListProgressView.setProgress(i);
                }
            } else if (i2 == 3) {
                m20399e().setVisibility(0);
                WishListThanksView e = m20399e();
                if (!this.f27716b.mo18330d().isEmpty()) {
                    imageModel = this.f27716b.mo18330d().get(0).f21811a;
                }
                if (imageModel != null) {
                    ImageView mAvatarView = e.getMAvatarView();
                    ImageView mAvatarView2 = e.getMAvatarView();
                    C89219l.m154716b(mAvatarView2, "");
                    int width = mAvatarView2.getWidth();
                    ImageView mAvatarView3 = e.getMAvatarView();
                    C89219l.m154716b(mAvatarView3, "");
                    C7577g.m15571a(mAvatarView, imageModel, width, mAvatarView3.getHeight(), 2131234441);
                } else {
                    ImageView mAvatarView4 = e.getMAvatarView();
                    ImageView mAvatarView5 = e.getMAvatarView();
                    C89219l.m154716b(mAvatarView5, "");
                    int width2 = mAvatarView5.getWidth();
                    ImageView mAvatarView6 = e.getMAvatarView();
                    C89219l.m154716b(mAvatarView6, "");
                    C3951p.m9620a(mAvatarView4, 2131234441, width2, mAvatarView6.getHeight());
                }
                int i5 = C11578a.f27713a[e.f27703g.ordinal()];
                if (i5 == 1) {
                    ConstraintLayout mFulfilledLayout = e.getMFulfilledLayout();
                    C89219l.m154716b(mFulfilledLayout, "");
                    mFulfilledLayout.setVisibility(0);
                    ConstraintLayout mThanksLayout = e.getMThanksLayout();
                    C89219l.m154716b(mThanksLayout, "");
                    mThanksLayout.setVisibility(8);
                    e.f27703g = WishListThanksView.EnumC11574a.THANKS;
                } else if (i5 == 2) {
                    ConstraintLayout mFulfilledLayout2 = e.getMFulfilledLayout();
                    C89219l.m154716b(mFulfilledLayout2, "");
                    mFulfilledLayout2.setVisibility(8);
                    ConstraintLayout mThanksLayout2 = e.getMThanksLayout();
                    C89219l.m154716b(mThanksLayout2, "");
                    mThanksLayout2.setVisibility(0);
                    e.f27703g = WishListThanksView.EnumC11574a.FULFILLED;
                }
            }
        } else if (mo18383b()) {
            m20397c().setVisibility(0);
            m20397c();
        } else {
            View view2 = getView();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view = getView();
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.dataChannel != null) {
            m20400f();
            C11513a.AbstractC11514a aVar = this.f27716b;
            DataChannel dataChannel = this.dataChannel;
            C89219l.m154716b(dataChannel, "");
            aVar.mo18326a(dataChannel, this);
            View view2 = getView();
            if (view2 != null) {
                view2.setOnClickListener(new View$OnClickListenerC11584f(this));
            }
            if (mo18383b()) {
                C11541b.m20374a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.widget.WishListWidget$f */
    static final class View$OnClickListenerC11584f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WishListWidget f27725a;

        static {
            Covode.recordClassIndex(13250);
        }

        View$OnClickListenerC11584f(WishListWidget wishListWidget) {
            this.f27725a = wishListWidget;
        }

        public final void onClick(View view) {
            Room room;
            User user;
            AbstractC0952i iVar;
            C11518a aVar;
            WishListWidget wishListWidget = this.f27725a;
            if (wishListWidget.mo18383b()) {
                ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(wishListWidget.context, Uri.parse(LiveWishlistAnchorpanelUrlSetting.INSTANCE.getValue()));
            } else {
                DataChannel dataChannel = wishListWidget.dataChannel;
                if (dataChannel != null) {
                    room = (Room) dataChannel.mo28318b(C9093de.class);
                    if (room != null) {
                        user = room.getOwner();
                    }
                    user = null;
                } else {
                    room = null;
                    user = null;
                }
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                User from = User.from(b.mo13147a());
                DataChannel dataChannel2 = wishListWidget.dataChannel;
                if (dataChannel2 != null) {
                    iVar = (AbstractC0952i) dataChannel2.mo28318b(C9021ao.class);
                } else {
                    iVar = null;
                }
                if (!(room == null || room.getOwnerUserId() <= 0 || room.getId() <= 0 || user == null || from == null || iVar == null)) {
                    C11518a.C11519a aVar2 = new C11518a.C11519a();
                    C89219l.m154721d(user, "");
                    aVar2.f27614b = user;
                    C89219l.m154721d(room, "");
                    aVar2.f27613a = room;
                    C89219l.m154721d(from, "");
                    aVar2.f27615c = from;
                    if (aVar2.f27613a == null || aVar2.f27614b == null || aVar2.f27615c == null) {
                        aVar = null;
                    } else {
                        aVar = new C11518a((byte) 0);
                        Room room2 = aVar2.f27613a;
                        if (room2 == null) {
                            C89219l.m154715b();
                        }
                        aVar.f27593a = room2;
                        User user2 = aVar2.f27614b;
                        if (user2 == null) {
                            C89219l.m154715b();
                        }
                        aVar.f27594b = user2;
                        User user3 = aVar2.f27615c;
                        if (user3 == null) {
                            C89219l.m154715b();
                        }
                        aVar.f27595c = user3;
                    }
                    wishListWidget.f27715a = aVar;
                    C11518a aVar3 = wishListWidget.f27715a;
                    if (aVar3 != null) {
                        aVar3.show(iVar, "WISH_LIST_WIDGET");
                    }
                }
            }
            this.f27725a.f27716b.mo18327a(true, (AbstractC89171a<C89391z>) null);
            C6501b.C6502a.m13948a("livesdk_wishlist_entrance_click").mo12639a().mo12652a(C11541b.m20373a(false)).mo12655b();
        }
    }

    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11515b
    /* renamed from: a */
    public final void mo18332a(boolean z, C11543a.C11546c cVar) {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        TextPaint textPaint;
        String str;
        C11518a aVar = this.f27715a;
        if (aVar != null && aVar.mo18054n()) {
            if (!z || cVar == null || cVar.f27649a.isEmpty()) {
                C11518a aVar2 = this.f27715a;
                if (aVar2 != null) {
                    LiveLoadingView f = aVar2.mo18336f();
                    if (f != null) {
                        f.setVisibility(8);
                    }
                    WishListServerErrorView e = aVar2.mo18335e();
                    if (e != null) {
                        e.setVisibility(0);
                    }
                    View d = aVar2.mo9929d();
                    if (d != null) {
                        d.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            C11518a aVar3 = this.f27715a;
            if (aVar3 != null) {
                C89219l.m154721d(cVar, "");
                LiveLoadingView f2 = aVar3.mo18336f();
                if (f2 != null) {
                    f2.setVisibility(8);
                }
                WishListServerErrorView e2 = aVar3.mo18335e();
                if (e2 != null) {
                    e2.setVisibility(8);
                }
                View d2 = aVar3.mo9929d();
                if (d2 != null) {
                    d2.setVisibility(0);
                }
                aVar3.f27596d = true;
                ImageView imageView = (ImageView) aVar3.f27597e.getValue();
                if (imageView != null) {
                    User user = aVar3.f27594b;
                    if (user == null) {
                        C89219l.m154710a("mAnchor");
                    }
                    C7577g.m15571a(imageView, user.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), 2131234635);
                }
                LiveTextView g = aVar3.mo18337g();
                if (g != null) {
                    int c = C3966y.m9664c() - C3966y.m9653a(97.0f);
                    Object[] objArr = new Object[1];
                    User user2 = aVar3.f27594b;
                    if (user2 == null) {
                        C89219l.m154710a("mAnchor");
                    }
                    objArr[0] = user2.displayId;
                    String a = C3966y.m9660a((int) R.string.eo8, objArr);
                    LiveTextView g2 = aVar3.mo18337g();
                    if (g2 != null) {
                        textPaint = g2.getPaint();
                    } else {
                        textPaint = null;
                    }
                    float f3 = (float) c;
                    if (!(a == null || "".equals(a) || textPaint == null)) {
                        Rect rect = new Rect();
                        textPaint.getTextBounds(a, 0, a.length(), rect);
                        if (f3 <= ((float) rect.width())) {
                            str = C3966y.m9657a((int) R.string.eo3);
                            C89219l.m154716b(str, "");
                            g.setText(str);
                        }
                    }
                    Object[] objArr2 = new Object[1];
                    User user3 = aVar3.f27594b;
                    if (user3 == null) {
                        C89219l.m154710a("mAnchor");
                    }
                    objArr2[0] = user3.displayId;
                    str = C3966y.m9660a((int) R.string.eo8, objArr2);
                    C89219l.m154716b(str, "");
                    g.setText(str);
                }
                LiveTextView liveTextView = (LiveTextView) aVar3.f27598f.getValue();
                if (liveTextView != null) {
                    Object[] objArr3 = new Object[1];
                    User user4 = aVar3.f27595c;
                    if (user4 == null) {
                        C89219l.m154710a("mSelf");
                    }
                    objArr3[0] = user4.displayId;
                    liveTextView.setText(C3966y.m9660a((int) R.string.eo7, objArr3));
                }
                LiveTextView liveTextView2 = (LiveTextView) aVar3.f27599g.getValue();
                if (liveTextView2 != null) {
                    liveTextView2.setText(cVar.f27651c);
                }
                aVar3.mo18334a(aVar3.mo18338h(), cVar.f27649a.get(0));
                if (cVar.f27649a.size() > 1) {
                    aVar3.mo18334a(aVar3.mo18339j(), cVar.f27649a.get(1));
                } else {
                    WishGiftView j = aVar3.mo18339j();
                    if (j != null) {
                        j.setVisibility(8);
                    }
                }
                if (cVar.f27649a.size() > 2) {
                    aVar3.mo18334a(aVar3.mo18340k(), cVar.f27649a.get(2));
                } else {
                    WishGiftView k = aVar3.mo18340k();
                    if (k != null) {
                        k.setVisibility(8);
                    }
                }
                int i = cVar.f27652d;
                if (i <= 0) {
                    View view = aVar3.getView();
                    if (!(view == null || (relativeLayout2 = (RelativeLayout) view.findViewById(R.id.c7p)) == null)) {
                        relativeLayout2.setVisibility(8);
                    }
                    ImageView p = aVar3.mo18344p();
                    if (p != null) {
                        p.setVisibility(0);
                    }
                    LiveTextView q = aVar3.mo18345q();
                    if (q != null) {
                        C11279p.m19999a((View) q, C3966y.m9653a(6.0f));
                    }
                    LiveTextView q2 = aVar3.mo18345q();
                    if (q2 != null) {
                        q2.setText(C3966y.m9657a((int) R.string.eo6));
                    }
                } else if (!cVar.f27650b.isEmpty()) {
                    View view2 = aVar3.getView();
                    if (!(view2 == null || (relativeLayout = (RelativeLayout) view2.findViewById(R.id.c7p)) == null)) {
                        relativeLayout.setVisibility(0);
                    }
                    ImageView p2 = aVar3.mo18344p();
                    if (p2 != null) {
                        p2.setVisibility(8);
                    }
                    LiveTextView q3 = aVar3.mo18345q();
                    if (q3 != null) {
                        C11279p.m19999a((View) q3, C3966y.m9653a(12.0f));
                    }
                    LiveTextView q4 = aVar3.mo18345q();
                    if (q4 != null) {
                        q4.setText(C3966y.m9659a(R.plurals.gp, i, Integer.valueOf(i)));
                    }
                    WishContributorView wishContributorView = (WishContributorView) aVar3.f27600h.getValue();
                    if (wishContributorView != null) {
                        ImageModel imageModel = cVar.f27650b.get(0).f21811a;
                        if (imageModel == null) {
                            imageModel = new ImageModel();
                        }
                        C89219l.m154716b(imageModel, "");
                        wishContributorView.mo18354a(new WishContributorView.C11554a(imageModel, 1));
                    }
                    if (i > 1) {
                        WishContributorView l = aVar3.mo18341l();
                        if (l != null) {
                            l.setVisibility(0);
                        }
                        WishContributorView l2 = aVar3.mo18341l();
                        if (l2 != null) {
                            ImageModel imageModel2 = cVar.f27650b.get(1).f21811a;
                            if (imageModel2 == null) {
                                imageModel2 = new ImageModel();
                            }
                            C89219l.m154716b(imageModel2, "");
                            l2.mo18354a(new WishContributorView.C11554a(imageModel2, 2));
                        }
                    } else {
                        WishContributorView l3 = aVar3.mo18341l();
                        if (l3 != null) {
                            l3.setVisibility(8);
                        }
                    }
                    if (i > 2) {
                        WishContributorView m = aVar3.mo18342m();
                        if (m != null) {
                            m.setVisibility(0);
                        }
                        WishContributorView m2 = aVar3.mo18342m();
                        if (m2 != null) {
                            ImageModel imageModel3 = cVar.f27650b.get(2).f21811a;
                            if (imageModel3 == null) {
                                imageModel3 = new ImageModel();
                            }
                            C89219l.m154716b(imageModel3, "");
                            m2.mo18354a(new WishContributorView.C11554a(imageModel3, 3));
                        }
                    } else {
                        WishContributorView m3 = aVar3.mo18342m();
                        if (m3 != null) {
                            m3.setVisibility(8);
                        }
                    }
                    if (i > 3) {
                        ImageView o = aVar3.mo18343o();
                        if (o != null) {
                            o.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    ImageView o2 = aVar3.mo18343o();
                    if (o2 != null) {
                        o2.setVisibility(8);
                    }
                }
            }
        }
    }
}

package com.bytedance.android.live.liveinteract.multiguest.opt.widget;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

public final class MultiGuestAnchorAvatarBgWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public LiveTextView f13843a;

    /* renamed from: b */
    public AbstractC88412b f13844b;

    /* renamed from: c */
    private HSImageView f13845c;

    /* renamed from: d */
    private HSImageView f13846d;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAnchorAvatarBgWidget$b */
    static final class C5358b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5358b f13848a = new C5358b();

        static {
            Covode.recordClassIndex(5951);
        }

        C5358b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5949);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bc6;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AbstractC88412b bVar = this.f13844b;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ImageModel imageModel;
        List<String> urls;
        User owner;
        super.onCreate();
        View findViewById = findViewById(R.id.cwc);
        C89219l.m154716b(findViewById, "");
        this.f13845c = (HSImageView) findViewById;
        View findViewById2 = findViewById(R.id.cwf);
        C89219l.m154716b(findViewById2, "");
        this.f13846d = (HSImageView) findViewById2;
        View findViewById3 = findViewById(R.id.eug);
        C89219l.m154716b(findViewById3, "");
        LiveTextView liveTextView = (LiveTextView) findViewById3;
        this.f13843a = liveTextView;
        if (liveTextView == null) {
            C89219l.m154710a("mCountDownTv");
        }
        liveTextView.setVisibility(0);
        this.f13844b = C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b(6).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5357a(this), C5358b.f13848a);
        HSImageView hSImageView = this.f13845c;
        if (hSImageView == null) {
            C89219l.m154710a("mAvatarIcon");
        }
        hSImageView.setVisibility(0);
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null || (owner = room.getOwner()) == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarThumb();
        }
        HSImageView hSImageView2 = this.f13845c;
        if (hSImageView2 == null) {
            C89219l.m154710a("mAvatarIcon");
        }
        HSImageView hSImageView3 = this.f13845c;
        if (hSImageView3 == null) {
            C89219l.m154710a("mAvatarIcon");
        }
        int width = hSImageView3.getWidth();
        HSImageView hSImageView4 = this.f13845c;
        if (hSImageView4 == null) {
            C89219l.m154710a("mAvatarIcon");
        }
        C7577g.m15571a(hSImageView2, imageModel, width, hSImageView4.getHeight(), 2131234441);
        HSImageView hSImageView5 = this.f13846d;
        if (hSImageView5 == null) {
            C89219l.m154710a("mAvatarBg");
        }
        hSImageView5.setVisibility(0);
        C11291z zVar = new C11291z(5, 0.0f);
        if (imageModel == null || (urls = imageModel.getUrls()) == null || urls.size() != 0) {
            HSImageView hSImageView6 = this.f13846d;
            if (hSImageView6 == null) {
                C89219l.m154710a("mAvatarBg");
            }
            C3941k.m9604a(hSImageView6, imageModel, zVar);
            return;
        }
        C24639c a = C24639c.m47149a(C24134g.m45734a(2131234441));
        a.f58560k = zVar;
        C24185e b = C24182c.m45843b();
        b.f57299c = (REQUEST) a.mo40483a();
        HSImageView hSImageView7 = this.f13846d;
        if (hSImageView7 == null) {
            C89219l.m154710a("mAvatarBg");
        }
        b.f57309m = hSImageView7.getController();
        AbstractC24195a c = b.mo39827e();
        HSImageView hSImageView8 = this.f13846d;
        if (hSImageView8 == null) {
            C89219l.m154710a("mAvatarBg");
        }
        hSImageView8.setController(c);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAnchorAvatarBgWidget$a */
    static final class C5357a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAnchorAvatarBgWidget f13847a;

        static {
            Covode.recordClassIndex(5950);
        }

        C5357a(MultiGuestAnchorAvatarBgWidget multiGuestAnchorAvatarBgWidget) {
            this.f13847a = multiGuestAnchorAvatarBgWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC88412b bVar;
            long longValue = 5 - ((Number) obj).longValue();
            LiveTextView liveTextView = this.f13847a.f13843a;
            if (liveTextView == null) {
                C89219l.m154710a("mCountDownTv");
            }
            liveTextView.setText(String.valueOf(longValue));
            if (longValue == 0 && (bVar = this.f13847a.f13844b) != null) {
                bVar.dispose();
            }
        }
    }
}

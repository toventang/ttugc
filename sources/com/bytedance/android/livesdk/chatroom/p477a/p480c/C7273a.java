package com.bytedance.android.livesdk.chatroom.p477a.p480c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.p545c.p546a.p547a.C8795a;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.livesdk.model.FraternityInfo;
import com.bytedance.android.livesdk.model.message.C9717ca;
import com.bytedance.android.livesdk.utils.C11214ag;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.barrage.p4467a.C87057c;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.a */
public final class C7273a {

    /* renamed from: a */
    public final View f18094a;

    /* renamed from: b */
    public C87057c f18095b;

    /* renamed from: c */
    public final ImageView f18096c;

    /* renamed from: d */
    public final ImageView f18097d;

    /* renamed from: e */
    final ImageView f18098e;

    /* renamed from: f */
    final TextView f18099f;

    /* renamed from: g */
    final ImageView f18100g;

    /* renamed from: h */
    final TextView f18101h;

    /* renamed from: i */
    public final ImageView f18102i;

    /* renamed from: j */
    private final TextView f18103j;

    /* renamed from: k */
    private final ImageView f18104k;

    static {
        Covode.recordClassIndex(8024);
    }

    public C7273a(View view, C9717ca caVar) {
        ImageModel background;
        FansClubData fansClubData;
        this.f18094a = view;
        TextView textView = (TextView) view.findViewById(R.id.eu6);
        this.f18103j = textView;
        textView.setText(caVar.f23680f);
        int i = Build.VERSION.SDK_INT;
        if (!C6229a.m13521a(C3966y.m9669e())) {
            textView.setTextDirection(3);
        }
        this.f18096c = (ImageView) view.findViewById(R.id.bdw);
        ImageView imageView = (ImageView) view.findViewById(R.id.bwb);
        this.f18097d = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.az5);
        this.f18098e = imageView2;
        TextView textView2 = (TextView) view.findViewById(R.id.az6);
        this.f18099f = textView2;
        ImageView imageView3 = (ImageView) view.findViewById(R.id.b8p);
        this.f18100g = imageView3;
        TextView textView3 = (TextView) view.findViewById(R.id.b8q);
        this.f18101h = textView3;
        ImageView imageView4 = (ImageView) view.findViewById(R.id.s7);
        this.f18102i = imageView4;
        TextView textView4 = (TextView) view.findViewById(R.id.f02);
        this.f18104k = (ImageView) view.findViewById(R.id.e4t);
        ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a(caVar.f23681g.getAvatarThumb(), new AbstractC11803e.AbstractC11805b() {
            /* class com.bytedance.android.livesdk.chatroom.p477a.p480c.C7273a.C72741 */

            static {
                Covode.recordClassIndex(8025);
            }

            @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
            /* renamed from: a */
            public final void mo8986a(Bitmap bitmap) {
                Bitmap a;
                if (bitmap != null && !bitmap.isRecycled() && (a = C8795a.m17102a(bitmap)) != null && !a.isRecycled()) {
                    C7273a.this.f18096c.setImageBitmap(a);
                    if (C7273a.this.f18095b != null) {
                        C7273a.this.f18095b.mo140678a(C7273a.this.f18094a);
                    }
                }
            }
        });
        if (caVar.f23681g.getUserHonor() == null || caVar.f23681g.getUserHonor().f23208m <= 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a(caVar.f23681g.getUserHonor().mo16484n(), new AbstractC11803e.AbstractC11805b() {
                /* class com.bytedance.android.livesdk.chatroom.p477a.p480c.C7273a.C72752 */

                static {
                    Covode.recordClassIndex(8026);
                }

                @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
                /* renamed from: a */
                public final void mo8986a(Bitmap bitmap) {
                    MethodCollector.m26663i(6884);
                    if (bitmap == null || bitmap.isRecycled()) {
                        MethodCollector.m26664o(6884);
                        return;
                    }
                    ImageView imageView = C7273a.this.f18097d;
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    RectF rectF = new RectF(rect);
                    paint.setAntiAlias(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-12434878);
                    canvas.drawOval(rectF, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, rect, rect, paint);
                    imageView.setImageBitmap(createBitmap);
                    C7273a.this.f18097d.setVisibility(0);
                    if (C7273a.this.f18095b != null) {
                        C7273a.this.f18095b.mo140678a(C7273a.this.f18094a);
                    }
                    MethodCollector.m26664o(6884);
                }
            });
        }
        textView4.setText(caVar.f23681g.getNickName());
        textView4.measure(0, 0);
        textView.measure(0, 0);
        if (textView.getMeasuredWidth() < textView4.getMeasuredWidth()) {
            textView.setWidth(textView4.getMeasuredWidth());
        }
        if (caVar.f23684j != null) {
            if (!(caVar.f23684j.f23850a == null || caVar.f23684j.f23850a.getUrls() == null)) {
                C11214ag.m19870a(caVar.f23684j.f23850a, textView, C6229a.m13521a(C3966y.m9669e()), new RunnableC7277b(this));
            }
            if (!(caVar.f23684j.f23851b == null || imageView4 == null)) {
                ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a(caVar.f23684j.f23851b, new AbstractC11803e.AbstractC11805b() {
                    /* class com.bytedance.android.livesdk.chatroom.p477a.p480c.C7273a.C72763 */

                    static {
                        Covode.recordClassIndex(8027);
                    }

                    @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
                    /* renamed from: a */
                    public final void mo8986a(Bitmap bitmap) {
                        MethodCollector.m26663i(6645);
                        if (bitmap == null || bitmap.isRecycled()) {
                            MethodCollector.m26664o(6645);
                            return;
                        }
                        C7273a.this.f18102i.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true));
                        if (C7273a.this.f18095b != null) {
                            C7273a.this.f18095b.mo140678a(C7273a.this.f18094a);
                        }
                        MethodCollector.m26664o(6645);
                    }
                });
            }
        }
        User user = caVar.f23681g;
        if (user != null) {
            if (user.getFansClub() != null) {
                if (FansClubData.isValid(user.getFansClub().getData())) {
                    fansClubData = user.getFansClub().getData();
                } else if (user.getFansClub().getPreferData() != null) {
                    fansClubData = user.getFansClub().getPreferData().get(1);
                } else {
                    fansClubData = null;
                }
                if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                    ImageModel imageModel = fansClubData.badge.icons.get(2);
                    if (imageModel != null) {
                        TextImageModel textImageModel = new TextImageModel(imageModel, 1);
                        textImageModel.f27880a = fansClubData.clubName;
                        C7577g.m15569a(textImageModel).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C7278c(this, fansClubData), new C7279d(this));
                    }
                } else if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }
            FraternityInfo fraternityInfo = user.getFraternityInfo();
            if (!(imageView3 == null || textView3 == null)) {
                if (fraternityInfo == null || !fraternityInfo.isValid() || (background = fraternityInfo.getBackground()) == null) {
                    this.f18100g.setVisibility(8);
                    this.f18101h.setVisibility(8);
                } else {
                    TextImageModel textImageModel2 = new TextImageModel(background, 4);
                    textImageModel2.f27880a = fraternityInfo.getName();
                    try {
                        textImageModel2.f27881b = Color.parseColor(fraternityInfo.getFontColor());
                    } catch (IllegalArgumentException e) {
                        C3854a.m9454a(5, "BarrageViewHolder", null, e);
                    }
                    C7577g.m15569a(textImageModel2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C7280e(this, textImageModel2), new C7281f(this));
                }
            }
        }
        if (caVar.f23681g == null || TextUtils.isEmpty(caVar.f23681g.getSpecialId())) {
            this.f18104k.setVisibility(8);
        } else {
            this.f18104k.setVisibility(0);
        }
        C87057c cVar = new C87057c(this.f18094a);
        this.f18095b = cVar;
        cVar.f196256i = caVar.mo16596c();
        UserProfileEvent userProfileEvent = new UserProfileEvent(caVar.f23681g);
        userProfileEvent.mSource = "live_barrage";
        this.f18095b.f196254g = new C7282g(userProfileEvent);
    }
}

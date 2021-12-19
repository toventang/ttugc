package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2757dg.C41469a;
import com.p2082ss.android.ugc.aweme.p2757dg.C41472d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.C72928b;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b */
public final class C72967b extends AbstractC72946a {

    /* renamed from: p */
    public static final C72969a f163731p = new C72969a((byte) 0);

    /* renamed from: a */
    View f163732a;

    /* renamed from: l */
    final C72928b f163733l;

    /* renamed from: m */
    public Handler f163734m;

    /* renamed from: n */
    public Runnable f163735n;

    /* renamed from: o */
    final AbstractC72926g f163736o;

    /* renamed from: q */
    private final BusinessExtraData f163737q;

    /* renamed from: r */
    private final Aweme f163738r;

    static {
        Covode.recordClassIndex(85670);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$a */
    public static final class C72969a {
        static {
            Covode.recordClassIndex(85672);
        }

        private C72969a() {
        }

        public /* synthetic */ C72969a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: j */
    public final void mo115312j() {
        Handler handler;
        super.mo115312j();
        Runnable runnable = this.f163735n;
        if (runnable != null && (handler = this.f163734m) != null) {
            handler.post(runnable);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: k */
    public final void mo115313k() {
        super.mo115313k();
        Handler handler = this.f163734m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: a */
    public final View mo115223a() {
        MethodCollector.m26663i(8081);
        if (C72890c.m128720a(this.f163695i)) {
            if (this.f163732a == null) {
                this.f163732a = new C72970c(this.f163695i);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f163732a;
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
            View view2 = this.f163732a;
            MethodCollector.m26664o(8081);
            return view2;
        }
        if (this.f163732a == null) {
            this.f163732a = new FrameLayout(this.f163695i);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view3 = this.f163732a;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams2);
            }
        }
        View view4 = this.f163732a;
        MethodCollector.m26664o(8081);
        return view4;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C33744d dVar = new C33744d();
        BusinessExtraData businessExtraData = this.f163737q;
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        C33744d a = dVar.mo59983a("prop_id", str);
        C75391j jVar = this.f163697k;
        if (jVar == null || (iVar4 = jVar.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar4.f169427a;
        }
        C33744d a2 = a.mo59983a("enter_from", str2);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar3.f169430d;
        }
        C33744d a3 = a2.mo59983a("log_pb", str3);
        C75391j jVar3 = this.f163697k;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
            str4 = null;
        } else {
            str4 = iVar2.f169428b;
        }
        C33744d a4 = a3.mo59983a("author_id", str4);
        C75391j jVar4 = this.f163697k;
        if (jVar4 == null || (iVar = jVar4.f169463r) == null) {
            str5 = null;
        } else {
            str5 = iVar.f169429c;
        }
        C33744d a5 = a4.mo59983a("group_id", str5);
        BusinessExtraData businessExtraData2 = this.f163737q;
        if (businessExtraData2 != null) {
            str6 = businessExtraData2.getSchemaUrlWebFirst();
        } else {
            str6 = null;
        }
        C33744d a6 = a5.mo59983a("enter_method", C72890c.m128717a(str6));
        BusinessExtraData businessExtraData3 = this.f163737q;
        if (businessExtraData3 != null) {
            str7 = businessExtraData3.getSchemaUrlWebFirst();
        } else {
            str7 = null;
        }
        C39162r.m79460a("function_prop_click", a6.mo59983a("url", str7).f79943a);
        Aweme aweme = this.f163738r;
        if (aweme != null && aweme.isAd()) {
            Context context = this.f163695i;
            Aweme aweme2 = this.f163738r;
            C38189j.m77510b(context, "otherclick", aweme2, C38189j.m77467a(context, aweme2, "raw ad prop otherclick", "sticker"));
            C18129a.m33746a("draw_ad", "otherclick", this.f163738r.getAwemeRawAd()).mo28902c();
            BusinessExtraData businessExtraData4 = this.f163737q;
            if (businessExtraData4 != null) {
                str8 = businessExtraData4.getStickerId();
            } else {
                str8 = null;
            }
            C40584a.m81931a("function_prop_click", str8, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        String str;
        MethodCollector.m26663i(8077);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f163695i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        CircleImageView circleImageView = new CircleImageView(this.f163695i);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) C13628n.m24520b(this.f163695i, 32.0f), (int) C13628n.m24520b(this.f163695i, 32.0f));
        layoutParams2.setMargins(0, 0, (int) C13628n.m24520b(this.f163695i, 8.0f), 0);
        circleImageView.setLayoutParams(layoutParams2);
        ((C24246a) circleImageView.getHierarchy()).mo39966c(2131232919);
        ((C24246a) circleImageView.getHierarchy()).mo39970d(2131232919);
        BusinessExtraData businessExtraData = this.f163737q;
        String str2 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getPopIcon();
        } else {
            str = null;
        }
        C34577e.m70608b(circleImageView, str, -1, -1);
        TuxTextView tuxTextView = new TuxTextView(this.f163695i, null, 0, 6);
        tuxTextView.setTextColor(C0643b.m2378c(this.f163695i, R.color.a_));
        tuxTextView.setTuxFont(61);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.topMargin = (int) C13628n.m24520b(this.f163695i, 1.0f);
        tuxTextView.setLayoutParams(layoutParams3);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        BusinessExtraData businessExtraData2 = this.f163737q;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getPopText();
        }
        tuxTextView.setText(str2);
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f163695i);
        autoRTLImageView.setImageResource(R.drawable.b6n);
        linearLayout.addView(circleImageView);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.m26664o(8077);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f0, code lost:
        if (com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w.m78643a(r1, r0, false) == false) goto L_0x00f2;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115229f() {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72967b.mo115229f():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f163733l.mo115236a(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: b */
    public final void mo115310b(int i) {
        super.mo115310b(i);
        Handler handler = this.f163734m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115354a(C41472d dVar) {
        C89219l.m154721d(dVar, "");
        int b = (int) C13628n.m24520b(this.f163695i, 57.9f);
        dVar.f96752e = b;
        dVar.setHeight(b);
        C41469a.f96727h = b;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return this.f163733l.mo115224a(j, i, f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f163733l.mo115225a(j, i, f, f2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72967b(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar, AbstractC72926g gVar, BusinessExtraData businessExtraData, Aweme aweme) {
        super(i, context, view, interactStickerStruct, jVar);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163736o = gVar;
        this.f163737q = businessExtraData;
        this.f163738r = aweme;
        this.f163733l = new C72928b(context, this, interactStickerStruct, jVar, businessExtraData);
        if (C72890c.m128720a(context)) {
            this.f163735n = new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72967b.RunnableC729681 */

                /* renamed from: a */
                final /* synthetic */ C72967b f163739a;

                static {
                    Covode.recordClassIndex(85671);
                }

                {
                    this.f163739a = r1;
                }

                public final void run() {
                    Handler handler;
                    long j;
                    long j2;
                    C72967b bVar = this.f163739a;
                    C72970c cVar = (C72970c) bVar.f163732a;
                    if (cVar != null) {
                        AbstractC72926g gVar = bVar.f163736o;
                        if (gVar != null) {
                            j = gVar.mo80204ay();
                        } else {
                            j = 0;
                        }
                        List<? extends NormalTrackTimeStamp> list = bVar.f163693g;
                        ArrayList arrayList = null;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t : list) {
                                T t2 = t;
                                if (t2 != null) {
                                    j2 = (long) t2.getPts();
                                } else {
                                    j2 = 0;
                                }
                                long j3 = j - j2;
                                if (-160 <= j3 && 160 >= j3) {
                                    arrayList2.add(t);
                                }
                            }
                            ArrayList<NormalTrackTimeStamp> arrayList3 = arrayList2;
                            if (arrayList3 != null) {
                                arrayList = new ArrayList();
                                for (NormalTrackTimeStamp normalTrackTimeStamp : arrayList3) {
                                    if (normalTrackTimeStamp != null) {
                                        RectF a = bVar.f163733l.mo115320a(normalTrackTimeStamp);
                                        float[] fArr = {a.left, a.top, a.right, a.top, a.left, a.bottom, a.right, a.bottom};
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(normalTrackTimeStamp.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
                                        matrix.mapPoints(fArr);
                                        arrayList.add(fArr);
                                    }
                                }
                            }
                        }
                        cVar.setPoints(arrayList);
                    }
                    View view = bVar.f163732a;
                    if (view != null) {
                        view.postInvalidate();
                    }
                    Runnable runnable = this.f163739a.f163735n;
                    if (!(runnable == null || (handler = this.f163739a.f163734m) == null)) {
                        handler.postDelayed(runnable, 100);
                    }
                }
            };
            Handler handler = new Handler();
            this.f163734m = handler;
            Runnable runnable = this.f163735n;
            if (runnable != null) {
                handler.post(runnable);
            }
        }
        if (aweme != null && aweme.isAd()) {
            C38189j.m77510b(context, "othershow", aweme, C38189j.m77467a(context, aweme, "raw ad othershow", "sticker"));
            C18129a.m33746a("draw_ad", "othershow", aweme.getAwemeRawAd()).mo28902c();
        }
        C33744d dVar = new C33744d();
        String str7 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        C33744d a = dVar.mo59983a("prop_id", str);
        if (jVar == null || (iVar4 = jVar.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar4.f169427a;
        }
        C33744d a2 = a.mo59983a("enter_from", str2);
        if (jVar == null || (iVar3 = jVar.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar3.f169430d;
        }
        C33744d a3 = a2.mo59983a("log_pb", str3);
        if (jVar == null || (iVar2 = jVar.f169463r) == null) {
            str4 = null;
        } else {
            str4 = iVar2.f169428b;
        }
        C33744d a4 = a3.mo59983a("author_id", str4);
        if (jVar == null || (iVar = jVar.f169463r) == null) {
            str5 = null;
        } else {
            str5 = iVar.f169429c;
        }
        C33744d a5 = a4.mo59983a("group_id", str5);
        if (businessExtraData != null) {
            str6 = businessExtraData.getSchemaUrlWebFirst();
        } else {
            str6 = null;
        }
        C39162r.m79460a("function_prop_show", a5.mo59983a("enter_method", C72890c.m128717a(str6)).mo59983a("url", businessExtraData != null ? businessExtraData.getSchemaUrlWebFirst() : str7).f79943a);
    }
}

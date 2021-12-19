package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.EnumC46094j;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.EnumC46096k;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.d */
public final class C46085d {
    static {
        Covode.recordClassIndex(54643);
    }

    /* renamed from: a */
    private static Paint.Join m88941a(int i) {
        if (i != Paint.Join.ROUND.ordinal()) {
            if (i == Paint.Join.BEVEL.ordinal()) {
                return Paint.Join.BEVEL;
            }
            if (i == Paint.Join.MITER.ordinal()) {
                return Paint.Join.MITER;
            }
        }
        return Paint.Join.ROUND;
    }

    /* renamed from: b */
    private static Paint.Style m88948b(int i) {
        if (i != Paint.Style.FILL.ordinal()) {
            if (i == Paint.Style.STROKE.ordinal()) {
                return Paint.Style.STROKE;
            }
            if (i == Paint.Style.FILL_AND_STROKE.ordinal()) {
                return Paint.Style.FILL_AND_STROKE;
            }
        }
        return Paint.Style.FILL;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r2 != null) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46105p m88947a(java.util.List<com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46105p> r10) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46085d.m88947a(java.util.List):com.ss.android.ugc.aweme.editSticker.text.bean.p");
    }

    /* renamed from: a */
    private static InnerEffectTextCoverConfig m88943a(OuterEffectTextCoverConfig outerEffectTextCoverConfig, Context context) {
        InnerEffectTextShadowConfig innerEffectTextShadowConfig;
        C89219l.m154721d(outerEffectTextCoverConfig, "");
        C89219l.m154721d(context, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = outerEffectTextCoverConfig.getStrokeConfigs().iterator();
        while (it.hasNext()) {
            arrayList.add(m88946a((OuterEffectTextStrokeConfig) it.next(), context));
        }
        int parseColor = Color.parseColor(outerEffectTextCoverConfig.getTextColorStart());
        int parseColor2 = Color.parseColor(outerEffectTextCoverConfig.getTextColorEnd());
        EnumC46096k a = EnumC46096k.C46097a.m88951a(outerEffectTextCoverConfig.getGradientType());
        EnumC46094j a2 = EnumC46094j.C46095a.m88950a(outerEffectTextCoverConfig.getGradientOrientation());
        Paint.Style b = m88948b(outerEffectTextCoverConfig.getPaintStyle());
        float a3 = C84912r.m145930a(context, outerEffectTextCoverConfig.getOffsetX());
        float a4 = C84912r.m145930a(context, outerEffectTextCoverConfig.getOffsetY());
        OuterEffectTextShadowConfig shadowConfig = outerEffectTextCoverConfig.getShadowConfig();
        if (shadowConfig != null) {
            innerEffectTextShadowConfig = m88945a(shadowConfig, context);
        } else {
            innerEffectTextShadowConfig = null;
        }
        return new InnerEffectTextCoverConfig(parseColor, parseColor2, a, a2, b, a3, a4, arrayList, innerEffectTextShadowConfig);
    }

    /* renamed from: a */
    private static InnerEffectTextShadowConfig m88945a(OuterEffectTextShadowConfig outerEffectTextShadowConfig, Context context) {
        C89219l.m154721d(outerEffectTextShadowConfig, "");
        C89219l.m154721d(context, "");
        return new InnerEffectTextShadowConfig(C84912r.m145930a(context, outerEffectTextShadowConfig.getRadius()), C84912r.m145930a(context, outerEffectTextShadowConfig.getOffsetX()), C84912r.m145930a(context, outerEffectTextShadowConfig.getOffsetY()), Color.parseColor(outerEffectTextShadowConfig.getColor()));
    }

    /* renamed from: a */
    private static InnerEffectTextStrokeConfig m88946a(OuterEffectTextStrokeConfig outerEffectTextStrokeConfig, Context context) {
        C89219l.m154721d(outerEffectTextStrokeConfig, "");
        C89219l.m154721d(context, "");
        return new InnerEffectTextStrokeConfig(C84912r.m145930a(context, outerEffectTextStrokeConfig.getStrokeWidth()), Color.parseColor(outerEffectTextStrokeConfig.getStrokeColor()), m88941a(outerEffectTextStrokeConfig.getStrokeJoin()));
    }

    /* renamed from: a */
    public static final InnerEffectTextLayoutConfig m88944a(OuterEffectTextLayoutConfig outerEffectTextLayoutConfig, Context context, String str, List<C89378p<String, String>> list) {
        C89219l.m154721d(outerEffectTextLayoutConfig, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = outerEffectTextLayoutConfig.getTextConfigs().iterator();
        while (it.hasNext()) {
            arrayList.add(m88942a((OuterEffectTextConfig) it.next(), context, str, list));
        }
        outerEffectTextLayoutConfig.getLayoutType();
        EnumC46099m.LINEAR.getType();
        return new InnerEffectTextLayoutConfig(EnumC46099m.LINEAR, outerEffectTextLayoutConfig.getOrientation(), outerEffectTextLayoutConfig.getRotation(), (int) C84912r.m145930a(context, (float) outerEffectTextLayoutConfig.getPaddingStart()), (int) C84912r.m145930a(context, (float) outerEffectTextLayoutConfig.getPaddingEnd()), (int) C84912r.m145930a(context, (float) outerEffectTextLayoutConfig.getPaddingTop()), (int) C84912r.m145930a(context, (float) outerEffectTextLayoutConfig.getPaddingBottom()), arrayList, null, 256, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0258  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig m88942a(com.p2082ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig r46, android.content.Context r47, java.lang.String r48, java.util.List<p4600h.C89378p<java.lang.String, java.lang.String>> r49) {
        /*
        // Method dump skipped, instructions count: 643
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46085d.m88942a(com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig, android.content.Context, java.lang.String, java.util.List):com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig");
    }
}

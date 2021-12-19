package com.p2082ss.android.ugc.aweme.tcm.impl.service;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commerce.C37486c;
import com.p2082ss.android.ugc.aweme.commerce.C37491d;
import com.p2082ss.android.ugc.aweme.commerce.C37494e;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38583c;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38584d;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2620b.C38582a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61549a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.profile.model.BCHashtag;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77728a;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77730b;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c;
import com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77734a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77735b;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.p2082ss.android.ugc.aweme.tcm.impl.api.CheckBAApi;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4075a.C77736a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4076b.C77740b;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4076b.C77746d;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4077bc.view.C77755a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4078c.C77756a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77758a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77759b;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77762e;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4080e.C77763a;
import com.p2082ss.android.ugc.aweme.tcm.impl.view.C77784a;
import com.p2082ss.android.ugc.aweme.tcm.impl.view.C77786b;
import com.p2082ss.android.ugc.tools.view.style.EnumC84965a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl */
public final class TcmServiceImpl implements ITcmService {
    static {
        Covode.recordClassIndex(90841);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final boolean mo121255a(Activity activity, Context context, boolean z, List<? extends AVTextExtraStruct> list, CheckBAShowLoading checkBAShowLoading, CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, CheckBADetagBA checkBADetagBA) {
        String uid;
        String str = "";
        C89219l.m154721d(activity, str);
        C89219l.m154721d(context, str);
        C89219l.m154721d(checkBAShowLoading, str);
        C89219l.m154721d(checkBAHideLoading, str);
        C89219l.m154721d(checkBAToPublish, str);
        C89219l.m154721d(checkBADetagBA, str);
        C89219l.m154721d(activity, str);
        C89219l.m154721d(context, str);
        C89219l.m154721d(checkBAShowLoading, str);
        C89219l.m154721d(checkBAHideLoading, str);
        C89219l.m154721d(checkBAToPublish, str);
        C89219l.m154721d(checkBADetagBA, str);
        TcmConfig a = C77762e.m135852a();
        if (!(a == null || a.getCheckBABeforePost())) {
            return false;
        }
        if (C77728a.m135802c() != null) {
            TagBAUser c = C77728a.m135802c();
            if (c == null || c.getUid() == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            TagBAUser c2 = C77728a.m135802c();
            if (!(c2 == null || (uid = c2.getUid()) == null)) {
                str = uid;
            }
            arrayList.add(str);
            ((CheckBAApi) C38582a.m78287a(CheckBAApi.class, C38583c.f91178a)).getCheckBA(new C27910f().mo46674b(arrayList)).mo143285c(new C77763a.C77764a(checkBAShowLoading)).mo143254a(new C77763a.C77765b(checkBAHideLoading, checkBAToPublish, context, checkBADetagBA), new C77763a.C77767c(checkBAToPublish));
            return true;
        }
        if (TextUtils.equals(C77763a.m135856a() ? C77728a.m135800b() : C77731c.m135806b(), "0") || list == null || list.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (AVTextExtraStruct aVTextExtraStruct : list) {
            if (aVTextExtraStruct.getType() == 0) {
                String userId = aVTextExtraStruct.getUserId();
                C89219l.m154716b(userId, str);
                arrayList2.add(userId);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        ((CheckBAApi) C38582a.m78287a(CheckBAApi.class, C38583c.f91178a)).getCheckBA(new C27910f().mo46674b(arrayList2)).mo143285c(new C77763a.C77768d(checkBAShowLoading)).mo143254a(new C77763a.C77769e(checkBAHideLoading, checkBAToPublish, context, activity, z), new C77763a.C77772f(checkBAToPublish));
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final boolean mo121256a(Aweme aweme, String str) {
        C37437a commerceVideoAuthInfo;
        C37491d bizAccountInfo;
        return (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bizAccountInfo = commerceVideoAuthInfo.getBizAccountInfo()) == null || !bizAccountInfo.enableBrandedContentViewInsights() || !C77763a.m135857a(str)) ? false : true;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: i */
    public final TcmConfig mo121266i() {
        return C77762e.m135852a();
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: b */
    public final String mo121257b() {
        if (C77763a.m135856a()) {
            return C77728a.m135797a();
        }
        return C77731c.m135804a();
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: d */
    public final String mo121261d() {
        BrandedContentToolSchema a = C77759b.m135850a();
        if (a != null) {
            return a.baBcSchema;
        }
        return null;
    }

    /* renamed from: j */
    public static ITcmService m135859j() {
        Object a = C81908b.m141854a(ITcmService.class, false);
        if (a != null) {
            return (ITcmService) a;
        }
        return new TcmServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: c */
    public final String mo121260c() {
        String str;
        if (C77763a.m135856a()) {
            str = C77728a.m135800b();
            if (str == null) {
                return "0";
            }
        } else {
            str = C77731c.m135806b();
            if (str == null) {
                return "0";
            }
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: f */
    public final BcAdModel mo121263f() {
        String str;
        BCHashtag bcHashtag;
        String partnerWith;
        BCHashtag bcHashtag2;
        TcmConfig a = C77762e.m135852a();
        TagBAUser tagBAUser = null;
        if (a == null || (bcHashtag2 = a.getBcHashtag()) == null) {
            str = null;
        } else {
            str = bcHashtag2.getAd();
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        TcmConfig a2 = C77762e.m135852a();
        if (!(a2 == null || (bcHashtag = a2.getBcHashtag()) == null || (partnerWith = bcHashtag.getPartnerWith()) == null)) {
            str2 = partnerWith;
        }
        C77728a.AbstractC77729a aVar = C77728a.f174309a;
        if (aVar != null) {
            tagBAUser = aVar.getShouldBeDetag();
        }
        return new BcAdModel(str, str2, tagBAUser);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: g */
    public final boolean mo121264g() {
        TcmConfig a;
        TcmConfig a2;
        AbstractC77727a a3 = C77736a.m135835a();
        if ((a3 == null || !a3.mo65701a()) && (a = C77762e.m135852a()) != null && a.isTcmCreator() && (a2 = C77762e.m135852a()) != null && !a2.getUseNewTcmToggle()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: e */
    public final int mo121262e() {
        User b;
        String str;
        C37494e brandedContent;
        C61549a aVar = C77756a.f174374c.mo121302a().f174375a;
        AbstractC77727a a = C77736a.m135835a();
        if (!(a == null || (b = a.mo65702b()) == null)) {
            if (aVar != null) {
                str = aVar.getUid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, b.getUid())) {
                C37486c a2 = C77758a.m135849a();
                if (!(a2 == null || (brandedContent = a2.getBrandedContent()) == null)) {
                    return brandedContent.getNewContentNum();
                }
            } else if (aVar != null) {
                return aVar.getNewContentNum();
            } else {
                return 0;
            }
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: h */
    public final void mo121265h() {
        TcmConfig a;
        TcmConfig a2;
        if (C77763a.m135856a()) {
            C77728a.m135799a((String) null);
            C77728a.m135801b("0");
            C77728a.m135798a((TagBAUser) null);
            C77728a.m135803d();
        }
        AbstractC77727a a3 = C77736a.m135835a();
        if ((a3 == null || !a3.mo65701a()) && (a = C77762e.m135852a()) != null && a.isTcmCreator() && (a2 = C77762e.m135852a()) != null && a2.getUseNewTcmToggle()) {
            C77731c.m135807b("0");
            C77731c.m135805a(null);
            C77728a.m135798a((TagBAUser) null);
            C77728a.m135803d();
        }
        if (mo121264g()) {
            C77731c.m135807b("0");
            C77731c.m135805a(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final boolean mo121254a() {
        return C77763a.m135856a();
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final AbstractC77735b mo121248a(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        return new C77786b(viewStub);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final void mo121253a(AbstractC77727a aVar) {
        C89219l.m154721d(aVar, "");
        C77736a.f174317a.mo123715a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final void mo121249a(Activity activity, boolean z) {
        C77763a.m135856a();
        C77740b.m135839a(activity, z, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final AbstractC77734a mo121247a(ViewGroup viewGroup, Context context) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(context, "");
        return new C77784a(viewGroup, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: b */
    public final boolean mo121259b(Aweme aweme, String str) {
        C37437a commerceVideoAuthInfo;
        C37491d bizAccountInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bizAccountInfo = commerceVideoAuthInfo.getBizAccountInfo()) == null || !bizAccountInfo.enableBrandedContentRemoveMe() || !C77763a.m135857a(str)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final void mo121251a(Context context, Aweme aweme) {
        String str;
        String str2 = "";
        C89219l.m154721d(context, str2);
        C89219l.m154721d(context, str2);
        BrandedContentToolSchema a = C77759b.m135850a();
        String str3 = null;
        if (a != null) {
            str = a.baViewInsightsSchema;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            if (aweme != null) {
                str3 = aweme.getAid();
            }
            bundle.putString("itemID", str3);
            bundle.putString("enter_from", "video_play");
            if (str != null) {
                str2 = str;
            }
            SmartRouter.buildRoute(context, C38584d.m78289a(str2, bundle)).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final void mo121252a(ViewStub viewStub, AbstractC63199ax.AbstractC63200a aVar) {
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(aVar, "");
        new C77755a(viewStub, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: b */
    public final void mo121258b(Context context, Aweme aweme) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        C23025b bVar = new C23025b(context);
        bVar.mo37416a(R.string.a38, new C77763a.C77773g(aweme, context));
        bVar.mo37418b(R.string.a2x, C77763a.C77776h.f174408a);
        C23013a a = ((C23023b) C23013a.C23015a.m43405a(context).mo37479a(R.string.a39).mo37483b(R.string.a3a)).mo37407a(bVar).mo37405a();
        a.mo37395a();
        a.mo37396b().show();
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final void mo121250a(Context context, C18288a aVar, AbstractC16208i iVar) {
        MethodCollector.m26663i(12414);
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        String string = context.getResources().getString(R.string.a34);
        C89219l.m154716b(string, "");
        String string2 = context.getResources().getString(R.string.a2z, string);
        C89219l.m154716b(string2, "");
        int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
        int length = string.length() + a;
        SpannableString spannableString = new SpannableString(string2);
        if (Build.VERSION.SDK_INT >= 28) {
            spannableString.setSpan(new TypefaceSpan(C17301b.m32033a().mo27611a(C17303d.f41573g)), a, length, 33);
        } else {
            spannableString.setSpan(new StyleSpan(EnumC84965a.MEDIUM.getVALUE()), a, length, 33);
        }
        spannableString.setSpan(new C77746d.C77750d(context), a, length, 33);
        TextView textView = new TextView(context);
        textView.setText(spannableString);
        textView.setMovementMethod(new LinkMovementMethod());
        int b = (int) C13628n.m24520b(context, 24.0f);
        int b2 = (int) C13628n.m24520b(context, 20.0f);
        textView.setPadding(b2, b, b2, 0);
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(C0643b.m2378c(context, R.color.c4));
        textView.setLineSpacing(3.0f, 1.0f);
        textView.setGravity(17);
        C17197a.C17200a aVar2 = new C17197a.C17200a(context);
        aVar2.f41088s = textView;
        C17197a.C17200a b3 = aVar2.mo27190a(R.string.a30, (DialogInterface.OnClickListener) new C77746d.DialogInterface$OnClickListenerC77748b(aVar, iVar), false).mo27195b(R.string.a31, (DialogInterface.OnClickListener) new C77746d.DialogInterface$OnClickListenerC77749c(aVar, iVar), false);
        b3.f41059E = true;
        b3.f41067M = false;
        b3.mo27193a().mo27185c();
        MethodCollector.m26664o(12414);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService
    /* renamed from: a */
    public final int mo121246a(Context context, Activity activity, boolean z, boolean z2, boolean z3, List<? extends AVTextExtraStruct> list) {
        String b;
        TcmConfig a;
        List<String> hashtagList;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        C89219l.m154721d(context, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(activity, "");
        if ((!z || C77746d.m135843b()) && (C77763a.m135856a() || C77746d.m135842a())) {
            if (C77763a.m135856a()) {
                b = C77728a.m135800b();
            } else {
                b = C77731c.m135806b();
            }
            if (!TextUtils.equals(b, "1") && !TextUtils.equals(b, "2") && (a = C77762e.m135852a()) != null && (hashtagList = a.getHashtagList()) != null && !hashtagList.isEmpty() && list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int i6 = 0;
                for (AVTextExtraStruct aVTextExtraStruct : list) {
                    if (aVTextExtraStruct.getType() == 1) {
                        Iterator<String> it = hashtagList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (TextUtils.equals("#" + aVTextExtraStruct.getHashTagName(), next)) {
                                sb.append(next).append(" ");
                                sb2.append(next).append(",");
                                i6++;
                                break;
                            }
                        }
                    }
                }
                if (i6 != 0) {
                    String sb3 = sb.toString();
                    C89219l.m154716b(sb3, "");
                    String sb4 = sb2.deleteCharAt(sb2.length() - 1).toString();
                    C89219l.m154716b(sb4, "");
                    C77730b bVar = new C77730b(i6, sb3, sb4);
                    if (C77746d.m135843b()) {
                        if (C77763a.m135856a()) {
                            C77728a.m135801b("2");
                        } else {
                            C77731c.m135807b("2");
                        }
                        if (z3) {
                            str = "commercial_music";
                        } else {
                            str = "original_sound";
                        }
                        C39162r.m79460a("tcm_bc_toggle", new C33744d().mo59980a("click_toggle", 4).f79943a);
                        C39162r.m79460a("tcm_bctoggle_auto_on", new C33744d().mo59983a("music_scen", str).mo59983a("bc_hashtag", bVar.f174312b).f79943a);
                        if (C77763a.m135856a()) {
                            C77728a.m135801b("2");
                        } else {
                            C77731c.m135807b("2");
                        }
                    }
                    boolean b2 = C77746d.m135843b();
                    if (!b2) {
                        if (!z) {
                            i = R.string.gai;
                        }
                        return 1;
                    }
                    i = R.string.gae;
                    String string = context.getString(i, bVar.f174313c);
                    C89219l.m154716b(string, "");
                    if (bVar.f174311a == 1) {
                        if (b2) {
                            i5 = R.string.gaf;
                        } else {
                            i5 = R.string.gaj;
                        }
                        string = context.getString(i5, bVar.f174313c);
                        C89219l.m154716b(string, "");
                    }
                    String string2 = context.getString(R.string.gad);
                    C89219l.m154716b(string2, "");
                    if (b2) {
                        i2 = R.string.gag;
                    } else {
                        i2 = R.string.gak;
                    }
                    String string3 = context.getString(i2, string2);
                    C89219l.m154716b(string3, "");
                    if (bVar.f174311a > 1) {
                        if (b2) {
                            i4 = R.string.gah;
                        } else {
                            i4 = R.string.gal;
                        }
                        string3 = context.getString(i4, string2);
                        C89219l.m154716b(string3, "");
                    }
                    String str2 = string + ' ' + string3;
                    int a2 = C89361p.m154885a((CharSequence) str2, string2);
                    SpannableString spannableString = new SpannableString(str2);
                    spannableString.setSpan(new C77763a.C77779k(context), a2, string2.length() + a2, 33);
                    C23025b bVar2 = new C23025b(context);
                    if (b2) {
                        i3 = R.string.gao;
                    } else {
                        i3 = R.string.gam;
                    }
                    String string4 = context.getString(i3);
                    C89219l.m154716b(string4, "");
                    bVar2.mo37417a(string4, new C77763a.C77777i(b2));
                    bVar2.mo37418b(R.string.gan, new C77763a.C77778j(b2, activity, z2));
                    bVar2.f54513b = true;
                    C23013a a3 = ((C23023b) C23013a.C23015a.m43405a(context).mo37479a(R.string.gap)).mo37413d(spannableString).mo37407a(bVar2).mo37405a();
                    a3.mo37395a();
                    a3.mo37396b().show();
                    return 1;
                }
            }
        }
        return 0;
    }
}

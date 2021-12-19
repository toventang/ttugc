package com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20761r;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2523b.C37539b;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2525a.C37541a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2526b.C37549a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2527c.C37551a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2527c.C37553c;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2527c.C37555d;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37556a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37557b;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37559c;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37566d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl */
public final class CommerceChallengeServiceImpl implements ICommerceChallengeService {
    static {
        Covode.recordClassIndex(44964);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65386a(String str) {
        C37556a.m75723a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final boolean mo65389a(Context context, String str, boolean z, TextView textView, boolean z2, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(textView, "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new SpannableString(str);
        UrlModel a = C37559c.m75728a(str, z, z2);
        if (a == null) {
            textView.setText(eVar.element);
            return false;
        }
        int textSize = (int) textView.getTextSize();
        eVar.element = (T) new SpannableString(C89219l.m154704a(str, (Object) C34722h.m70923b(R.string.fzs)));
        C20761r.m39060a(C34735v.m70965a(a)).mo34179a("hashtagemoji").mo34182a(new C37559c.C37560a(textSize, eVar, textView, str, str2, z2));
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final boolean mo65388a(Context context, String str, UrlModel urlModel, SpannableString spannableString, TextView textView, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(textView, "");
        if (TextUtils.isEmpty(String.valueOf(spannableString))) {
            return false;
        }
        int textSize = (int) textView.getTextSize();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        textView.setText(spannableStringBuilder);
        C20761r.m39060a(C34735v.m70965a(urlModel)).mo34179a("hashtagemoji").mo34182a(new C37559c.C37564d(textSize, spannableStringBuilder, textView, str, str2));
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65387a(String str, String str2) {
        Uri parse;
        if (str != null && (parse = Uri.parse(str)) != null) {
            C37556a.m75722a(parse, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final AbstractC37540a mo65377a() {
        return new C37541a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: b */
    public final void mo65390b() {
        C37559c.f88763c.clear();
        C37559c.f88762b = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: c */
    public final LinkedHashMap<String, Bitmap> mo65394c() {
        if (C37551a.m75718a()) {
            return C37559c.f88763c;
        }
        return new LinkedHashMap<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: d */
    public final boolean mo65396d() {
        if (C37553c.m75720a().isEmpty()) {
            return false;
        }
        return C37555d.m75721a();
    }

    /* renamed from: e */
    public static ICommerceChallengeService m75741e() {
        MethodCollector.m26663i(11351);
        Object a = C81908b.m141854a(ICommerceChallengeService.class, false);
        if (a != null) {
            ICommerceChallengeService iCommerceChallengeService = (ICommerceChallengeService) a;
            MethodCollector.m26664o(11351);
            return iCommerceChallengeService;
        }
        if (C81908b.f183175ae == null) {
            synchronized (ICommerceChallengeService.class) {
                try {
                    if (C81908b.f183175ae == null) {
                        C81908b.f183175ae = new CommerceChallengeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11351);
                    throw th;
                }
            }
        }
        CommerceChallengeServiceImpl commerceChallengeServiceImpl = (CommerceChallengeServiceImpl) C81908b.f183175ae;
        MethodCollector.m26664o(11351);
        return commerceChallengeServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: b */
    public final boolean mo65393b(String str) {
        return C37556a.m75725b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: c */
    public final boolean mo65395c(Challenge challenge) {
        return C37557b.m75727a(challenge);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65382a(AbstractC37537a aVar) {
        C89219l.m154721d(aVar, "");
        C37549a.f88744a.mo123715a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: b */
    public final boolean mo65392b(Challenge challenge) {
        if (challenge == null || !C37556a.m75724a(challenge)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65384a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct != null && textExtraStruct.isCommerce()) {
            C37556a.m75723a(textExtraStruct.getCid());
            C37556a.m75723a(textExtraStruct.getHashTagName());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final Aweme mo65378a(Aweme aweme) {
        if (!(aweme == null || aweme.getTextExtra() == null || TextUtils.isEmpty(aweme.getDesc()))) {
            StringBuffer stringBuffer = new StringBuffer(aweme.getDesc());
            ArrayList arrayList = new ArrayList();
            ArrayList<TextExtraStruct> arrayList2 = new ArrayList();
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            C89219l.m154716b(textExtra, "");
            arrayList2.addAll(textExtra);
            Collections.sort(arrayList2, new C37566d());
            int i = 0;
            for (TextExtraStruct textExtraStruct : arrayList2) {
                if (i != 0) {
                    textExtraStruct.setStart(textExtraStruct.getStart() + i);
                    textExtraStruct.setEnd(textExtraStruct.getEnd() + i);
                }
                if (textExtraStruct.getType() == 1 && C37559c.m75728a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null && textExtraStruct.getHashTagName().length() == (textExtraStruct.getEnd() - textExtraStruct.getStart()) - 1 && stringBuffer.length() >= textExtraStruct.getEnd()) {
                    stringBuffer.insert(textExtraStruct.getEnd(), C34722h.m70923b(R.string.fzs));
                    textExtraStruct.setEnd(textExtraStruct.getEnd() + 1);
                    i++;
                }
                arrayList.add(textExtraStruct);
            }
            if (i != 0) {
                aweme.setDesc(stringBuffer.toString());
                aweme.setTextExtra(arrayList);
            }
        }
        return aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65379a(int i) {
        long currentTimeMillis;
        long currentTimeMillis2;
        UrlModel urlModel;
        Long l;
        Long l2;
        if (!C37551a.m75718a()) {
            C37559c.f88763c.clear();
        } else if (!C37559c.f88762b) {
            C37559c.f88762b = true;
            C37559c.m75729a();
            C37559c.f88763c.clear();
            for (String str : C37559c.f88761a.keySet()) {
                C37539b bVar = C37559c.f88761a.get(str);
                if (bVar == null || (l2 = bVar.f88708a) == null) {
                    currentTimeMillis = (System.currentTimeMillis() / 1000) + 1;
                } else {
                    currentTimeMillis = l2.longValue();
                }
                C37539b bVar2 = C37559c.f88761a.get(str);
                if (bVar2 == null || (l = bVar2.f88709b) == null) {
                    currentTimeMillis2 = (System.currentTimeMillis() / 1000) - 1;
                } else {
                    currentTimeMillis2 = l.longValue();
                }
                long currentTimeMillis3 = System.currentTimeMillis() / 1000;
                if (currentTimeMillis + 1 <= currentTimeMillis3 && currentTimeMillis2 > currentTimeMillis3) {
                    C37539b bVar3 = C37559c.f88761a.get(str);
                    if (bVar3 != null) {
                        urlModel = bVar3.f88710c;
                    } else {
                        urlModel = null;
                    }
                    C20761r.m39060a(C34735v.m70965a(urlModel)).mo34179a("hashtagemoji").mo34182a(new C37559c.C37565e(str, i));
                }
            }
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65383a(com.p2082ss.android.ugc.aweme.discover.model.Challenge r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0053
            boolean r1 = com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37556a.m75724a(r6)
            r0 = 1
            if (r1 == r0) goto L_0x000a
            return
        L_0x000a:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37556a.f88757a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0024
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x001c:
            if (r0 >= r2) goto L_0x0025
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x001c
        L_0x0024:
            r2 = 0
        L_0x0025:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.lang.String r0 = r6.getCid()     // Catch:{ all -> 0x0046 }
            com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37556a.m75726c(r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r6.getChallengeName()     // Catch:{ all -> 0x0046 }
            com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2528d.C37556a.m75726c(r0)     // Catch:{ all -> 0x0046 }
        L_0x003a:
            if (r3 >= r2) goto L_0x0042
            r4.lock()
            int r3 = r3 + 1
            goto L_0x003a
        L_0x0042:
            r1.unlock()
            return
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            if (r3 >= r2) goto L_0x004f
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0047
        L_0x004f:
            r1.unlock()
            throw r0
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl.mo65383a(com.ss.android.ugc.aweme.discover.model.Challenge):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65380a(Uri uri, String str) {
        C37556a.m75722a(uri, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: b */
    public final void mo65391b(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            C33744d dVar = new C33744d();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            C33744d a = dVar.mo59983a("tag_name", lowerCase);
            if (str == null) {
                str = "";
            }
            C39162r.m79460a("click_commercial_emoji", a.mo59983a("enter_from", str).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final UrlModel mo65376a(String str, boolean z, boolean z2) {
        return C37559c.m75728a(str, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65385a(MentionTextView mentionTextView, Aweme aweme, String str) {
        UrlModel a;
        C89219l.m154721d(mentionTextView, "");
        C89219l.m154721d(mentionTextView, "");
        if (!(aweme == null || aweme.getTextExtra() == null || TextUtils.isEmpty(aweme.getDesc()))) {
            ArrayList<TextExtraStruct> arrayList = new ArrayList();
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            C89219l.m154716b(textExtra, "");
            arrayList.addAll(textExtra);
            for (TextExtraStruct textExtraStruct : arrayList) {
                if (textExtraStruct.getType() == 1 && C37559c.m75731a(aweme, textExtraStruct) && (a = C37559c.m75728a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                    C34577e.m70589a(a, (int) mentionTextView.getTextSize(), (int) mentionTextView.getTextSize(), new C37559c.C37561b(mentionTextView, textExtraStruct, str));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService
    /* renamed from: a */
    public final void mo65381a(TextView textView, Aweme aweme, SpannableString spannableString, String str) {
        UrlModel a;
        C89219l.m154721d(textView, "");
        C89219l.m154721d(spannableString, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(spannableString, "");
        if (aweme != null) {
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = spannableString;
            if (!(aweme.getTextExtra() == null || TextUtils.isEmpty(spannableString))) {
                for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                    C89219l.m154716b(textExtraStruct, "");
                    if (textExtraStruct.getType() == 1 && C37559c.m75731a(aweme, textExtraStruct) && (a = C37559c.m75728a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                        C20761r.m39060a(a).mo34179a("hashtagemoji").mo34182a(new C37559c.C37563c(textView, eVar, textExtraStruct, str));
                    }
                }
            }
        }
    }
}

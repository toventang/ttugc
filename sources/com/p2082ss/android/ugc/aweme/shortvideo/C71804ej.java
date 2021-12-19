package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.p1721g.C23144b;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2363ba.C34413e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69806g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71913g;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72613aj;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73966as;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74156o;
import com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.aweme.utils.C80345dj;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80733a;
import com.p2082ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ej */
public class C71804ej {

    /* renamed from: a */
    public static final String f160910a = C71804ej.class.getSimpleName();

    /* renamed from: b */
    public final Fragment f160911b;

    /* renamed from: c */
    public final HashTagMentionEditText f160912c;

    /* renamed from: d */
    final View f160913d;

    /* renamed from: e */
    final View f160914e;

    /* renamed from: f */
    final View f160915f;

    /* renamed from: g */
    public ViewGroup f160916g;

    /* renamed from: h */
    final int f160917h;

    /* renamed from: i */
    final int f160918i;

    /* renamed from: j */
    public String f160919j = "";

    /* renamed from: k */
    public int f160920k;

    /* renamed from: l */
    BaseTitleHelper f160921l;

    /* renamed from: m */
    HashTagMobHelper f160922m;

    /* renamed from: n */
    public String f160923n;

    /* renamed from: o */
    public boolean f160924o;

    /* renamed from: p */
    public C72613aj f160925p;

    /* renamed from: q */
    public String f160926q;

    /* renamed from: r */
    public final VideoPublishEditModel f160927r;

    /* renamed from: s */
    public boolean f160928s = false;

    /* renamed from: t */
    public int f160929t = -1;

    /* renamed from: u */
    public boolean f160930u = false;

    /* renamed from: v */
    public C34413e f160931v;

    /* renamed from: w */
    public final ArrayList<AbstractC69904bz> f160932w = new ArrayList<>();

    /* renamed from: x */
    private final int f160933x = C73966as.m130092a();

    /* renamed from: y */
    private final String f160934y = "publish_add_video";

    static {
        Covode.recordClassIndex(84349);
    }

    /* renamed from: b */
    public static boolean m126767b() {
        return C63253l.f143623a.mo73309e().mo93762d();
    }

    /* renamed from: c */
    public final void mo113462c() {
        if (this.f160912c.f166477s) {
            if (this.f160912c.f166483y) {
                this.f160912c.setShouldDisableTrim(false);
            } else {
                this.f160912c.setHasUrlTransforming(false);
                this.f160912c.getText().delete(this.f160912c.getUrlStart(), this.f160912c.getUrlEnd());
                HashTagMentionEditText hashTagMentionEditText = this.f160912c;
                hashTagMentionEditText.setUrlEnd(hashTagMentionEditText.getUrlStart());
                this.f160912c.setTransformingUrlRemoved(true);
            }
        }
        HashTagMentionEditText hashTagMentionEditText2 = this.f160912c;
        Editable text = hashTagMentionEditText2.getText();
        String obj = text.toString();
        int length = obj.length();
        int i = 0;
        while (i < length && obj.charAt(i) <= ' ') {
            i++;
        }
        int i2 = length;
        while (i2 > i && obj.charAt(i2 - 1) <= ' ') {
            i2--;
        }
        if (i < i2) {
            int i3 = i2 + 1;
            if (i3 < length) {
                text.delete(i3, length);
            }
            text.delete(0, i);
            return;
        }
        hashTagMentionEditText2.setText("");
    }

    /* renamed from: a */
    public final void mo113455a() {
        C34413e eVar = new C34413e();
        this.f160931v = eVar;
        HashTagMentionEditText hashTagMentionEditText = this.f160912c;
        if (hashTagMentionEditText != null) {
            hashTagMentionEditText.addTextChangedListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: INVOKE  
                  (r1v0 'hashTagMentionEditText' com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText)
                  (wrap: com.ss.android.ugc.aweme.ba.e$1 : 0x000d: CONSTRUCTOR  (r0v27 com.ss.android.ugc.aweme.ba.e$1) = (r2v0 'eVar' com.ss.android.ugc.aweme.ba.e) call: com.ss.android.ugc.aweme.ba.e.1.<init>(com.ss.android.ugc.aweme.ba.e):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.widget.EditText.addTextChangedListener(android.text.TextWatcher):void in method: com.ss.android.ugc.aweme.shortvideo.ej.a():void, file: classes5.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: CONSTRUCTOR  (r0v27 com.ss.android.ugc.aweme.ba.e$1) = (r2v0 'eVar' com.ss.android.ugc.aweme.ba.e) call: com.ss.android.ugc.aweme.ba.e.1.<init>(com.ss.android.ugc.aweme.ba.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.ej.a():void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.ba.e, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 187
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C71804ej.mo113455a():void");
        }

        /* renamed from: d */
        public final List<AVTextExtraStruct> mo113464d() {
            HashTagMentionEditText hashTagMentionEditText = this.f160912c;
            String str = this.f160926q;
            Editable text = hashTagMentionEditText.getText();
            if (text == null || TextUtils.isEmpty(text.toString())) {
                return null;
            }
            C74156o[] oVarArr = (C74156o[]) text.getSpans(0, text.length(), C74156o.class);
            int length = oVarArr.length;
            int[] iArr = new int[length];
            if (oVarArr.length > 0) {
                for (int i = 0; i < length; i++) {
                    iArr[i] = text.getSpanStart(oVarArr[i]);
                }
                Arrays.sort(iArr);
            }
            ArrayList arrayList = new ArrayList();
            MentionEditText.MentionSpan[] mentionText = hashTagMentionEditText.getMentionText();
            for (MentionEditText.MentionSpan mentionSpan : mentionText) {
                if (mentionSpan.f166490c == 0 || mentionSpan.f166490c == 5) {
                    int spanStart = text.getSpanStart(mentionSpan);
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (spanStart > iArr[i3]) {
                            i2++;
                        }
                    }
                    mentionSpan.f166491d.setStart(text.getSpanStart(mentionSpan) - i2);
                    mentionSpan.f166491d.setEnd(text.getSpanEnd(mentionSpan) - i2);
                    arrayList.add(mentionSpan.f166491d);
                }
            }
            List<C80733a> b = hashTagMentionEditText.mo116503b(hashTagMentionEditText.getNoAdTagText());
            for (C80733a aVar : b) {
                int i4 = aVar.f180507a;
                int i5 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    if (i4 > iArr[i6]) {
                        i5++;
                    }
                }
                TextExtraStruct textExtraStruct = new TextExtraStruct();
                textExtraStruct.setType(1);
                textExtraStruct.setStarAtlasTag(hashTagMentionEditText.mo116505b(b.indexOf(aVar)));
                textExtraStruct.setHashTagName(aVar.f180509c.replaceAll("#", ""));
                textExtraStruct.setStart(aVar.f180507a - i5);
                textExtraStruct.setEnd(aVar.f180508b - i5);
                arrayList.add(textExtraStruct);
                if (TextUtils.equals(C63238c.f143594u.mo93904c(), str)) {
                    C63238c.f143583j.saveLocalHashTag(true, textExtraStruct.getHashTagName());
                }
            }
            return C27404ap.m54807a((Iterable) C27404ap.m54811a(arrayList, new C69806g()));
        }

        /* renamed from: e */
        public final boolean mo113465e() {
            int length;
            String string;
            int a = C73966as.m130092a();
            if (TextUtils.isEmpty(this.f160912c.getAdTag())) {
                if (m126767b()) {
                    length = m126768c(this.f160912c.getText().toString());
                } else {
                    length = this.f160912c.getText().length();
                }
            } else if (m126767b()) {
                length = m126768c(this.f160912c.getNoAdTagText());
            } else {
                length = this.f160912c.getNoAdTagText().length();
            }
            if (a - length > 0) {
                return false;
            }
            if (C71913g.m126988a()) {
                string = C63247i.f143610a.getResources().getString(R.string.fin, Integer.valueOf(a));
            } else {
                string = C63247i.f143610a.getResources().getString(R.string.eqp, Integer.valueOf(a));
            }
            new C23144b(this.f160912c).mo37635a(string).mo37637b();
            return true;
        }

        /* renamed from: c */
        private static int m126768c(String str) {
            return str.replace("\n", "").length();
        }

        /* renamed from: a */
        public final void mo113456a(int i) {
            this.f160920k = i;
            HashTagMentionEditText hashTagMentionEditText = this.f160912c;
            if (hashTagMentionEditText != null) {
                hashTagMentionEditText.setVideoType(i);
            }
        }

        /* renamed from: a */
        public final void mo113457a(String str) {
            String str2;
            C33744d a = new C33744d().mo59983a("creation_id", this.f160919j).mo59983a("enter_from", "video_post_page").mo59983a("enter_method", str);
            VideoPublishEditModel videoPublishEditModel = this.f160927r;
            if (videoPublishEditModel == null) {
                str2 = "";
            } else {
                str2 = videoPublishEditModel.mShootWay;
            }
            C39162r.m79460a("click_caption_return", a.mo59983a("shoot_way", str2).mo59983a("content_source", C71817eu.m126790a(this.f160927r)).mo59983a("content_type", C71817eu.m126792c(this.f160927r)).f79943a);
        }

        /* renamed from: b */
        public final void mo113460b(String str) {
            List<AVTextExtraStruct> d = mo113464d();
            if (!(d == null || d.isEmpty())) {
                Collections.sort(d, C71810en.f160941a);
                for (AVTextExtraStruct aVTextExtraStruct : d) {
                    if (aVTextExtraStruct.getType() == 0 && TextUtils.equals(aVTextExtraStruct.getUserId(), str) && this.f160912c.getText() != null) {
                        this.f160912c.getText().replace(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), "");
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo113461b(List<String> list) {
            if (!C13603b.m24435a((Collection) list)) {
                for (String str : list) {
                    if (str == null || this.f160912c.getText().toString().contains("#" + str + " ") || this.f160912c.getText().toString().contains("#" + str + this.f160911b.getString(R.string.fzs))) {
                        this.f160912c.f166462C.add("#".concat(String.valueOf(str)));
                    } else {
                        this.f160912c.f166462C.add("#".concat(String.valueOf(str)));
                        C80733a b = C80345dj.m139309b(this.f160912c.getText().toString(), str);
                        if (b.f180508b <= C73966as.m130092a()) {
                            this.f160912c.f166448l = false;
                            this.f160912c.getText().insert(b.f180507a, b.f180509c);
                        }
                        this.f160912c.mo116502a(true);
                    }
                }
            }
        }

        /* renamed from: c */
        public final void mo113463c(List<AVTextExtraStruct> list) {
            this.f160912c.setAVTextExtraList(list);
            if (!C13617h.m24465a(list)) {
                Iterator<AVTextExtraStruct> it = list.iterator();
                while (it.hasNext()) {
                    String trim = ("#" + it.next().getHashTagName()).trim();
                    if (!C80345dj.m139307a(trim)) {
                        this.f160912c.f166462C.add(trim);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo113458a(List<AVChallenge> list) {
            if (!C13603b.m24435a((Collection) list)) {
                for (AVChallenge aVChallenge : list) {
                    if (aVChallenge != null) {
                        this.f160912c.f166462C.add("#" + aVChallenge.challengeName);
                        if (!this.f160912c.getText().toString().contains("#" + aVChallenge.getChallengeName() + " ") && !this.f160912c.getText().toString().contains("#" + aVChallenge.getChallengeName() + this.f160911b.getString(R.string.fzs))) {
                            C80733a b = C80345dj.m139309b(this.f160912c.getText().toString(), aVChallenge.getChallengeName());
                            if (b.f180508b <= C73966as.m130092a()) {
                                this.f160912c.f166448l = false;
                                this.f160912c.getText().insert(b.f180507a, b.f180509c);
                            }
                            this.f160912c.mo116502a(true);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final C72613aj mo113454a(int i, boolean z) {
            C72613aj ajVar = null;
            if (z || i == 2 || i == 1 || (this.f160912c.getText() != null && this.f160912c.getText().toString().isEmpty())) {
                return null;
            }
            if (this.f160925p == null) {
                if (SettingsManager.m29616a().mo25400a("allowed_post_prompts", false)) {
                    ajVar = new C72613aj((byte) 0);
                }
                this.f160925p = ajVar;
            }
            return this.f160925p;
        }

        /* renamed from: a */
        public final boolean mo113459a(String str, String str2, String str3) {
            return this.f160912c.mo116536a(str, str2, str3);
        }

        public C71804ej(Fragment fragment, HashTagMentionEditText hashTagMentionEditText, View view, View view2, View view3, ViewGroup viewGroup, VideoPublishEditModel videoPublishEditModel) {
            this.f160911b = fragment;
            this.f160912c = hashTagMentionEditText;
            this.f160913d = view;
            this.f160914e = view2;
            this.f160915f = view3;
            this.f160916g = viewGroup;
            this.f160917h = 0;
            this.f160918i = 0;
            this.f160927r = videoPublishEditModel;
            ActivityC0945e activity = fragment.getActivity();
            if (activity != null) {
                this.f160921l = BaseTitleHelper.C80744a.m139999a(activity);
                this.f160922m = (HashTagMobHelper) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(HashTagMobHelper.class);
            }
            if (videoPublishEditModel != null) {
                hashTagMentionEditText.setVideoPublishEditModel(videoPublishEditModel);
            }
            C73966as.f166053a = 0;
        }
    }

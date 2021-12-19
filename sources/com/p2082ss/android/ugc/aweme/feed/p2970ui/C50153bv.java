package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2977v.C50480a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50530af;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74147f;
import com.p2082ss.android.ugc.aweme.translation.C79026a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79028b;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79031d;
import com.p2082ss.android.ugc.aweme.translation.p4143b.C79032a;
import com.p2082ss.android.ugc.aweme.translation.p4144ui.AbstractC79038a;
import com.p2082ss.android.ugc.aweme.translation.p4144ui.TranslationStatusView;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bv */
public final class C50153bv implements TranslationStatusView.AbstractC79036a, AbstractC79038a {

    /* renamed from: a */
    public static boolean f115758a;

    /* renamed from: l */
    public static final int f115759l;

    /* renamed from: b */
    public TranslationStatusView f115760b;

    /* renamed from: c */
    public MentionTextView f115761c;

    /* renamed from: d */
    public FrameLayout f115762d;

    /* renamed from: e */
    public int f115763e;

    /* renamed from: f */
    public Aweme f115764f;

    /* renamed from: g */
    public C79032a f115765g;

    /* renamed from: h */
    public String f115766h;

    /* renamed from: i */
    public String f115767i;

    /* renamed from: j */
    public int f115768j = -1;

    /* renamed from: k */
    public TextView f115769k;

    /* renamed from: m */
    public int f115770m;

    /* renamed from: n */
    public int f115771n;

    /* renamed from: o */
    public boolean f115772o = false;

    /* renamed from: p */
    private Context f115773p;

    /* renamed from: q */
    private int f115774q;

    /* renamed from: r */
    private List<String> f115775r = new ArrayList();

    /* renamed from: a */
    public final void mo85299a(final MentionTextView mentionTextView, final String str, final List<TextExtraStruct> list, final int i) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(mentionTextView, "alpha", 0.0f).setDuration(150L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mentionTextView, "alpha", 0.0f, 1.0f).setDuration(150L);
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv.C501552 */

            static {
                Covode.recordClassIndex(59281);
            }

            public final void onAnimationStart(Animator animator) {
                int lineCount;
                int lineCount2;
                if (!C50153bv.f115758a) {
                    mentionTextView.setMaxLines(C50153bv.f115759l);
                }
                C50153bv.this.mo85300a((CharSequence) str);
                mentionTextView.mo124999a(list, new C74147f(), (MentionTextView.AbstractC81407d) null);
                C50153bv bvVar = C50153bv.this;
                MentionTextView mentionTextView = mentionTextView;
                int i = i;
                if (C50153bv.f115758a) {
                    mentionTextView.scrollTo(0, 0);
                    bvVar.f115762d.getLayoutParams().height = -2;
                }
                int b = C50530af.m94719b();
                if (i != 2) {
                    if (mentionTextView.getLineCount() == 0) {
                        lineCount = b;
                    } else {
                        lineCount = mentionTextView.getLineCount();
                    }
                    if (lineCount > b) {
                        if (bvVar.f115764f.getTransDesc() == null) {
                            bvVar.mo85298a(mentionTextView, lineCount, b, i);
                        }
                        bvVar.mo85300a(bvVar.f115764f.getEllipsizeTransDesc());
                        mentionTextView.setLines(b);
                        if (C50153bv.f115758a) {
                            lineCount = Math.min(C50153bv.f115759l, lineCount);
                        }
                        mentionTextView.post(new RunnableC50159bx(bvVar, mentionTextView, lineCount));
                        bvVar.f115769k.setVisibility(0);
                        bvVar.f115769k.setText(R.string.bua);
                        return;
                    }
                    bvVar.mo85297a(mentionTextView);
                } else if (!bvVar.f115764f.getDesc().equals(bvVar.f115764f.getEllipsizeDesc())) {
                    bvVar.f115769k.setVisibility(0);
                    bvVar.f115769k.setText(R.string.bua);
                    bvVar.mo85300a(bvVar.f115764f.getEllipsizeDesc());
                    mentionTextView.setLines(b);
                } else {
                    if (mentionTextView.getLineCount() == 0) {
                        lineCount2 = b;
                    } else {
                        lineCount2 = mentionTextView.getLineCount();
                    }
                    if (lineCount2 > b) {
                        bvVar.f115769k.setVisibility(0);
                        bvVar.f115769k.setText(R.string.bua);
                        bvVar.mo85298a(mentionTextView, lineCount2, b, i);
                        bvVar.mo85300a(bvVar.f115764f.getEllipsizeDesc());
                        mentionTextView.setLines(b);
                        return;
                    }
                    bvVar.mo85297a(mentionTextView);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo85300a(CharSequence charSequence) {
        String h;
        try {
            if (this.f115768j == 0) {
                h = this.f115764f.getDescLanguage();
            } else {
                h = SettingServiceImpl.m120782v().mo108872h();
            }
            this.f115761c.mo124997a(charSequence, h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo85301a(String str, int i) {
        this.f115766h = str;
        this.f115774q = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.translation.p4144ui.AbstractC79038a
    /* renamed from: a */
    public final void mo85292a() {
        this.f115760b.setStatus(0);
    }

    static {
        int i;
        Covode.recordClassIndex(59279);
        boolean a = C50480a.m94644a();
        f115758a = a;
        if (a) {
            i = 10;
        } else {
            i = 12;
        }
        f115759l = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.translation.p4144ui.TranslationStatusView.AbstractC79036a
    /* renamed from: a */
    public final void mo85293a(int i) {
        this.f115768j = i;
    }

    /* renamed from: a */
    public final void mo85294a(Aweme aweme) {
        mo85295a(aweme, false);
    }

    /* renamed from: a */
    private String m94121a(String str) {
        if (TextUtils.isEmpty(str) || this.f115764f == null) {
            return "";
        }
        boolean[] zArr = new boolean[str.length()];
        if (this.f115764f.getTextExtra() != null) {
            for (TextExtraStruct textExtraStruct : this.f115764f.getTextExtra()) {
                for (int max = Math.max(0, textExtraStruct.getStart()); max < Math.min(str.length(), textExtraStruct.getEnd()); max++) {
                    zArr[max] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!zArr[i]) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString().trim();
    }

    @Override // com.p2082ss.android.ugc.aweme.translation.p4144ui.AbstractC79038a
    /* renamed from: a */
    public final void mo85296a(C79030c cVar) {
        String str;
        this.f115760b.setStatus(2);
        if (this.f115772o) {
            C39162r.m79460a("see_original_show", new C33744d().mo59983a("enter_from", this.f115766h).mo59983a("group_id", this.f115764f.getAid()).mo59983a("current_lang", SettingServiceImpl.m120782v().mo108872h()).f79943a);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (cVar.f177641a == null) {
            str = "";
        } else {
            str = cVar.f177641a;
        }
        sb.append(str);
        sb.append(" ");
        if (this.f115764f.getTextExtra() != null) {
            for (int i = 0; i < this.f115764f.getTextExtra().size(); i++) {
                TextExtraStruct textExtraStruct = this.f115764f.getTextExtra().get(i);
                String substring = this.f115764f.getDesc().substring(Math.min(Math.max(textExtraStruct.getStart(), 0), this.f115764f.getDesc().length()), Math.min(textExtraStruct.getEnd(), this.f115764f.getDesc().length()));
                TextExtraStruct clone = textExtraStruct.clone();
                clone.setStart(sb.length());
                clone.setEnd(clone.getStart() + substring.length());
                arrayList.add(clone);
                sb.append(substring);
                sb.append(" ");
            }
        }
        C79031d dVar = new C79031d();
        dVar.f177644b = 2;
        dVar.f177643a = sb.toString();
        dVar.f177645c = arrayList;
        C79026a a = C79026a.m137857a();
        String aid = this.f115764f.getAid();
        if (aid != null) {
            a.f177633a.mo2092a(aid, dVar);
        }
        mo85299a(this.f115761c, dVar.f177643a, dVar.f177645c, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85297a(MentionTextView mentionTextView) {
        this.f115769k.setVisibility(4);
        mentionTextView.post(new RunnableC50160by(mentionTextView));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d8, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0100 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85295a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv.mo85295a(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }

    /* renamed from: a */
    private void m94122a(SpannableStringBuilder spannableStringBuilder, final SpannableStringBuilder spannableStringBuilder2, final boolean z) {
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv.C501563 */

            static {
                Covode.recordClassIndex(59282);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(-1);
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                ValueAnimator ofInt;
                C50153bv.this.mo85300a(spannableStringBuilder2);
                C50153bv.this.f115769k.setVisibility(0);
                C50153bv bvVar = C50153bv.this;
                bvVar.f115763e = bvVar.f115769k.getHeight();
                if (z) {
                    ofInt = ValueAnimator.ofInt(C50153bv.this.f115771n, C50153bv.this.f115770m);
                } else {
                    ofInt = ValueAnimator.ofInt(C50153bv.this.f115770m, C50153bv.this.f115771n);
                }
                ofInt.addUpdateListener(new C50161bz(this, z));
                ofInt.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv.C501563.C501571 */

                    static {
                        Covode.recordClassIndex(59283);
                    }

                    public final void onAnimationStart(Animator animator) {
                        if (z) {
                            C50153bv.this.f115769k.setText(R.string.bu_);
                        } else {
                            C50153bv.this.f115769k.setText(R.string.bua);
                        }
                        C50153bv.this.f115769k.setVisibility(4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        int transDescLines;
                        if (!z) {
                            if (C50153bv.f115758a) {
                                C50153bv.this.f115761c.scrollTo(0, 0);
                            }
                            C50153bv.this.f115761c.setLines(C50530af.m94719b());
                        } else if (C50153bv.this.f115764f.getTransDescLines() != 0) {
                            MentionTextView mentionTextView = C50153bv.this.f115761c;
                            if (C50153bv.f115758a) {
                                transDescLines = Math.min(C50153bv.f115759l, C50153bv.this.f115764f.getTransDescLines());
                            } else {
                                transDescLines = C50153bv.this.f115764f.getTransDescLines();
                            }
                            mentionTextView.setLines(transDescLines);
                        } else {
                            C50153bv.this.f115761c.post(new RunnableC50165cb(this));
                        }
                        C50153bv.this.f115769k.setVisibility(0);
                    }
                });
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, C50153bv.this.f115763e);
                ofInt2.addUpdateListener(new C50164ca(this));
                ofInt2.setDuration(100L);
                ofInt2.setStartDelay(150);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofInt, ofInt2);
                animatorSet.start();
            }
        }, 0, spannableStringBuilder.length(), 33);
    }

    /* renamed from: a */
    private int m94120a(CharSequence charSequence, String str, int i, int i2) {
        try {
            float measureText = this.f115761c.getPaint().measureText(str);
            int i3 = i;
            while (i3 >= 3) {
                if (this.f115761c.getPaint().measureText(charSequence, i2 - i3, i2) < measureText) {
                    return i3 + 1;
                }
                i3--;
            }
            return i3 + 1;
        } catch (Exception unused) {
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0120 A[SYNTHETIC, Splitter:B:31:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85298a(com.p2082ss.android.ugc.aweme.views.MentionTextView r17, int r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 491
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv.mo85298a(com.ss.android.ugc.aweme.views.MentionTextView, int, int, int):void");
    }

    public C50153bv(Context context, TranslationStatusView translationStatusView, MentionTextView mentionTextView, TextView textView, FrameLayout frameLayout) {
        this.f115773p = context;
        this.f115765g = new C79032a(new C79028b(), this);
        this.f115760b = translationStatusView;
        this.f115761c = mentionTextView;
        this.f115762d = frameLayout;
        this.f115769k = textView;
    }
}

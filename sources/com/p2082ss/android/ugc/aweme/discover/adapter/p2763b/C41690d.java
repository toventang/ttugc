package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import android.content.DialogInterface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.services.apm.api.C22708a;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41485a;
import com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a;
import com.p2082ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67521be;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67523bf;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.d */
public final class C41690d extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: i */
    private static final int f97245i = C34728n.m70946a(44.0d);

    /* renamed from: a */
    public List<C67679e> f97246a = new ArrayList();

    /* renamed from: b */
    public String f97247b;

    /* renamed from: c */
    public String f97248c;

    /* renamed from: d */
    public String f97249d;

    /* renamed from: e */
    public AbstractC41953a f97250e;

    /* renamed from: f */
    public SearchIntermediateViewModel f97251f;

    /* renamed from: g */
    ActivityC0945e f97252g;

    /* renamed from: h */
    public String f97253h;

    /* renamed from: j */
    private SugCompletionView.AbstractC43029a f97254j;

    /* renamed from: k */
    private C67679e f97255k;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m83646a(this, viewGroup, i);
    }

    /* renamed from: a */
    public final void mo70888a() {
        List<C67679e> list = this.f97246a;
        if (list != null) {
            list.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f97246a.size();
    }

    static {
        Covode.recordClassIndex(49603);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C41681b) {
            ((C41681b) viewHolder).f97228d = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C41681b) {
            ((C41681b) viewHolder).f97228d = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        C67679e eVar;
        if (C13603b.m24435a((Collection) this.f97246a) || (eVar = this.f97246a.get(i)) == null) {
            return 0;
        }
        return C41708l.m83665a(eVar, this.f97248c);
    }

    public C41690d(ActivityC0945e eVar) {
        this.f97252g = eVar;
        if (eVar != null) {
            this.f97251f = (SearchIntermediateViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        }
        this.f97254j = new SugCompletionView.AbstractC43029a() {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41690d.C416911 */

            static {
                Covode.recordClassIndex(49604);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.widget.SugCompletionView.AbstractC43029a
            /* renamed from: a */
            public final void mo70890a() {
                if (C41690d.this.f97251f != null) {
                    C41690d.this.f97251f.getDismissKeyboard().setValue(true);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.widget.SugCompletionView.AbstractC43029a
            /* renamed from: a */
            public final void mo70892a(boolean z) {
                if (C41690d.this.f97251f != null) {
                    C41690d.this.f97251f.getDismissKeyboardOnActionDown().setValue(Boolean.valueOf(z));
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.widget.SugCompletionView.AbstractC43029a
            /* renamed from: a */
            public final void mo70891a(C67679e eVar, int i) {
                C41690d dVar = C41690d.this;
                if (dVar.f97252g != null) {
                    C17197a.C17200a aVar = new C17197a.C17200a(dVar.f97252g);
                    aVar.f41070a = dVar.f97252g.getString(R.string.g8_);
                    aVar.f41071b = dVar.f97252g.getString(R.string.g88);
                    aVar.mo27192a(dVar.f97252g.getString(R.string.g87), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(eVar, i) {
                        /* class com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41690d.DialogInterface$OnClickListenerC416933 */

                        /* renamed from: a */
                        final /* synthetic */ C67679e f97260a;

                        /* renamed from: b */
                        final /* synthetic */ int f97261b;

                        static {
                            Covode.recordClassIndex(49606);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Word word;
                            String str;
                            C41690d dVar = C41690d.this;
                            C67679e eVar = this.f97260a;
                            int i2 = this.f97261b;
                            if (!(dVar.f97252g == null || (word = eVar.f151671f) == null)) {
                                Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "suggestion").appendQueryParameter("object_id", word.getWord()).appendQueryParameter("owner_id", C31575b.m65865g().getCurUserId());
                                C28022o oVar = new C28022o();
                                try {
                                    oVar.mo46801a("raw_query", dVar.f97253h);
                                    oVar.mo46801a("words_content", word.getWord());
                                    oVar.mo46800a("words_position", Integer.valueOf(i2));
                                    oVar.mo46801a("impr_id", dVar.f97247b);
                                    oVar.mo46801a("group_id", word.getId());
                                    oVar.mo46801a("words_source", "sug");
                                    str = C80342dg.m139300a().mo46674b(oVar);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    str = "";
                                }
                                appendQueryParameter.appendQueryParameter("extra", str);
                                C39223a.m79587a().mo68688a(dVar.f97252g, appendQueryParameter);
                            }
                            dialogInterface.dismiss();
                            C41690d dVar2 = C41690d.this;
                            C67679e eVar2 = this.f97260a;
                            int i3 = this.f97261b;
                            Word word2 = eVar2.f151671f;
                            if (word2 != null) {
                                ((C67521be) new C67521be().mo106476x(dVar2.f97253h).mo106475w(word2.getWord()).mo106471d(Integer.valueOf(i3)).mo106484d(dVar2.f97247b).mo106453i(word2.getId())).mo106461r("confirm").mo106462s("sug").mo96792f();
                            }
                        }

                        {
                            this.f97260a = r2;
                            this.f97261b = r3;
                        }
                    }, false).mo27196b(dVar.f97252g.getString(R.string.g86), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(eVar, i) {
                        /* class com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41690d.DialogInterface$OnClickListenerC416922 */

                        /* renamed from: a */
                        final /* synthetic */ C67679e f97257a;

                        /* renamed from: b */
                        final /* synthetic */ int f97258b;

                        static {
                            Covode.recordClassIndex(49605);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            C41690d dVar = C41690d.this;
                            C67679e eVar = this.f97257a;
                            int i2 = this.f97258b;
                            Word word = eVar.f151671f;
                            if (word != null) {
                                ((C67521be) new C67521be().mo106476x(dVar.f97253h).mo106475w(word.getWord()).mo106471d(Integer.valueOf(i2)).mo106484d(dVar.f97247b).mo106453i(word.getId())).mo106461r("cancel").mo106462s("sug").mo96792f();
                            }
                        }

                        {
                            this.f97257a = r2;
                            this.f97258b = r3;
                        }
                    }, false).mo27193a().mo27185c();
                    Word word = eVar.f151671f;
                    if (word != null) {
                        ((C67523bf) new C67523bf().mo106476x(dVar.f97253h).mo106475w(word.getWord()).mo106471d(Integer.valueOf(i)).mo106484d(dVar.f97247b).mo106453i(word.getId())).mo106463r("sug").mo96792f();
                    }
                }
                C41690d.this.mo70889a(false);
                C41690d.this.notifyDataSetChanged();
            }
        };
    }

    /* renamed from: a */
    public final void mo70889a(boolean z) {
        if (this.f97246a != null) {
            if (this.f97255k == null) {
                C67679e eVar = new C67679e();
                this.f97255k = eVar;
                eVar.f151673h = 3;
            }
            if (z) {
                this.f97246a.add(this.f97255k);
            } else {
                this.f97246a.remove(this.f97255k);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x035d, code lost:
        if (r0 == null) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0364, code lost:
        if (r0.isVerifiedUser() != true) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0366, code lost:
        r8.append((java.lang.CharSequence) " T");
        r8.setSpan(new com.p2082ss.android.ugc.aweme.profile.p3575f.C63771aj(r11.f97210d.getContext(), com.p2082ss.android.ugc.trill.R.drawable.abf), (r8.length() - 2) + 1, r8.length(), 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0387, code lost:
        r1 = r11.f97210d.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x038d, code lost:
        if (r3 == null) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x038f, code lost:
        r0 = r3.f151672g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0391, code lost:
        if (r0 == null) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0393, code lost:
        r6 = r0.getUserRelationType();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0397, code lost:
        r6 = com.p2082ss.android.ugc.aweme.discover.helper.C41988ah.m84050a(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x039f, code lost:
        if (r6.length() <= 0) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03a1, code lost:
        r8.append((java.lang.CharSequence) " • ");
        r8.append((java.lang.CharSequence) r6);
        r8.setSpan(new android.text.style.ForegroundColorSpan(androidx.core.content.C0643b.m2378c(r11.f97210d.getContext(), com.p2082ss.android.ugc.trill.R.color.c5)), (r8.length() - 3) - r6.length(), r8.length(), 33);
        r1 = new android.text.style.StyleSpan(1);
        r7 = r8.length() - r6.length();
        r6 = r8.length();
        r8.setSpan(r1, r7, r6, 17);
        r8.setSpan(new android.text.style.AbsoluteSizeSpan((int) com.p2082ss.android.ugc.aweme.utils.C80284by.m139182a()), r7, r6, 18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03f4, code lost:
        r7 = r11.mo70882a();
        r0 = r11.itemView;
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2);
        r6 = r0.getContext();
        p4600h.p4611f.p4613b.C89219l.m154716b(r6, r2);
        r1 = r4.getUserNickname();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0408, code lost:
        if (r1 != null) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x040a, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x040b, code lost:
        if (r3 == null) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x040d, code lost:
        r0 = r3.f151670e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x040f, code lost:
        if (r0 != null) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0411, code lost:
        r0 = new java.util.ArrayList<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0416, code lost:
        r1 = r7.mo71105a(r6, r1, r0);
        r0 = (com.bytedance.tux.input.TuxTextView) r11.f97207a.getValue();
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2);
        r0.setText(r8);
        r0 = (com.bytedance.tux.input.TuxTextView) r11.f97208b.getValue();
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2);
        r0.setText(r1);
        r11.f97210d.setOnTouchListener(new com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41674a.C41679e(r11, r3, r5, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0440, code lost:
        if (r3 == null) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0442, code lost:
        r2 = r3.f151676k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0444, code lost:
        if (r2 == null) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0446, code lost:
        r2.put("user_tag", r4.getUserRelationType());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x044f, code lost:
        r2 = r11.f97209c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0451, code lost:
        if (r3 == null) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0453, code lost:
        r1 = r3.f151674i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0455, code lost:
        com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41702g.m83660a(r2, r1, r3, "user_enrich_sug");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x045a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x045b, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0345, code lost:
        if (r3 != null) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0349, code lost:
        if (r0 == null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x034b, code lost:
        r0 = new java.util.ArrayList<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0350, code lost:
        r8.append((java.lang.CharSequence) r9.mo71105a(r7, r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0359, code lost:
        if (r3 == null) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x035b, code lost:
        r0 = r3.f151672g;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r23, int r24) {
        /*
        // Method dump skipped, instructions count: 1157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41690d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m83646a(C41690d dVar, ViewGroup viewGroup, int i) {
        int i2;
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(7834);
        if (C41485a.m83438a(dVar.f97248c)) {
            i2 = f97245i;
        } else {
            i2 = 0;
        }
        boolean z = true;
        if (i == 1) {
            String str = dVar.f97249d;
            AbstractC41953a aVar = dVar.f97250e;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.av5, viewGroup, false);
            C89219l.m154716b(a, "");
            viewHolder = new C41695f(a, str, i2, aVar);
        } else if (i == 2) {
            String str2 = dVar.f97249d;
            AbstractC41953a aVar2 = dVar.f97250e;
            SugCompletionView.AbstractC43029a aVar3 = dVar.f97254j;
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.av3, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C41681b(a2, str2, i2, aVar2, aVar3);
        } else if (i == 3) {
            C89219l.m154721d(viewGroup, "");
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ava, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C41709m(a3);
        } else if (i == 0) {
            viewHolder = new C41703h(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.av4, viewGroup, false), i2, dVar.f97249d, dVar.f97250e, dVar.f97254j);
        } else if (i == 4) {
            String str3 = dVar.f97249d;
            AbstractC41953a aVar4 = dVar.f97250e;
            SugCompletionView.AbstractC43029a aVar5 = dVar.f97254j;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar4, "");
            C89219l.m154721d(aVar5, "");
            View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aua, viewGroup, false);
            C89219l.m154716b(a4, "");
            viewHolder = new C41674a(a4, str3, aVar4, aVar5);
        } else if (i == 5) {
            C89219l.m154721d(viewGroup, "");
            View a5 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aub, viewGroup, false);
            C89219l.m154716b(a5, "");
            viewHolder = new C41688c(a5);
        } else {
            viewHolder = null;
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(7834);
        return viewHolder;
    }
}

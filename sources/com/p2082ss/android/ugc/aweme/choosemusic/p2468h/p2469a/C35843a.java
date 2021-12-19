package com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2469a;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
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
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35894an;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35898ar;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35855a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35857c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2473e.AbstractC35859a;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.view.SugCompletionView;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36055u;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36061v;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.a.a */
public final class C35843a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List<C35894an> f84612a = new ArrayList();

    /* renamed from: b */
    public MusicSearchStateViewModel f84613b;

    /* renamed from: c */
    private SugCompletionView.AbstractC35955a f84614c;

    static {
        Covode.recordClassIndex(43082);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m73236a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f84612a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        C35894an anVar;
        if (C13603b.m24435a((Collection) this.f84612a) || (anVar = this.f84612a.get(i)) == null || !anVar.isHistoryType()) {
            return 0;
        }
        return 1;
    }

    public C35843a(ActivityC0945e eVar) {
        if (eVar != null) {
            this.f84613b = (MusicSearchStateViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(MusicSearchStateViewModel.class);
            this.f84614c = new SugCompletionView.AbstractC35955a() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2469a.C35843a.C358441 */

                static {
                    Covode.recordClassIndex(43083);
                }

                @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.SugCompletionView.AbstractC35955a
                /* renamed from: a */
                public final void mo62952a() {
                    if (C35843a.this.f84613b != null) {
                        C35843a.this.f84613b.mo62738d().setValue(true);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.SugCompletionView.AbstractC35955a
                /* renamed from: a */
                public final void mo62953a(boolean z) {
                    if (C35843a.this.f84613b != null) {
                        C35843a.this.f84613b.mo62739e().setValue(Boolean.valueOf(z));
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public final C35894an mo62951a(String str) {
        List<C35894an> list = this.f84612a;
        if (list == null) {
            return null;
        }
        for (C35894an anVar : list) {
            if (TextUtils.equals(anVar.getContent(), str)) {
                return anVar;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2;
        if (getItemViewType(i) == 1) {
            C36055u uVar = (C36055u) viewHolder;
            C35894an anVar = this.f84612a.get(i);
            C35845b bVar = new C35845b(this);
            String str3 = "";
            C89219l.m154721d(anVar, str3);
            C89219l.m154721d(str3, str3);
            C89219l.m154721d(bVar, str3);
            uVar.mo63213a();
            AbstractC41955b bVar2 = (AbstractC41955b) uVar.f85167a.getValue();
            View view = uVar.itemView;
            C89219l.m154716b(view, str3);
            Context context = view.getContext();
            C89219l.m154716b(context, str3);
            String content = anVar.getContent();
            if (content == null) {
                content = str3;
            }
            List<Position> hignLightPositions = anVar.getHignLightPositions();
            if (hignLightPositions == null) {
                hignLightPositions = new ArrayList<>();
            }
            SpannableString a = bVar2.mo71105a(context, content, hignLightPositions);
            View view2 = uVar.itemView;
            C89219l.m154716b(view2, str3);
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.eu6);
            C89219l.m154716b(tuxTextView, str3);
            tuxTextView.setText(a);
            uVar.itemView.setOnClickListener(new C36055u.View$OnClickListenerC36058c(uVar, anVar, i));
            View view3 = uVar.itemView;
            C89219l.m154716b(view3, str3);
            ((TuxIconView) view3.findViewById(R.id.bux)).setOnClickListener(new C36055u.View$OnClickListenerC36059d(uVar, anVar, i, bVar));
            if (!anVar.isMobShow()) {
                anVar.setMobShow(true);
                C35855a a2 = new C35855a().mo62963a("words_source", "sug").mo62963a("search_position", "video_music").mo62961a("words_position", i).mo62963a("words_content", anVar.getContent());
                if (anVar.getWordRecord() != null) {
                    C35898ar wordRecord = anVar.getWordRecord();
                    if (wordRecord == null) {
                        C89219l.m154715b();
                    }
                    str = wordRecord.getId();
                } else {
                    str = str3;
                }
                C39162r.m79460a("trending_words_show", a2.mo62963a("group_id", str).mo62963a("creation_id", C35936b.f84815d).mo62964a(anVar.getExtraParam()).mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
                C35855a a3 = new C35855a().mo62963a("enter_method", "sug");
                Map<String, String> extraParam = anVar.getExtraParam();
                String str4 = null;
                if (extraParam != null) {
                    str2 = extraParam.get("impr_id");
                } else {
                    str2 = null;
                }
                C35855a a4 = a3.mo62963a("query_id", str2);
                Map<String, String> extraParam2 = anVar.getExtraParam();
                if (extraParam2 != null) {
                    str4 = extraParam2.get("raw_query");
                }
                C35855a a5 = a4.mo62963a("input_keyword", str4).mo62963a("search_keyword", anVar.getContent()).mo62961a("order", i).mo62963a("search_type", "video_music");
                if (anVar.getWordRecord() != null) {
                    C35898ar wordRecord2 = anVar.getWordRecord();
                    if (wordRecord2 == null) {
                        C89219l.m154715b();
                    }
                    str3 = wordRecord2.getId();
                }
                C39162r.m79460a("search_trending_show", a5.mo62963a("group_id", str3).mo62963a("words_type", "history").mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
                return;
            }
            return;
        }
        ((AbstractC35859a) viewHolder).mo62966a(this.f84612a.get(i), i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m73236a(C35843a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(2469);
        boolean z = true;
        if (i == 1) {
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa3, viewGroup, false);
            C89219l.m154716b(a, "");
            viewHolder = new C36055u(a);
        } else {
            SugCompletionView.AbstractC35955a aVar2 = aVar.f84614c;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar2, "");
            viewHolder = new C36061v(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa2, viewGroup, false), aVar2);
            C89219l.m154716b(viewHolder, "");
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
        MethodCollector.m26664o(2469);
        return viewHolder;
    }
}

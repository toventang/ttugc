package com.p2082ss.android.ugc.aweme.discover.alading.p2764a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41811b;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41815d;
import com.p2082ss.android.ugc.aweme.discover.helper.C42041n;
import com.p2082ss.android.ugc.aweme.discover.helper.C42050t;
import com.p2082ss.android.ugc.aweme.discover.model.VideoTag;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41499ag;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67482ak;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67573s;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.utils.C80231ay;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80291cb;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80589iu;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.a.a */
public final class C41806a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: f */
    public static String f97519f;

    /* renamed from: g */
    public static final int f97520g = 1;

    /* renamed from: h */
    public static final int f97521h = 2;

    /* renamed from: i */
    public static final C41807a f97522i = new C41807a((byte) 0);

    /* renamed from: a */
    public List<? extends Aweme> f97523a = new ArrayList();

    /* renamed from: b */
    final C42050t<Aweme> f97524b = new C42050t<>(this);

    /* renamed from: c */
    public final Context f97525c;

    /* renamed from: d */
    public final AbstractC41814c f97526d;

    /* renamed from: e */
    public C67568r f97527e;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m83762a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.a$a */
    public static final class C41807a {
        static {
            Covode.recordClassIndex(49723);
        }

        private C41807a() {
        }

        public /* synthetic */ C41807a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.a$b */
    public static final class C41808b implements AbstractC89172b<Aweme, Aweme> {
        static {
            Covode.recordClassIndex(49724);
        }

        C41808b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ Aweme invoke(Aweme aweme) {
            return aweme;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f97523a.size();
    }

    static {
        Covode.recordClassIndex(49722);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (((Aweme) this.f97523a.get(i)).isLive()) {
            return f97521h;
        }
        return f97520g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        UrlModel urlModel;
        long j;
        Drawable a;
        boolean z;
        VideoTag videoTag;
        int i2;
        Drawable a2;
        String str;
        String str2;
        Video video;
        VideoTag videoTag2;
        C89219l.m154721d(viewHolder, "");
        Aweme aweme = (Aweme) this.f97523a.get(i);
        int i3 = 0;
        Long l = null;
        UrlModel urlModel2 = null;
        if (viewHolder instanceof C41811b) {
            C41811b bVar = (C41811b) viewHolder;
            C67568r rVar = this.f97527e;
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(rVar, "");
            bVar.f97538g = aweme;
            if (C41499ag.m83446a()) {
                bVar.f97536e.getLayoutParams().height = (int) C80284by.m139183a(32);
                View view = bVar.f97536e;
                View view2 = bVar.itemView;
                C89219l.m154716b(view2, "");
                view.setBackground(C0643b.m2369a(view2.getContext(), (int) R.drawable.bf5));
            } else if (C41499ag.m83447b() || C41499ag.m83448c()) {
                bVar.f97536e.getLayoutParams().height = (int) C80284by.m139183a(32);
                View view3 = bVar.f97536e;
                View view4 = bVar.itemView;
                C89219l.m154716b(view4, "");
                view3.setBackground(C0643b.m2369a(view4.getContext(), (int) R.drawable.bf6));
            } else {
                View view5 = bVar.f97536e;
                View view6 = bVar.itemView;
                C89219l.m154716b(view6, "");
                view5.setBackground(C0643b.m2369a(view6.getContext(), (int) R.drawable.bf7));
            }
            TextView textView = bVar.f97534c;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getDiggCount();
            } else {
                j = 0;
            }
            textView.setText(C53437b.m98615a(j));
            if (C41499ag.m83448c()) {
                C80589iu.m139729a(bVar.f97534c);
                View view7 = bVar.itemView;
                C89219l.m154716b(view7, "");
                a = C42041n.m84142a(aweme, view7.getContext(), 2131233636);
            } else {
                View view8 = bVar.itemView;
                C89219l.m154716b(view8, "");
                a = C42041n.m84142a(aweme, view8.getContext(), 2131233635);
            }
            if (bVar.f97537f) {
                bVar.f97534c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
            } else {
                bVar.f97534c.setCompoundDrawablesWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (aweme.getNewLabel() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar.f97535d.setVisibility(0);
                Video video2 = aweme.getVideo();
                if (!(video2 == null || (videoTag = video2.getVideoTag()) == null)) {
                    String title = videoTag.getTitle();
                    if (title == null || title.length() == 0) {
                        bVar.f97535d.setVisibility(8);
                    } else {
                        Integer a3 = C80231ay.m139068a(videoTag.getBackgroundColor());
                        Integer a4 = C80231ay.m139068a(videoTag.getFontColor());
                        TextView textView2 = bVar.f97535d;
                        textView2.setText(videoTag.getTitle());
                        textView2.setAlpha(((float) C89271h.m154762a(videoTag.getOpacity(), 0, 100)) / 100.0f);
                        if (a4 != null) {
                            i2 = a4.intValue();
                        } else {
                            i2 = -1;
                        }
                        textView2.setTextColor(i2);
                        if (a3 != null) {
                            a2 = C80291cb.m139199a(a3.intValue(), C41811b.f97530i);
                        } else {
                            a2 = C0643b.m2369a(textView2.getContext(), (int) R.drawable.bcz);
                        }
                        textView2.setBackground(a2);
                        if (aweme.getNewLabel() == 1) {
                            str = "New";
                        } else {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            Video video3 = aweme.getVideo();
                            if (video3 == null || (videoTag2 = video3.getVideoTag()) == null) {
                                str2 = null;
                            } else {
                                str2 = videoTag2.getTitle();
                            }
                            if (TextUtils.isEmpty(str2) && (video = aweme.getVideo()) != null) {
                                VideoTag videoTag3 = new VideoTag();
                                videoTag3.setTitle(str);
                                video.setVideoTag(videoTag3);
                            }
                        }
                    }
                }
            } else {
                bVar.f97535d.setVisibility(8);
            }
            Video video4 = aweme.getVideo();
            if (video4 != null) {
                urlModel2 = video4.getCover();
            }
            C20766v a5 = C20761r.m39060a(C34735v.m70965a(urlModel2)).mo34179a("AwemeCardListAdapter");
            a5.f49092E = bVar.f97533b;
            a5.mo34186c();
            bVar.f97532a.setOnClickListener(new C41811b.View$OnClickListenerC41813b(bVar, aweme));
            AbstractC41814c cVar = this.f97526d;
            View view9 = viewHolder.itemView;
            C89219l.m154716b(view9, "");
            cVar.mo60420b(i, view9, aweme, this.f97523a);
        } else if (viewHolder instanceof C41815d) {
            C41815d dVar = (C41815d) viewHolder;
            C67568r rVar2 = this.f97527e;
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(rVar2, "");
            dVar.f97544c = aweme;
            User author = aweme.getAuthor();
            if (author == null || (urlModel = author.roomCover) == null) {
                User author2 = aweme.getAuthor();
                C89219l.m154716b(author2, "");
                urlModel = author2.getAvatarLarger();
            }
            C20766v a6 = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34179a("AwemeCardListAdapter");
            a6.f49092E = dVar.f97543b;
            a6.mo34186c();
            dVar.f97542a.setOnClickListener(new C41815d.View$OnClickListenerC41816a(dVar, aweme, rVar2));
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_version", "2150");
            hashMap.put("_param_live_platform", "live");
            hashMap.put("list_item_id", String.valueOf(aweme.getAuthor().roomId));
            C67482ak akVar = (C67482ak) new C67573s().mo106433s(rVar2.f151312g).mo106460p("live_cover");
            User author3 = aweme.getAuthor();
            if (author3 != null) {
                l = Long.valueOf(author3.roomId);
            }
            C67573s sVar = (C67573s) akVar.mo106434t(String.valueOf(l)).mo106485e(aweme.getAuthor().getUid()).mo106488q("click").mo106480a(rVar2.f151314i).mo106486f(rVar2.f151309d).mo106482b(rVar2.f151311f).mo106487g(aweme.getAuthor().getUid()).mo106458n(aweme.getRequestId());
            User author4 = aweme.getAuthor();
            if (author4 != null) {
                i3 = author4.getFollowStatus();
            }
            sVar.mo106525a(i3).mo96788a(hashMap).mo96792f();
            AbstractC41814c cVar2 = this.f97526d;
            View view10 = viewHolder.itemView;
            C89219l.m154716b(view10, "");
            cVar2.mo60420b(i, view10, aweme, this.f97523a);
        }
    }

    public C41806a(Context context, AbstractC41814c cVar, C67568r rVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(rVar, "");
        this.f97525c = context;
        this.f97526d = cVar;
        this.f97527e = rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.a$c */
    public static final class C41809c extends AbstractC89220m implements AbstractC89187q<View, Integer, Aweme, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41806a f97528a;

        static {
            Covode.recordClassIndex(49725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41809c(C41806a aVar) {
            super(3);
            this.f97528a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(View view, Integer num, Aweme aweme) {
            View view2 = view;
            int intValue = num.intValue();
            Aweme aweme2 = aweme;
            C89219l.m154721d(view2, "");
            C89219l.m154721d(aweme2, "");
            List<? extends Aweme> list = this.f97528a.f97523a;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!t.isLive()) {
                    arrayList.add(t);
                }
            }
            this.f97528a.f97526d.mo60417a(intValue, view2, aweme2, arrayList);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.a$d */
    public static final class C41810d extends AbstractC89220m implements AbstractC89187q<View, Integer, Aweme, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41806a f97529a;

        static {
            Covode.recordClassIndex(49726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41810d(C41806a aVar) {
            super(3);
            this.f97529a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(View view, Integer num, Aweme aweme) {
            View view2 = view;
            int intValue = num.intValue();
            Aweme aweme2 = aweme;
            C89219l.m154721d(view2, "");
            C89219l.m154721d(aweme2, "");
            List<? extends Aweme> list = this.f97529a.f97523a;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!t.isLive()) {
                    arrayList.add(t);
                }
            }
            this.f97529a.f97526d.mo60417a(intValue, view2, aweme2, arrayList);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m83762a(C41806a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(8153);
        C89219l.m154721d(viewGroup, "");
        if (i == f97521h) {
            viewHolder = new C41815d(C67641m.m119786a(viewGroup, R.layout.aup), new C41809c(aVar));
        } else {
            viewHolder = new C41811b(C67641m.m119786a(viewGroup, R.layout.auc), new C41810d(aVar));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
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
        MethodCollector.m26664o(8153);
        return viewHolder;
    }
}

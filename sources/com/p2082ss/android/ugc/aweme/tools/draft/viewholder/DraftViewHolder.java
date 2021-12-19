package com.p2082ss.android.ugc.aweme.tools.draft.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43237k;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69753a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69755c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69805f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.tools.draft.DraftItemView;
import com.p2082ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78232c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78233d;
import com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a;
import com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.C78467a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.DraftViewHolder */
public final class DraftViewHolder extends AbstractC78442a<C78233d> implements AbstractC1203l {

    /* renamed from: a */
    public final String f176215a = "DraftViewHolder";

    /* renamed from: b */
    ExpandableMentionTextView f176216b;

    /* renamed from: c */
    ViewGroup f176217c;

    /* renamed from: d */
    public SimpleDraweeView f176218d;

    /* renamed from: e */
    AppCompatCheckBox f176219e;

    /* renamed from: f */
    public AbstractC78249a f176220f;

    /* renamed from: g */
    long f176221g;

    /* renamed from: h */
    public C78233d f176222h;

    /* renamed from: i */
    public final C78467a f176223i;

    /* renamed from: j */
    private TextView f176224j;

    /* renamed from: k */
    private ImageView f176225k;

    /* renamed from: l */
    private TextView f176226l;

    /* renamed from: m */
    private View f176227m;

    /* renamed from: n */
    private ImageView f176228n;

    /* renamed from: o */
    private DraftItemView f176229o;

    /* renamed from: p */
    private Space f176230p;

    /* renamed from: q */
    private RelativeLayout f176231q;

    /* renamed from: r */
    private Context f176232r;

    /* renamed from: s */
    private C43237k f176233s;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.DraftViewHolder$f */
    final /* synthetic */ class View$OnClickListenerC78436f implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f176239a;

        static {
            Covode.recordClassIndex(91563);
        }

        View$OnClickListenerC78436f(AbstractC89172b bVar) {
            this.f176239a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f176239a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(91557);
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.DraftViewHolder$c */
    public static final class C78433c implements DraftItemView.AbstractC78114a {

        /* renamed from: a */
        final /* synthetic */ DraftViewHolder f176237a;

        static {
            Covode.recordClassIndex(91560);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78433c(DraftViewHolder draftViewHolder) {
            this.f176237a = draftViewHolder;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.draft.DraftItemView.AbstractC78114a
        /* renamed from: a */
        public final void mo122027a(int i, boolean z) {
            int i2;
            int i3;
            DraftViewHolder draftViewHolder = this.f176237a;
            ViewGroup viewGroup = draftViewHolder.f176217c;
            if (viewGroup == null) {
                C89219l.m154710a("mAwemeTitleContainer");
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ExpandableMentionTextView expandableMentionTextView = draftViewHolder.f176216b;
            if (expandableMentionTextView == null) {
                C89219l.m154710a("mAwemeTitle");
            }
            int i4 = 1;
            if (C78099c.m136517a(expandableMentionTextView.getContext())) {
                int i5 = marginLayoutParams.leftMargin;
                if (z) {
                    i4 = -1;
                }
                i2 = i5 + (i * i4);
                i3 = marginLayoutParams.rightMargin;
            } else {
                i2 = marginLayoutParams.leftMargin;
                int i6 = marginLayoutParams.rightMargin;
                if (!z) {
                    i4 = -1;
                }
                i3 = (i * i4) + i6;
            }
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            ViewGroup viewGroup2 = draftViewHolder.f176217c;
            if (viewGroup2 == null) {
                C89219l.m154710a("mAwemeTitleContainer");
            }
            viewGroup2.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C78233d m136954a(DraftViewHolder draftViewHolder) {
        C78233d dVar = draftViewHolder.f176222h;
        if (dVar == null) {
            C89219l.m154710a("mData");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ SimpleDraweeView m136956b(DraftViewHolder draftViewHolder) {
        SimpleDraweeView simpleDraweeView = draftViewHolder.f176218d;
        if (simpleDraweeView == null) {
            C89219l.m154710a("mCover");
        }
        return simpleDraweeView;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.DraftViewHolder$b */
    public static final class C78432b implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ DraftViewHolder f176235a;

        /* renamed from: b */
        final /* synthetic */ C43223c f176236b;

        static {
            Covode.recordClassIndex(91559);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
            C73991bj.m130131b(this.f176235a.f176215a + " :onGetVideoCoverFailed: errorCode = " + i);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            C73991bj.m130128a(this.f176235a.f176215a + " : onGetVideoCoverSuccess: ");
            if (!bitmap.isRecycled() && DraftViewHolder.m136956b(this.f176235a).getTag() != null && !(!C89219l.m154714a(DraftViewHolder.m136956b(this.f176235a).getTag(), (Object) this.f176236b.mo73726r()))) {
                SimpleDraweeView b = DraftViewHolder.m136956b(this.f176235a);
                if (!bitmap.isRecycled()) {
                    b.setImageBitmap(bitmap);
                }
            }
        }

        C78432b(DraftViewHolder draftViewHolder, C43223c cVar) {
            this.f176235a = draftViewHolder;
            this.f176236b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.DraftViewHolder$e */
    static final class View$OnLongClickListenerC78435e implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ DraftViewHolder f176238a;

        static {
            Covode.recordClassIndex(91562);
        }

        View$OnLongClickListenerC78435e(DraftViewHolder draftViewHolder) {
            this.f176238a = draftViewHolder;
        }

        public final boolean onLongClick(View view) {
            DraftViewHolder draftViewHolder = this.f176238a;
            if (view == null) {
                C89219l.m154715b();
            }
            C70005cr.m123611a();
            if (!C70005cr.m123613a(view.getContext())) {
                return true;
            }
            AbstractC78249a aVar = draftViewHolder.f176220f;
            C78233d dVar = draftViewHolder.f176222h;
            if (dVar == null) {
                C89219l.m154710a("mData");
            }
            aVar.mo122085a(view, dVar);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.DraftViewHolder$d */
    static final /* synthetic */ class C78434d extends C89217j implements AbstractC89172b<View, C89391z> {
        static {
            Covode.recordClassIndex(91561);
        }

        C78434d(DraftViewHolder draftViewHolder) {
            super(1, draftViewHolder, DraftViewHolder.class, "clickDraft", "clickDraft(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            DraftViewHolder draftViewHolder = (DraftViewHolder) this.receiver;
            C78233d dVar = draftViewHolder.f176222h;
            if (dVar == null) {
                C89219l.m154710a("mData");
            }
            if (dVar.f175702a) {
                AppCompatCheckBox appCompatCheckBox = draftViewHolder.f176219e;
                if (appCompatCheckBox == null) {
                    C89219l.m154710a("mCheckBox");
                }
                C78233d dVar2 = draftViewHolder.f176222h;
                if (dVar2 == null) {
                    C89219l.m154710a("mData");
                }
                appCompatCheckBox.setChecked(!dVar2.f175708e);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - draftViewHolder.f176221g >= 500) {
                    draftViewHolder.f176221g = currentTimeMillis;
                    AbstractC78249a aVar = draftViewHolder.f176220f;
                    int adapterPosition = draftViewHolder.getAdapterPosition();
                    C78233d dVar3 = draftViewHolder.f176222h;
                    if (dVar3 == null) {
                        C89219l.m154710a("mData");
                    }
                    aVar.mo122083a(adapterPosition, dVar3);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m136955a(C78233d dVar) {
        MethodCollector.m26663i(9180);
        ExpandableMentionTextView expandableMentionTextView = this.f176216b;
        if (expandableMentionTextView == null) {
            C89219l.m154710a("mAwemeTitle");
        }
        expandableMentionTextView.setSpanColor(C0643b.m2378c(this.f176232r, R.color.bx));
        String str = dVar.f175713j;
        if (str.length() == 0) {
            ExpandableMentionTextView expandableMentionTextView2 = this.f176216b;
            if (expandableMentionTextView2 == null) {
                C89219l.m154710a("mAwemeTitle");
            }
            expandableMentionTextView2.setText(this.f176232r.getText(R.string.bco));
            ExpandableMentionTextView expandableMentionTextView3 = this.f176216b;
            if (expandableMentionTextView3 == null) {
                C89219l.m154710a("mAwemeTitle");
            }
            expandableMentionTextView3.setTextColor(C0643b.m2378c(this.f176232r, R.color.c5));
            MethodCollector.m26664o(9180);
            return;
        }
        ExpandableMentionTextView expandableMentionTextView4 = this.f176216b;
        if (expandableMentionTextView4 == null) {
            C89219l.m154710a("mAwemeTitle");
        }
        expandableMentionTextView4.setText(str);
        if (dVar.f175714k != null) {
            ExpandableMentionTextView expandableMentionTextView5 = this.f176216b;
            if (expandableMentionTextView5 == null) {
                C89219l.m154710a("mAwemeTitle");
            }
            expandableMentionTextView5.mo122335a(C69805f.m123335a((List<AVTextExtraStruct>) dVar.f175714k), !C63244g.m114602a().mo73255A().mo93901a());
            List<? extends AVTextExtraStruct> list = dVar.f175714k;
            if (list == null) {
                C89219l.m154715b();
            }
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                if (aVTextExtraStruct.getType() == 0 || aVTextExtraStruct.getType() == 5) {
                    int subType = aVTextExtraStruct.getSubType();
                    if (subType != 1) {
                        if (subType == 2) {
                            ExpandableMentionTextView expandableMentionTextView6 = this.f176216b;
                            if (expandableMentionTextView6 == null) {
                                C89219l.m154710a("mAwemeTitle");
                            }
                            Context context = expandableMentionTextView6.getContext();
                            C89219l.m154716b(context, "");
                            ExpandableMentionTextView expandableMentionTextView7 = this.f176216b;
                            if (expandableMentionTextView7 == null) {
                                C89219l.m154710a("mAwemeTitle");
                            }
                            C69755c cVar = new C69755c(context, expandableMentionTextView7);
                            ExpandableMentionTextView expandableMentionTextView8 = this.f176216b;
                            if (expandableMentionTextView8 == null) {
                                C89219l.m154710a("mAwemeTitle");
                            }
                            Context context2 = expandableMentionTextView8.getContext();
                            C89219l.m154716b(context2, "");
                            cVar.f155895a = BitmapFactory.decodeResource(context2.getResources(), 2131233962);
                            ExpandableMentionTextView expandableMentionTextView9 = this.f176216b;
                            if (expandableMentionTextView9 == null) {
                                C89219l.m154710a("mAwemeTitle");
                            }
                            expandableMentionTextView9.mo122334a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), cVar);
                        } else if (subType == 3) {
                            ExpandableMentionTextView expandableMentionTextView10 = this.f176216b;
                            if (expandableMentionTextView10 == null) {
                                C89219l.m154710a("mAwemeTitle");
                            }
                            Context context3 = expandableMentionTextView10.getContext();
                            C89219l.m154716b(context3, "");
                            ExpandableMentionTextView expandableMentionTextView11 = this.f176216b;
                            if (expandableMentionTextView11 == null) {
                                C89219l.m154710a("mAwemeTitle");
                            }
                            C69755c cVar2 = new C69755c(context3, expandableMentionTextView11);
                            ExpandableMentionTextView expandableMentionTextView12 = this.f176216b;
                            if (expandableMentionTextView12 == null) {
                                C89219l.m154710a("mAwemeTitle");
                            }
                            Context context4 = expandableMentionTextView12.getContext();
                            C89219l.m154716b(context4, "");
                            cVar2.f155895a = BitmapFactory.decodeResource(context4.getResources(), 2131233964);
                            ExpandableMentionTextView expandableMentionTextView13 = this.f176216b;
                            if (expandableMentionTextView13 == null) {
                                C89219l.m154710a("mAwemeTitle");
                            }
                            expandableMentionTextView13.mo122334a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), cVar2);
                        } else if (subType != 6) {
                        }
                    }
                    ExpandableMentionTextView expandableMentionTextView14 = this.f176216b;
                    if (expandableMentionTextView14 == null) {
                        C89219l.m154710a("mAwemeTitle");
                    }
                    Context context5 = expandableMentionTextView14.getContext();
                    C89219l.m154716b(context5, "");
                    ExpandableMentionTextView expandableMentionTextView15 = this.f176216b;
                    if (expandableMentionTextView15 == null) {
                        C89219l.m154710a("mAwemeTitle");
                    }
                    C69753a aVar = new C69753a(context5, expandableMentionTextView15);
                    ExpandableMentionTextView expandableMentionTextView16 = this.f176216b;
                    if (expandableMentionTextView16 == null) {
                        C89219l.m154710a("mAwemeTitle");
                    }
                    expandableMentionTextView16.mo122334a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), aVar);
                }
            }
        }
        ExpandableMentionTextView expandableMentionTextView17 = this.f176216b;
        if (expandableMentionTextView17 == null) {
            C89219l.m154710a("mAwemeTitle");
        }
        expandableMentionTextView17.setTextColor(C0643b.m2378c(this.f176232r, R.color.bx));
        MethodCollector.m26664o(9180);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.tools.draft.d.a] */
    @Override // com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78442a
    /* renamed from: a */
    public final /* synthetic */ void mo122361a(C78233d dVar) {
        C78233d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        this.f176222h = dVar2;
        if (dVar2 == null) {
            C89219l.m154710a("mData");
        }
        dVar2.f175708e = false;
        C78233d dVar3 = this.f176222h;
        if (dVar3 == null) {
            C89219l.m154710a("mData");
        }
        if (dVar3.f175702a) {
            DraftItemView draftItemView = this.f176229o;
            if (draftItemView == null) {
                C89219l.m154710a("mContainerLl");
            }
            draftItemView.mo122032a();
            ImageView imageView = this.f176228n;
            if (imageView == null) {
                C89219l.m154710a("mDraftPlay");
            }
            imageView.animate().alpha(0.0f).setDuration(200).start();
        } else {
            DraftItemView draftItemView2 = this.f176229o;
            if (draftItemView2 == null) {
                C89219l.m154710a("mContainerLl");
            }
            draftItemView2.mo122033b();
            ImageView imageView2 = this.f176228n;
            if (imageView2 == null) {
                C89219l.m154710a("mDraftPlay");
            }
            imageView2.animate().alpha(1.0f).setDuration(200).start();
            C78233d dVar4 = this.f176222h;
            if (dVar4 == null) {
                C89219l.m154710a("mData");
            }
            dVar4.f175708e = false;
        }
        C78233d dVar5 = this.f176222h;
        if (dVar5 == null) {
            C89219l.m154710a("mData");
        }
        if (dVar5.f175703b) {
            TextView textView = this.f176226l;
            if (textView == null) {
                C89219l.m154710a("mDraftSize");
            }
            Context context = this.f176232r;
            C78233d dVar6 = this.f176222h;
            if (dVar6 == null) {
                C89219l.m154710a("mData");
            }
            long j = dVar6.f175709f;
            C89219l.m154721d(context, "");
            double d = (double) j;
            Double.isNaN(d);
            String string = context.getString(R.string.fn1, Double.valueOf(d / 1048576.0d));
            C89219l.m154716b(string, "");
            textView.setText(string);
        }
        AppCompatCheckBox appCompatCheckBox = this.f176219e;
        if (appCompatCheckBox == null) {
            C89219l.m154710a("mCheckBox");
        }
        appCompatCheckBox.setOnCheckedChangeListener(null);
        AppCompatCheckBox appCompatCheckBox2 = this.f176219e;
        if (appCompatCheckBox2 == null) {
            C89219l.m154710a("mCheckBox");
        }
        C78233d dVar7 = this.f176222h;
        if (dVar7 == null) {
            C89219l.m154710a("mData");
        }
        appCompatCheckBox2.setChecked(dVar7.f175708e);
        AppCompatCheckBox appCompatCheckBox3 = this.f176219e;
        if (appCompatCheckBox3 == null) {
            C89219l.m154710a("mCheckBox");
        }
        appCompatCheckBox3.setOnCheckedChangeListener(new C78431a(this));
        SimpleDraweeView simpleDraweeView = this.f176218d;
        if (simpleDraweeView == null) {
            C89219l.m154710a("mCover");
        }
        C78233d dVar8 = this.f176222h;
        if (dVar8 == null) {
            C89219l.m154710a("mData");
        }
        simpleDraweeView.setTag(((C78232c) dVar8).f175706c);
        SimpleDraweeView simpleDraweeView2 = this.f176218d;
        if (simpleDraweeView2 == null) {
            C89219l.m154710a("mCover");
        }
        simpleDraweeView2.setActualImageResource(2131232418);
        C78233d dVar9 = this.f176222h;
        if (dVar9 == null) {
            C89219l.m154710a("mData");
        }
        File file = new File(dVar9.f175707d);
        if (file.exists()) {
            Uri fromFile = Uri.fromFile(file);
            SimpleDraweeView simpleDraweeView3 = this.f176218d;
            if (simpleDraweeView3 == null) {
                C89219l.m154710a("mCover");
            }
            C84402a.m145174a(simpleDraweeView3, fromFile.toString(), -1, -1);
        } else {
            C43223c a = this.f176223i.mo122385a(((C78232c) dVar9).f175706c);
            if (a == null) {
                C73991bj.m130131b(this.f176215a + ": bindDraftCover -> draft is null");
                C22708a.m42800a("queryNull -> " + this.f176215a + " : bindDraftCover");
            } else {
                int dimensionPixelOffset = this.f176232r.getResources().getDimensionPixelOffset(R.dimen.j6);
                C43237k kVar = new C43237k(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888);
                this.f176233s = kVar;
                C43225d.m86327a(a, kVar, new C78432b(this, a));
            }
        }
        C78233d dVar10 = this.f176222h;
        if (dVar10 == null) {
            C89219l.m154710a("mData");
        }
        m136955a(dVar10);
        TextView textView2 = this.f176224j;
        if (textView2 == null) {
            C89219l.m154710a("mAwemeChallenge");
        }
        textView2.setVisibility(8);
        ImageView imageView3 = this.f176225k;
        if (imageView3 == null) {
            C89219l.m154710a("mChallengeIcon");
        }
        imageView3.setVisibility(8);
        RelativeLayout relativeLayout = this.f176231q;
        if (relativeLayout == null) {
            C89219l.m154710a("mDraftListItemLayout");
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        Space space = this.f176230p;
        if (space == null) {
            C89219l.m154710a("mDraftListSpaceTop");
        }
        ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
        int b = (int) C13628n.m24520b(this.f176232r, 8.0f);
        int b2 = (int) C13628n.m24520b(this.f176232r, 88.0f);
        if (dVar2.f175716m) {
            layoutParams2.height = b * 2;
            b2 += b;
        } else {
            layoutParams2.height = b;
        }
        C78233d dVar11 = this.f176222h;
        if (dVar11 == null) {
            C89219l.m154710a("mData");
        }
        if (!dVar11.f175715l) {
            View view = this.f176227m;
            if (view == null) {
                C89219l.m154710a("mContentDivider1");
            }
            view.setVisibility(4);
            layoutParams.height = b2 - b;
        } else {
            View view2 = this.f176227m;
            if (view2 == null) {
                C89219l.m154710a("mContentDivider1");
            }
            view2.setVisibility(0);
            layoutParams.height = b2;
        }
        Space space2 = this.f176230p;
        if (space2 == null) {
            C89219l.m154710a("mDraftListSpaceTop");
        }
        space2.setLayoutParams(layoutParams2);
        RelativeLayout relativeLayout2 = this.f176231q;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDraftListItemLayout");
        }
        relativeLayout2.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout3 = this.f176231q;
        if (relativeLayout3 == null) {
            C89219l.m154710a("mDraftListItemLayout");
        }
        relativeLayout3.setLayoutParams(layoutParams);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.DraftViewHolder$a */
    static final class C78431a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ DraftViewHolder f176234a;

        static {
            Covode.recordClassIndex(91558);
        }

        C78431a(DraftViewHolder draftViewHolder) {
            this.f176234a = draftViewHolder;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C73991bj.m130131b(this.f176234a.f176215a + "click checkBox");
            DraftViewHolder.m136954a(this.f176234a).f175708e = z;
            this.f176234a.f176220f.mo122086a(DraftViewHolder.m136954a(this.f176234a), z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraftViewHolder(View view, AbstractC78249a aVar, C78467a aVar2) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f176223i = aVar2;
        this.f176220f = aVar;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f176232r = context;
        View c = C0792v.m2762c(view, (int) R.id.p9);
        C89219l.m154716b(c, "");
        this.f176216b = (ExpandableMentionTextView) c;
        View c2 = C0792v.m2762c(view, (int) R.id.cet);
        C89219l.m154716b(c2, "");
        this.f176217c = (ViewGroup) c2;
        View c3 = C0792v.m2762c(view, (int) R.id.evf);
        C89219l.m154716b(c3, "");
        this.f176226l = (TextView) c3;
        View c4 = C0792v.m2762c(view, (int) R.id.p0);
        C89219l.m154716b(c4, "");
        this.f176224j = (TextView) c4;
        View c5 = C0792v.m2762c(view, (int) R.id.a3h);
        C89219l.m154716b(c5, "");
        this.f176225k = (ImageView) c5;
        View c6 = C0792v.m2762c(view, (int) R.id.afn);
        C89219l.m154716b(c6, "");
        this.f176218d = (SimpleDraweeView) c6;
        View c7 = C0792v.m2762c(view, (int) R.id.eu7);
        C89219l.m154716b(c7, "");
        this.f176227m = c7;
        View c8 = C0792v.m2762c(view, (int) R.id.aop);
        C89219l.m154716b(c8, "");
        this.f176228n = (ImageView) c8;
        View c9 = C0792v.m2762c(view, (int) R.id.a4l);
        C89219l.m154716b(c9, "");
        this.f176219e = (AppCompatCheckBox) c9;
        View c10 = C0792v.m2762c(view, (int) R.id.ccp);
        C89219l.m154716b(c10, "");
        DraftItemView draftItemView = (DraftItemView) c10;
        this.f176229o = draftItemView;
        if (draftItemView == null) {
            C89219l.m154710a("mContainerLl");
        }
        draftItemView.setOnScrollListener(new C78433c(this));
        View c11 = C0792v.m2762c(view, (int) R.id.aoo);
        C89219l.m154716b(c11, "");
        this.f176230p = (Space) c11;
        View c12 = C0792v.m2762c(view, (int) R.id.aok);
        C89219l.m154716b(c12, "");
        RelativeLayout relativeLayout = (RelativeLayout) c12;
        this.f176231q = relativeLayout;
        if (relativeLayout == null) {
            C89219l.m154710a("mDraftListItemLayout");
        }
        relativeLayout.setOnClickListener(new View$OnClickListenerC78436f(new C78434d(this)));
        RelativeLayout relativeLayout2 = this.f176231q;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDraftListItemLayout");
        }
        relativeLayout2.setOnLongClickListener(new View$OnLongClickListenerC78435e(this));
    }
}

package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36305b;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36317c;
import com.p2082ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleAvatarCell;
import com.p2082ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleEditCell;
import com.p2082ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleExpandCell;
import com.p2082ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleFoldCell;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36311e;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36312f;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36313g;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36314h;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36315i;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.comment.util.C37199i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentTaggedPeopleView */
public final class CommentTaggedPeopleView extends FrameLayout implements AbstractC1214u<C33942b> {

    /* renamed from: b */
    public static final C36376a f86026b = new C36376a((byte) 0);

    /* renamed from: a */
    public DataCenter f86027a;

    /* renamed from: c */
    private final TaggedPeopleList f86028c;

    /* renamed from: d */
    private final TuxTextView f86029d;

    /* renamed from: e */
    private List<C36315i> f86030e;

    /* renamed from: f */
    private Aweme f86031f;

    /* renamed from: g */
    private C36317c f86032g;

    /* renamed from: h */
    private int f86033h;

    /* renamed from: i */
    private Set<String> f86034i;

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentTaggedPeopleView$b */
    static final class C36377b implements OnActivityResultCallback {

        /* renamed from: a */
        public static final C36377b f86035a = new C36377b();

        static {
            Covode.recordClassIndex(43670);
        }

        C36377b() {
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }

    static {
        Covode.recordClassIndex(43668);
    }

    public CommentTaggedPeopleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentTaggedPeopleView$a */
    public static final class C36376a {
        static {
            Covode.recordClassIndex(43669);
        }

        private C36376a() {
        }

        public /* synthetic */ C36376a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final void m74087a(boolean z) {
        C37199i.m75173a("CommentTaggedPeopleView", "CommentTaggedPeopleView: updateDataList ".concat(String.valueOf(z)));
        C36317c cVar = this.f86032g;
        if (cVar != null) {
            cVar.setTaggedPeopleFold(z);
        }
        C36305b bVar = null;
        if (!z) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f86030e);
            arrayList.add(new C36314h(this.f86027a));
            DataCenter dataCenter = this.f86027a;
            C36317c cVar2 = this.f86032g;
            if (cVar2 != null) {
                bVar = cVar2.getMobParams();
            }
            arrayList.add(new C36312f(dataCenter, bVar));
            this.f86028c.getState().mo28138b(arrayList);
        } else if (this.f86030e.size() > this.f86033h - 1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f86030e.subList(0, this.f86033h - 2));
            arrayList2.add(new C36313g(this.f86030e.size(), this.f86033h, this.f86027a));
            DataCenter dataCenter2 = this.f86027a;
            C36317c cVar3 = this.f86032g;
            if (cVar3 != null) {
                bVar = cVar3.getMobParams();
            }
            arrayList2.add(new C36312f(dataCenter2, bVar));
            this.f86028c.getState().mo28138b(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f86030e);
            DataCenter dataCenter3 = this.f86027a;
            C36317c cVar4 = this.f86032g;
            if (cVar4 != null) {
                bVar = cVar4.getMobParams();
            }
            arrayList3.add(new C36312f(dataCenter3, bVar));
            this.f86028c.getState().mo28138b(arrayList3);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        Object obj;
        String str;
        Integer num;
        int i;
        InteractionTagInfo interactionTagInfo;
        AwemeStatus status;
        C33942b bVar2 = bVar;
        StringBuilder sb = new StringBuilder("onChanged: ");
        List<InteractionTagUserInfo> list = null;
        if (bVar2 != null) {
            obj = bVar2.mo60212a();
        } else {
            obj = null;
        }
        C37199i.m75173a("CommentTaggedPeopleView", sb.append(obj).toString());
        if (bVar2 != null && (str = bVar2.f80277a) != null && str.hashCode() == -1771772845 && str.equals("TAGGED_PEOPLE_ACTION") && (num = (Integer) bVar2.mo60212a()) != null) {
            if (num.intValue() == 3) {
                m74087a(true);
            } else if (num != null) {
                if (num.intValue() == 4) {
                    m74087a(false);
                } else if (num.intValue() == 2) {
                    Context context = getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    if ((context instanceof ActivityC0945e) && this.f86031f != null && context != null) {
                        CommentService e = CommentServiceImpl.m73664e();
                        Context context2 = getContext();
                        C89219l.m154716b(context2, "");
                        Aweme aweme = this.f86031f;
                        if (aweme == null || (status = aweme.getStatus()) == null) {
                            i = 0;
                        } else {
                            i = status.getPrivateStatus();
                        }
                        Aweme aweme2 = this.f86031f;
                        if (!(aweme2 == null || (interactionTagInfo = aweme2.getInteractionTagInfo()) == null)) {
                            list = interactionTagInfo.getTaggedUsers();
                        }
                        e.mo63289a(context2, "", aweme, i, list, C36377b.f86035a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63652a(DataCenter dataCenter, C36317c cVar) {
        List<InteractionTagUserInfo> taggedUsers;
        List<InteractionTagUserInfo> taggedUsers2;
        C89219l.m154721d(cVar, "");
        InteractionTagInfo interactionTagInfo = cVar.getAweme().getInteractionTagInfo();
        if (interactionTagInfo == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null || taggedUsers.isEmpty()) {
            setVisibility(8);
            return;
        }
        this.f86028c.setMaxLineCount(this.f86033h);
        this.f86032g = cVar;
        this.f86031f = cVar.getAweme();
        this.f86030e.clear();
        this.f86034i.clear();
        InteractionTagInfo interactionTagInfo2 = cVar.getAweme().getInteractionTagInfo();
        if (!(interactionTagInfo2 == null || (taggedUsers2 = interactionTagInfo2.getTaggedUsers()) == null)) {
            List<InteractionTagUserInfo> g = C89070n.m154585g((Collection) taggedUsers2);
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) g, 10));
            for (InteractionTagUserInfo interactionTagUserInfo : g) {
                arrayList.add(new C36311e(InteractionTagInfoKt.toUser(interactionTagUserInfo), cVar.getMobParams(), this.f86034i));
            }
            this.f86030e.addAll(C89070n.m154585g((Collection) arrayList));
        }
        String quantityString = getResources().getQuantityString(R.plurals.cg, this.f86030e.size());
        C89219l.m154716b(quantityString, "");
        this.f86029d.setText(quantityString + ':');
        this.f86027a = dataCenter;
        m74087a(cVar.isTaggedPeopleFold());
    }

    private /* synthetic */ CommentTaggedPeopleView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentTaggedPeopleView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9053);
        this.f86030e = new ArrayList();
        this.f86033h = 8;
        this.f86034i = new LinkedHashSet();
        FrameLayout.inflate(context, R.layout.jr, this);
        View findViewById = findViewById(R.id.ef2);
        C89219l.m154716b(findViewById, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.f86029d = tuxTextView;
        View findViewById2 = findViewById(R.id.ef3);
        C89219l.m154716b(findViewById2, "");
        TaggedPeopleList taggedPeopleList = (TaggedPeopleList) findViewById2;
        this.f86028c = taggedPeopleList;
        taggedPeopleList.mo28083a(TaggedPeopleAvatarCell.class, TaggedPeopleExpandCell.class, TaggedPeopleFoldCell.class, TaggedPeopleEditCell.class);
        int a = C17234b.m31806a(context);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a2 = a - C89241a.m154730a(TypedValue.applyDimension(1, 21.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        int a3 = a2 - C89241a.m154730a(TypedValue.applyDimension(1, 52.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        float a4 = ((float) (a3 - C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())))) - tuxTextView.getPaint().measureText("Tagged:");
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        Resources system5 = Resources.getSystem();
        C89219l.m154709a((Object) system5, "");
        int a5 = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system5.getDisplayMetrics()));
        Resources system6 = Resources.getSystem();
        C89219l.m154709a((Object) system6, "");
        this.f86033h = (int) ((((float) C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics()))) + a4) / ((float) (a5 + C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system6.getDisplayMetrics())))));
        C37199i.m75173a("CommentTaggedPeopleView", "bindTaggedPeople  maxW:" + a4 + "  count:" + this.f86033h);
        int i = this.f86033h;
        Resources system7 = Resources.getSystem();
        C89219l.m154709a((Object) system7, "");
        taggedPeopleList.mo4415b(new C36383d(i, C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system7.getDisplayMetrics()))));
        MethodCollector.m26664o(9053);
    }
}

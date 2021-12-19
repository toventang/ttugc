package com.p2082ss.android.ugc.aweme.feed.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.dialog.Window$CallbackC17224p;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50120bi;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50307i;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.k */
public final class C49628k {

    /* renamed from: a */
    public static C49627j f114208a;

    /* renamed from: b */
    public static C49626i f114209b;

    /* renamed from: c */
    public static C49626i f114210c;

    /* renamed from: d */
    public static boolean f114211d;

    /* renamed from: e */
    public static int f114212e;

    /* renamed from: f */
    public static int f114213f = -1;

    /* renamed from: g */
    public static long f114214g;

    /* renamed from: h */
    static C49649p[] f114215h;

    /* renamed from: i */
    static String f114216i = "";

    /* renamed from: j */
    public static String f114217j = "";

    /* renamed from: k */
    public static String f114218k = "";

    /* renamed from: l */
    public static String f114219l = "";

    /* renamed from: m */
    public static String f114220m = "";

    /* renamed from: n */
    public static String f114221n = "";

    /* renamed from: o */
    public static String f114222o = "";

    /* renamed from: p */
    public static int f114223p = -1;

    /* renamed from: q */
    public static boolean f114224q;

    /* renamed from: r */
    public static boolean f114225r;

    /* renamed from: s */
    static boolean f114226s;

    /* renamed from: t */
    public static final C49628k f114227t = new C49628k();

    /* renamed from: u */
    private static int f114228u;

    /* renamed from: v */
    private static boolean f114229v;

    /* renamed from: w */
    private static long f114230w;

    /* renamed from: x */
    private static final Handler f114231x = new Handler();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$f */
    public static final class C49634f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C49634f f114242a = new C49634f();

        static {
            Covode.recordClassIndex(58481);
        }

        C49634f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$a */
    public enum EnumC49629a {
        SUBMIT(1),
        INTERVAL(2),
        CANCEL(3),
        DISLIKE(4),
        PRIORITY(5);
        

        /* renamed from: b */
        private final int f114233b;

        public final int getType() {
            return this.f114233b;
        }

        static {
            Covode.recordClassIndex(58476);
        }

        private EnumC49629a(int i) {
            this.f114233b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$b */
    public enum EnumC49630b {
        BINARY(0),
        FIVE_LEVEL(1),
        SINGLE_CHOICE(2),
        MULTIPLE_CHOICE(3);
        

        /* renamed from: b */
        private final int f114235b;

        public final int getType() {
            return this.f114235b;
        }

        static {
            Covode.recordClassIndex(58477);
        }

        private EnumC49630b(int i) {
            this.f114235b = i;
        }
    }

    private C49628k() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$n */
    public static final class C49642n implements AbstractC49650q {

        /* renamed from: a */
        final /* synthetic */ C17197a f114267a;

        static {
            Covode.recordClassIndex(58489);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.helper.AbstractC49650q
        /* renamed from: a */
        public final void mo81436a() {
            C17197a aVar = this.f114267a;
            if (aVar != null) {
                aVar.mo27182a((Boolean) true);
            }
        }

        public C49642n(C17197a aVar) {
            this.f114267a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$c */
    public static final class RunnableC49631c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f114236a;

        static {
            Covode.recordClassIndex(58478);
        }

        RunnableC49631c(boolean z) {
            this.f114236a = z;
        }

        public final void run() {
            if (!C49628k.f114225r) {
                return;
            }
            if (this.f114236a) {
                C49628k.f114214g = System.currentTimeMillis();
            } else {
                C49628k.m93077a("background");
            }
        }
    }

    /* renamed from: b */
    public static void m93080b() {
        if (f114230w != 0) {
            Keva.getRepo("feed_survey").storeLong("key_next_time", System.currentTimeMillis() + (f114230w * 1000));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$h */
    public static final class RunnableC49636h implements Runnable {

        /* renamed from: a */
        public static final RunnableC49636h f114244a = new RunnableC49636h();

        static {
            Covode.recordClassIndex(58483);
        }

        RunnableC49636h() {
        }

        public final void run() {
            if (C49628k.f114225r) {
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                if (O.mo123892o()) {
                    C81079v.m140776O().mo123908B();
                    C49628k.f114226s = true;
                    return;
                }
                C49628k.m93074a();
            }
        }
    }

    static {
        Covode.recordClassIndex(58475);
    }

    /* renamed from: a */
    public static void m93074a() {
        AbstractC80747i O = C81079v.m140776O();
        C89219l.m154716b(O, "");
        if (O.mo123892o()) {
            C81079v.m140776O().mo123908B();
            f114226s = true;
            return;
        }
        f114231x.postDelayed(RunnableC49636h.f114244a, 1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (p4600h.p4622m.C89361p.m154929e((java.lang.CharSequence) r2, (java.lang.CharSequence) r1.append(r0).toString()) == false) goto L_0x0069;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m93081c() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.helper.C49628k.m93081c():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$g */
    public static final class C49635g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C49635g f114243a = new C49635g();

        static {
            Covode.recordClassIndex(58482);
        }

        C49635g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$o */
    public static final class C49643o implements Window$CallbackC17224p.AbstractC17225a {
        static {
            Covode.recordClassIndex(58490);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.Window$CallbackC17224p.AbstractC17225a
        /* renamed from: a */
        public final void mo27249a(boolean z) {
            if (z) {
                C49628k.m93074a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$p */
    public static final class DialogInterface$OnDismissListenerC49644p implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC49644p f114268a = new DialogInterface$OnDismissListenerC49644p();

        static {
            Covode.recordClassIndex(58491);
        }

        DialogInterface$OnDismissListenerC49644p() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (C49628k.f114226s) {
                C81079v.m140776O().mo123950y();
                C49628k.f114226s = false;
            }
        }
    }

    /* renamed from: a */
    public static final void m93078a(boolean z) {
        f114231x.post(new RunnableC49631c(z));
        if (z && f114228u > 0) {
            f114228u = 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$e */
    public static final class C49633e implements C50120bi.AbstractC50121a {

        /* renamed from: a */
        final /* synthetic */ C50120bi f114240a;

        /* renamed from: b */
        final /* synthetic */ List f114241b;

        static {
            Covode.recordClassIndex(58480);
        }

        public C49633e(C50120bi biVar, List list) {
            this.f114240a = biVar;
            this.f114241b = list;
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50120bi.AbstractC50121a
        /* renamed from: a */
        public final void mo81429a(float f) {
            int i;
            AbstractC49650q optionClickListener = this.f114240a.getOptionClickListener();
            if (optionClickListener != null) {
                optionClickListener.mo81436a();
            }
            int i2 = (int) f;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = 0;
            }
            this.f114240a.setOption(((C49649p) this.f114241b.get(i)).f114280b);
            C49649p pVar = (C49649p) this.f114241b.get(i);
            C49628k.f114215h = new C49649p[]{pVar};
            C49628k.f114216i = String.valueOf(pVar.f114279a);
        }
    }

    /* renamed from: a */
    private static void m93075a(int i) {
        if (i != EnumC49629a.SUBMIT.getType()) {
            f114215h = null;
        }
        C49626i iVar = new C49626i(f114219l, f114220m, "", "", new C49652s[]{new C49652s(f114221n, f114223p, f114222o, f114215h)});
        Object a = RetrofitFactory.m33635a().mo28817b(Api.f79771d).mo28832d().mo28858a(FeedSurveyApi.class);
        C89219l.m154716b(a, "");
        ((FeedSurveyApi) a).submitFeedSurvey(f114217j, f114212e, i, C80342dg.m139300a().mo46674b(iVar)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88925a.m154180b(C88946a.f201991c)).mo142915a(C49634f.f114242a, C49635g.f114243a);
        if (f114212e == 2) {
            Keva.getRepo("feed_survey").storeString("key_submitted_flexible_survey", Keva.getRepo("feed_survey").getString("key_submitted_flexible_survey", "") + ',' + f114219l);
            return;
        }
        Keva.getRepo("feed_survey").storeString("key_submitted_fixed_aweme", Keva.getRepo("feed_survey").getString("key_submitted_fixed_aweme", "") + ',' + f114217j);
    }

    /* renamed from: a */
    public static void m93077a(String str) {
        C33744d a = new C33744d().mo59983a("group_id", f114217j).mo59983a("survey_id", f114219l).mo59983a("author_id", f114218k);
        String name = EnumC49630b.values()[f114223p].name();
        Locale locale = Locale.ENGLISH;
        String str2 = "";
        C89219l.m154716b(locale, str2);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(locale);
        C89219l.m154716b(lowerCase, str2);
        C33744d a2 = a.mo59983a(StringSet.type, lowerCase).mo59981a("stay_time", (System.currentTimeMillis() - f114214g) / 1000).mo59983a("exit_method", str);
        String name2 = EnumC49629a.SUBMIT.name();
        Locale locale2 = Locale.ENGLISH;
        C89219l.m154716b(locale2, str2);
        Objects.requireNonNull(name2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase2 = name2.toLowerCase(locale2);
        C89219l.m154716b(lowerCase2, str2);
        if (TextUtils.equals(str, lowerCase2)) {
            str2 = f114216i;
        }
        C33744d a3 = a2.mo59983a("result", str2);
        int i = 1;
        if (f114212e != 1) {
            i = 0;
        }
        C39162r.m79460a("exit_survey", a3.mo59980a("is_fixed_survey", i).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$k */
    public static final class DialogInterface$OnClickListenerC49639k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VerticalViewPager f114255a;

        /* renamed from: b */
        final /* synthetic */ int f114256b;

        /* renamed from: c */
        final /* synthetic */ int f114257c;

        /* renamed from: d */
        final /* synthetic */ int f114258d;

        static {
            Covode.recordClassIndex(58486);
        }

        public DialogInterface$OnClickListenerC49639k(VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f114255a = verticalViewPager;
            this.f114256b = i;
            this.f114257c = i2;
            this.f114258d = i3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C49628k.m93076a(EnumC49629a.CANCEL, this.f114255a, this.f114256b, this.f114257c, this.f114258d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$l */
    public static final class DialogInterface$OnClickListenerC49640l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VerticalViewPager f114259a;

        /* renamed from: b */
        final /* synthetic */ int f114260b;

        /* renamed from: c */
        final /* synthetic */ int f114261c;

        /* renamed from: d */
        final /* synthetic */ int f114262d;

        static {
            Covode.recordClassIndex(58487);
        }

        public DialogInterface$OnClickListenerC49640l(VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f114259a = verticalViewPager;
            this.f114260b = i;
            this.f114261c = i2;
            this.f114262d = i3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C49628k.m93076a(EnumC49629a.SUBMIT, this.f114259a, this.f114260b, this.f114261c, this.f114262d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$m */
    public static final class DialogInterface$OnClickListenerC49641m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VerticalViewPager f114263a;

        /* renamed from: b */
        final /* synthetic */ int f114264b;

        /* renamed from: c */
        final /* synthetic */ int f114265c;

        /* renamed from: d */
        final /* synthetic */ int f114266d;

        static {
            Covode.recordClassIndex(58488);
        }

        public DialogInterface$OnClickListenerC49641m(VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f114263a = verticalViewPager;
            this.f114264b = i;
            this.f114265c = i2;
            this.f114266d = i3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C49628k.m93076a(EnumC49629a.CANCEL, this.f114263a, this.f114264b, this.f114265c, this.f114266d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$i */
    public static final class DialogInterface$OnClickListenerC49637i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f114245a;

        /* renamed from: b */
        final /* synthetic */ VerticalViewPager f114246b;

        /* renamed from: c */
        final /* synthetic */ int f114247c;

        /* renamed from: d */
        final /* synthetic */ int f114248d;

        /* renamed from: e */
        final /* synthetic */ int f114249e;

        static {
            Covode.recordClassIndex(58484);
        }

        public DialogInterface$OnClickListenerC49637i(List list, VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f114245a = list;
            this.f114246b = verticalViewPager;
            this.f114247c = i;
            this.f114248d = i2;
            this.f114249e = i3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.feed.helper.p[] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(DialogInterface dialogInterface, int i) {
            C49628k.f114215h = new C49649p[]{this.f114245a.get(0)};
            C49628k.f114216i = String.valueOf(((C49649p) this.f114245a.get(0)).f114279a);
            C49628k.m93076a(EnumC49629a.SUBMIT, this.f114246b, this.f114247c, this.f114248d, this.f114249e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$j */
    public static final class DialogInterface$OnClickListenerC49638j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f114250a;

        /* renamed from: b */
        final /* synthetic */ VerticalViewPager f114251b;

        /* renamed from: c */
        final /* synthetic */ int f114252c;

        /* renamed from: d */
        final /* synthetic */ int f114253d;

        /* renamed from: e */
        final /* synthetic */ int f114254e;

        static {
            Covode.recordClassIndex(58485);
        }

        public DialogInterface$OnClickListenerC49638j(List list, VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f114250a = list;
            this.f114251b = verticalViewPager;
            this.f114252c = i;
            this.f114253d = i2;
            this.f114254e = i3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.feed.helper.p[] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(DialogInterface dialogInterface, int i) {
            C49628k.f114215h = new C49649p[]{this.f114250a.get(1)};
            C49628k.f114216i = String.valueOf(((C49649p) this.f114250a.get(1)).f114279a);
            C49628k.m93076a(EnumC49629a.SUBMIT, this.f114251b, this.f114252c, this.f114253d, this.f114254e);
        }
    }

    /* renamed from: a */
    public static View m93073a(Context context, int i, List<C49649p> list) {
        boolean z;
        int i2;
        if (context == null) {
            return null;
        }
        C50307i iVar = new C50307i(context);
        int i3 = 1;
        if (i == EnumC49630b.SINGLE_CHOICE.getType()) {
            z = true;
        } else {
            z = false;
            i3 = 2;
        }
        iVar.setChoiceMode(i3);
        iVar.setVisibility(0);
        iVar.setDivider(null);
        iVar.setSelector(new ColorDrawable(0));
        ArrayList arrayList = new ArrayList(list.size());
        for (C49649p pVar : list) {
            arrayList.add(pVar.f114280b);
        }
        if (z) {
            i2 = R.layout.sc;
        } else {
            i2 = R.layout.sb;
        }
        iVar.setAdapter((ListAdapter) new ArrayAdapter(context, i2, arrayList));
        iVar.setOnItemClickListener(new C49632d(iVar, z, list));
        iVar.setPadding(0, (int) C13628n.m24520b(context, 20.0f), 0, 0);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$d */
    public static final class C49632d implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ C50307i f114237a;

        /* renamed from: b */
        final /* synthetic */ boolean f114238b;

        /* renamed from: c */
        final /* synthetic */ List f114239c;

        static {
            Covode.recordClassIndex(58479);
        }

        C49632d(C50307i iVar, boolean z, List list) {
            this.f114237a = iVar;
            this.f114238b = z;
            this.f114239c = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AbstractC49650q optionClickListener = this.f114237a.getOptionClickListener();
            if (optionClickListener != null) {
                optionClickListener.mo81436a();
            }
            if (this.f114238b) {
                C49649p pVar = (C49649p) this.f114239c.get(this.f114237a.getCheckedItemPosition());
                C49628k.f114215h = new C49649p[]{pVar};
                C49628k.f114216i = String.valueOf(pVar.f114279a);
                return;
            }
            SparseBooleanArray checkedItemPositions = this.f114237a.getCheckedItemPositions();
            C89219l.m154716b(checkedItemPositions, "");
            if (checkedItemPositions != null) {
                C49628k.f114216i = "";
                ArrayList arrayList = new ArrayList();
                int size = checkedItemPositions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (checkedItemPositions.valueAt(i2)) {
                        C49649p pVar2 = (C49649p) this.f114239c.get(checkedItemPositions.keyAt(i2));
                        arrayList.add(pVar2);
                        C49628k.f114216i = C89219l.m154704a(C49628k.f114216i, (Object) String.valueOf(pVar2.f114279a));
                    }
                }
                Object[] array = arrayList.toArray(new C49649p[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                C49628k.f114215h = (C49649p[]) array;
            }
        }
    }

    /* renamed from: a */
    public static final boolean m93079a(String str, String str2, boolean z, int i) {
        C49626i iVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (f114229v && f114209b != null && z) {
            String string = Keva.getRepo("feed_survey").getString("key_submitted_fixed_aweme", "");
            if (!TextUtils.isEmpty(string)) {
                C89219l.m154716b(string, "");
                if (C89361p.m154908a((CharSequence) string, (CharSequence) ",".concat(String.valueOf(str)), false)) {
                    return false;
                }
            }
            C49626i iVar2 = f114209b;
            if (iVar2 == null) {
                C89219l.m154715b();
            }
            f114219l = iVar2.f114198a;
            C49626i iVar3 = f114209b;
            if (iVar3 == null) {
                C89219l.m154715b();
            }
            f114220m = iVar3.f114199b;
            C49626i iVar4 = f114209b;
            if (iVar4 == null) {
                C89219l.m154715b();
            }
            C49652s[] sVarArr = iVar4.f114202e;
            if (!(sVarArr == null || sVarArr.length == 0)) {
                f114223p = sVarArr[0].f114285b;
                f114221n = sVarArr[0].f114284a;
                f114222o = sVarArr[0].f114286c;
            }
            f114212e = 1;
        } else if (!f114211d || (iVar = f114210c) == null || i < f114213f) {
            f114212e = 0;
            return false;
        } else {
            f114219l = iVar.f114198a;
            C49626i iVar5 = f114210c;
            if (iVar5 == null) {
                C89219l.m154715b();
            }
            f114220m = iVar5.f114199b;
            C49626i iVar6 = f114210c;
            if (iVar6 == null) {
                C89219l.m154715b();
            }
            C49652s[] sVarArr2 = iVar6.f114202e;
            if (!(sVarArr2 == null || sVarArr2.length == 0)) {
                f114223p = sVarArr2[0].f114285b;
                f114221n = sVarArr2[0].f114284a;
                f114222o = sVarArr2[0].f114286c;
            }
            f114212e = 2;
        }
        f114217j = str;
        f114218k = str2;
        if (f114224q) {
            m93075a(EnumC49629a.DISLIKE.getType());
            m93080b();
            f114224q = false;
            return false;
        } else if (C51648a.f118980a.mo87334n()) {
            m93075a(EnumC49629a.PRIORITY.getType());
            m93080b();
            return false;
        } else if (Keva.getRepo("feed_survey").getLong("key_next_time", 0) <= System.currentTimeMillis()) {
            return true;
        } else {
            m93075a(EnumC49629a.INTERVAL.getType());
            return false;
        }
    }

    /* renamed from: a */
    public static void m93076a(EnumC49629a aVar, VerticalViewPager verticalViewPager, int i, int i2, int i3) {
        m93075a(aVar.getType());
        verticalViewPager.mo67972a(i, i2, i3);
        String name = aVar.name();
        Locale locale = Locale.ENGLISH;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        m93077a(lowerCase);
        f114225r = false;
        f114215h = null;
    }
}

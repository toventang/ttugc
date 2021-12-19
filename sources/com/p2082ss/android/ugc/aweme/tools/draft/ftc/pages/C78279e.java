package com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.draft.model.C43221a;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63171ae;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69753a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69755c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69805f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78285f;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCDraftItemView;
import com.p2082ss.android.ugc.aweme.tools.draft.p4104e.C78247b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78402a;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84923a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.e */
public final class C78279e extends AbstractC84923a<C43223c> implements FTCAwemeDraftViewHolder.AbstractC78263a {

    /* renamed from: e */
    public static final C78280a f175830e = new C78280a((byte) 0);

    /* renamed from: a */
    boolean f175831a;

    /* renamed from: b */
    boolean f175832b;

    /* renamed from: c */
    public boolean f175833c = true;

    /* renamed from: d */
    public AbstractC78323i f175834d;

    /* renamed from: r */
    private final Map<ImageView, C24117a<AbstractC24454c>> f175835r;

    /* renamed from: s */
    private final FTCAwemeDraftViewHolder.AbstractC78263a f175836s;

    static {
        Covode.recordClassIndex(91396);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.e$a */
    public static final class C78280a {
        static {
            Covode.recordClassIndex(91397);
        }

        private C78280a() {
        }

        public /* synthetic */ C78280a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final boolean m136763b() {
        for (C43223c cVar : this.f189754f) {
            if (cVar != null && cVar.mo73652a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.e$b */
    static final class RunnableC78281b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78279e f175837a;

        /* renamed from: b */
        final /* synthetic */ List f175838b;

        static {
            Covode.recordClassIndex(91398);
        }

        RunnableC78281b(C78279e eVar, List list) {
            this.f175837a = eVar;
            this.f175838b = list;
        }

        public final void run() {
            final C43223c cVar = null;
            for (C43223c cVar2 : this.f175838b) {
                if (cVar2.f100925y) {
                    C78279e.m136762b(cVar2);
                    cVar = cVar2;
                }
            }
            if (cVar != null) {
                C1731i.m5640b(new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78279e.RunnableC78281b.CallableC782821 */

                    static {
                        Covode.recordClassIndex(91399);
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        C78397c.m136927a().notifyDraftDelete(cVar);
                        return C89391z.f203057a;
                    }
                }, C1731i.f5564c);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final int mo122048a(int i) {
        Object obj = this.f189754f.get(i);
        C89219l.m154716b(obj, "");
        return ((C43223c) obj).f100924x;
    }

    /* renamed from: b */
    public static void m136762b(C43223c cVar) {
        AbstractC63171ae o = C63253l.f143623a.mo73319o();
        if (cVar == null) {
            C89219l.m154715b();
        }
        String r = cVar.mo73726r();
        C89219l.m154716b(r, "");
        o.mo93758a(r);
        C78133ai.m136600a().mo122073b(cVar, "user_click");
        C43225d.m86337g(cVar);
        C72867e.m128688b(cVar.mo73676f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (((com.p2082ss.android.ugc.aweme.draft.model.C43223c) r0).f100924x == 5) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (((com.p2082ss.android.ugc.aweme.draft.model.C43223c) r0).f100906f == null) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122170a(com.p2082ss.android.ugc.aweme.draft.model.C43223c r10) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78279e.mo122170a(com.ss.android.ugc.aweme.draft.model.c):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.e$c */
    static final class DialogInterface$OnClickListenerC78283c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78279e f175840a;

        /* renamed from: b */
        final /* synthetic */ C43223c f175841b;

        static {
            Covode.recordClassIndex(91400);
        }

        DialogInterface$OnClickListenerC78283c(C78279e eVar, C43223c cVar) {
            this.f175840a = eVar;
            this.f175841b = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C78279e.m136762b(this.f175841b);
            this.f175840a.mo122170a(this.f175841b);
            C78397c.m136927a().notifyDraftDelete(this.f175841b);
        }
    }

    public C78279e(Map<ImageView, C24117a<AbstractC24454c>> map, FTCAwemeDraftViewHolder.AbstractC78263a aVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(aVar, "");
        this.f175835r = map;
        this.f175836s = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder.AbstractC78263a
    /* renamed from: a */
    public final void mo122156a(int i, C43223c cVar) {
        C89219l.m154721d(cVar, "");
        Iterator it = this.f189754f.iterator();
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C43223c cVar2 = (C43223c) it.next();
            C89219l.m154716b(cVar2, "");
            if (cVar2.f100924x == 0) {
                i3++;
                if (cVar2 == cVar) {
                    i2 = i3;
                    break;
                }
            }
        }
        cVar.f100912l = i2;
        this.f175836s.mo122156a(i, cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.e$d */
    static final class DialogInterface$OnClickListenerC78284d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78279e f175842a;

        /* renamed from: b */
        final /* synthetic */ View f175843b;

        /* renamed from: c */
        final /* synthetic */ C43223c f175844c;

        static {
            Covode.recordClassIndex(91401);
        }

        DialogInterface$OnClickListenerC78284d(C78279e eVar, View view, C43223c cVar) {
            this.f175842a = eVar;
            this.f175843b = view;
            this.f175844c = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            C78279e eVar = this.f175842a;
            Context context = this.f175843b.getContext();
            C43223c cVar = this.f175844c;
            if (context == null) {
                C89219l.m154715b();
            }
            C17197a.C17200a aVar = new C17197a.C17200a(context);
            aVar.f41071b = context.getResources().getQuantityString(R.plurals.b3, 1);
            aVar.mo27195b(R.string.bc3, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.bc2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC78283c(eVar, cVar), false).mo27193a().mo27184b();
            dialogInterface.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.FTCAwemeDraftViewHolder.AbstractC78263a
    /* renamed from: a */
    public final void mo122157a(View view, C43223c cVar) {
        C89219l.m154721d(cVar, "");
        if (view == null) {
            C89219l.m154715b();
        }
        C78402a aVar = new C78402a(view.getContext());
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        aVar.mo122330a(new String[]{context.getResources().getString(R.string.y8)}, new DialogInterface$OnClickListenerC78284d(this, view, cVar));
        aVar.f176147a.mo458b();
        this.f175836s.mo122157a(view, cVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo112427a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i == 1) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a__, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C78285f(false, a);
        } else if (i == 2) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_9, viewGroup, false);
            C89219l.m154716b(a2, "");
            return new C78270a(a2);
        } else if (i == 3) {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_a, viewGroup, false);
            C89219l.m154716b(a3, "");
            return new C78272c(a3);
        } else if (i != 5) {
            View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_8, viewGroup, false);
            C89219l.m154716b(a4, "");
            return new FTCAwemeDraftViewHolder(a4, this.f175835r, this);
        } else {
            View a5 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a__, viewGroup, false);
            C89219l.m154716b(a5, "");
            return new C78285f(true, a5);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final void mo112428a(RecyclerView.ViewHolder viewHolder, int i) {
        MethodCollector.m26663i(9472);
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof FTCAwemeDraftViewHolder) {
            FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = (FTCAwemeDraftViewHolder) viewHolder;
            fTCAwemeDraftViewHolder.f175801m = this.f175831a;
            fTCAwemeDraftViewHolder.f175802n = this.f175833c;
            C43223c cVar = (C43223c) this.f189754f.get(i);
            if (cVar == null || cVar.f100902b == null) {
                MethodCollector.m26664o(9472);
                return;
            }
            fTCAwemeDraftViewHolder.f175453t = cVar;
            if (fTCAwemeDraftViewHolder.f175801m) {
                FTCDraftItemView fTCDraftItemView = fTCAwemeDraftViewHolder.f175798j;
                if (fTCDraftItemView == null) {
                    C89219l.m154710a("mContainerLl");
                    C89219l.m154715b();
                }
                if (!fTCDraftItemView.f175817c) {
                    fTCDraftItemView.f175817c = true;
                    Scroller scroller = fTCDraftItemView.f175815a;
                    if (scroller == null) {
                        C89219l.m154715b();
                    }
                    scroller.startScroll(0, 0, -fTCDraftItemView.f175816b, 0, 200);
                    if (fTCDraftItemView.f175818d != null) {
                        FTCDraftItemView.AbstractC78269a aVar = fTCDraftItemView.f175818d;
                        if (aVar == null) {
                            C89219l.m154715b();
                        }
                        aVar.mo122159a(fTCDraftItemView.f175816b, fTCDraftItemView.f175817c);
                    }
                }
                ImageView imageView = fTCAwemeDraftViewHolder.f175796h;
                if (imageView == null) {
                    C89219l.m154710a("mDraftPlay");
                    C89219l.m154715b();
                }
                imageView.animate().alpha(0.0f).setDuration(200).start();
            } else {
                FTCDraftItemView fTCDraftItemView2 = fTCAwemeDraftViewHolder.f175798j;
                if (fTCDraftItemView2 == null) {
                    C89219l.m154710a("mContainerLl");
                    C89219l.m154715b();
                }
                if (fTCDraftItemView2.f175817c) {
                    fTCDraftItemView2.f175817c = false;
                    Scroller scroller2 = fTCDraftItemView2.f175815a;
                    if (scroller2 == null) {
                        C89219l.m154715b();
                    }
                    scroller2.startScroll(-fTCDraftItemView2.f175816b, 0, fTCDraftItemView2.f175816b, 0, 200);
                    if (fTCDraftItemView2.f175818d != null) {
                        FTCDraftItemView.AbstractC78269a aVar2 = fTCDraftItemView2.f175818d;
                        if (aVar2 == null) {
                            C89219l.m154715b();
                        }
                        aVar2.mo122159a(fTCDraftItemView2.f175816b, fTCDraftItemView2.f175817c);
                    }
                }
                ImageView imageView2 = fTCAwemeDraftViewHolder.f175796h;
                if (imageView2 == null) {
                    C89219l.m154710a("mDraftPlay");
                    C89219l.m154715b();
                }
                imageView2.animate().alpha(1.0f).setDuration(200).start();
                Object obj = fTCAwemeDraftViewHolder.f175453t;
                if (obj == null) {
                    C89219l.m154715b();
                }
                ((C43223c) obj).f100925y = false;
            }
            if (fTCAwemeDraftViewHolder.f175802n) {
                TextView textView = fTCAwemeDraftViewHolder.f175791c;
                if (textView == null) {
                    C89219l.m154710a("mDraftSize");
                    C89219l.m154715b();
                }
                textView.setText(C78247b.m136734a(fTCAwemeDraftViewHolder.f175804p, cVar));
            }
            AppCompatCheckBox appCompatCheckBox = fTCAwemeDraftViewHolder.f175797i;
            if (appCompatCheckBox == null) {
                C89219l.m154710a("mCheckBox");
                C89219l.m154715b();
            }
            appCompatCheckBox.setOnCheckedChangeListener(null);
            AppCompatCheckBox appCompatCheckBox2 = fTCAwemeDraftViewHolder.f175797i;
            if (appCompatCheckBox2 == null) {
                C89219l.m154710a("mCheckBox");
                C89219l.m154715b();
            }
            Object obj2 = fTCAwemeDraftViewHolder.f175453t;
            if (obj2 == null) {
                C89219l.m154715b();
            }
            appCompatCheckBox2.setChecked(((C43223c) obj2).f100925y);
            AppCompatCheckBox appCompatCheckBox3 = fTCAwemeDraftViewHolder.f175797i;
            if (appCompatCheckBox3 == null) {
                C89219l.m154710a("mCheckBox");
                C89219l.m154715b();
            }
            appCompatCheckBox3.setOnCheckedChangeListener(new FTCAwemeDraftViewHolder.C78264b(fTCAwemeDraftViewHolder));
            SimpleDraweeView simpleDraweeView = fTCAwemeDraftViewHolder.f175794f;
            if (simpleDraweeView == null) {
                C89219l.m154710a("mCover");
                C89219l.m154715b();
            }
            simpleDraweeView.setTag(cVar.mo73726r());
            SimpleDraweeView simpleDraweeView2 = fTCAwemeDraftViewHolder.f175794f;
            if (simpleDraweeView2 == null) {
                C89219l.m154710a("mCover");
                C89219l.m154715b();
            }
            simpleDraweeView2.setImageResource(2131232418);
            Object obj3 = fTCAwemeDraftViewHolder.f175453t;
            if (obj3 == null) {
                C89219l.m154715b();
            }
            C43225d.m86328a((C43223c) obj3, new FTCAwemeDraftViewHolder.C78265c(fTCAwemeDraftViewHolder, cVar));
            if (!C63244g.m114602a().mo73255A().mo93901a()) {
                ExpandableMentionTextView expandableMentionTextView = fTCAwemeDraftViewHolder.f175789a;
                if (expandableMentionTextView == null) {
                    C89219l.m154710a("mAwemeTitle");
                    C89219l.m154715b();
                }
                expandableMentionTextView.setSpanColor(C0643b.m2378c(fTCAwemeDraftViewHolder.f175804p, R.color.b9));
            } else {
                ExpandableMentionTextView expandableMentionTextView2 = fTCAwemeDraftViewHolder.f175789a;
                if (expandableMentionTextView2 == null) {
                    C89219l.m154710a("mAwemeTitle");
                    C89219l.m154715b();
                }
                expandableMentionTextView2.setSpanColor(C0643b.m2378c(fTCAwemeDraftViewHolder.f175804p, R.color.bx));
            }
            C43221a aVar3 = cVar.f100902b;
            C89219l.m154716b(aVar3, "");
            String str = aVar3.f100735a;
            if (C13627m.m24498a(str)) {
                ExpandableMentionTextView expandableMentionTextView3 = fTCAwemeDraftViewHolder.f175789a;
                if (expandableMentionTextView3 == null) {
                    C89219l.m154710a("mAwemeTitle");
                    C89219l.m154715b();
                }
                expandableMentionTextView3.setText(fTCAwemeDraftViewHolder.f175804p.getText(R.string.bco));
                ExpandableMentionTextView expandableMentionTextView4 = fTCAwemeDraftViewHolder.f175789a;
                if (expandableMentionTextView4 == null) {
                    C89219l.m154710a("mAwemeTitle");
                    C89219l.m154715b();
                }
                expandableMentionTextView4.setTextColor(C0643b.m2378c(fTCAwemeDraftViewHolder.f175804p, R.color.c5));
            } else {
                ExpandableMentionTextView expandableMentionTextView5 = fTCAwemeDraftViewHolder.f175789a;
                if (expandableMentionTextView5 == null) {
                    C89219l.m154710a("mAwemeTitle");
                    C89219l.m154715b();
                }
                expandableMentionTextView5.setText(str);
                C43221a aVar4 = cVar.f100902b;
                C89219l.m154716b(aVar4, "");
                if (aVar4.f100736b != null) {
                    ExpandableMentionTextView expandableMentionTextView6 = fTCAwemeDraftViewHolder.f175789a;
                    if (expandableMentionTextView6 == null) {
                        C89219l.m154710a("mAwemeTitle");
                        C89219l.m154715b();
                    }
                    C43221a aVar5 = cVar.f100902b;
                    C89219l.m154716b(aVar5, "");
                    expandableMentionTextView6.mo122335a((List<TextExtraStruct>) C69805f.m123335a(aVar5.f100736b), false);
                    C43221a aVar6 = cVar.f100902b;
                    C89219l.m154716b(aVar6, "");
                    for (AVTextExtraStruct aVTextExtraStruct : aVar6.f100736b) {
                        C89219l.m154716b(aVTextExtraStruct, "");
                        if (aVTextExtraStruct.getType() == 0) {
                            if (aVTextExtraStruct.getSubType() == 1) {
                                ExpandableMentionTextView expandableMentionTextView7 = fTCAwemeDraftViewHolder.f175789a;
                                if (expandableMentionTextView7 == null) {
                                    C89219l.m154710a("mAwemeTitle");
                                    C89219l.m154715b();
                                }
                                Context context = expandableMentionTextView7.getContext();
                                C89219l.m154716b(context, "");
                                ExpandableMentionTextView expandableMentionTextView8 = fTCAwemeDraftViewHolder.f175789a;
                                if (expandableMentionTextView8 == null) {
                                    C89219l.m154710a("mAwemeTitle");
                                    C89219l.m154715b();
                                }
                                C69753a aVar7 = new C69753a(context, expandableMentionTextView8);
                                ExpandableMentionTextView expandableMentionTextView9 = fTCAwemeDraftViewHolder.f175789a;
                                if (expandableMentionTextView9 == null) {
                                    C89219l.m154710a("mAwemeTitle");
                                    C89219l.m154715b();
                                }
                                expandableMentionTextView9.mo122334a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), aVar7);
                            }
                            if (aVTextExtraStruct.getSubType() == 2) {
                                ExpandableMentionTextView expandableMentionTextView10 = fTCAwemeDraftViewHolder.f175789a;
                                if (expandableMentionTextView10 == null) {
                                    C89219l.m154710a("mAwemeTitle");
                                    C89219l.m154715b();
                                }
                                Context context2 = expandableMentionTextView10.getContext();
                                C89219l.m154716b(context2, "");
                                ExpandableMentionTextView expandableMentionTextView11 = fTCAwemeDraftViewHolder.f175789a;
                                if (expandableMentionTextView11 == null) {
                                    C89219l.m154710a("mAwemeTitle");
                                    C89219l.m154715b();
                                }
                                C69755c cVar2 = new C69755c(context2, expandableMentionTextView11);
                                ExpandableMentionTextView expandableMentionTextView12 = fTCAwemeDraftViewHolder.f175789a;
                                if (expandableMentionTextView12 == null) {
                                    C89219l.m154710a("mAwemeTitle");
                                    C89219l.m154715b();
                                }
                                Context context3 = expandableMentionTextView12.getContext();
                                C89219l.m154716b(context3, "");
                                cVar2.f155895a = BitmapFactory.decodeResource(context3.getResources(), 2131233962);
                                ExpandableMentionTextView expandableMentionTextView13 = fTCAwemeDraftViewHolder.f175789a;
                                if (expandableMentionTextView13 == null) {
                                    C89219l.m154710a("mAwemeTitle");
                                    C89219l.m154715b();
                                }
                                expandableMentionTextView13.mo122334a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), cVar2);
                            }
                        }
                    }
                }
                ExpandableMentionTextView expandableMentionTextView14 = fTCAwemeDraftViewHolder.f175789a;
                if (expandableMentionTextView14 == null) {
                    C89219l.m154710a("mAwemeTitle");
                    C89219l.m154715b();
                }
                expandableMentionTextView14.setTextColor(C0643b.m2378c(fTCAwemeDraftViewHolder.f175804p, R.color.bx));
            }
            C43221a aVar8 = cVar.f100902b;
            C89219l.m154716b(aVar8, "");
            List<AVChallenge> list = aVar8.f100737c;
            StringBuilder sb = new StringBuilder();
            if (list != null && list.size() > 0) {
                Iterator<AVChallenge> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AVChallenge next = it.next();
                    if (next.getChallengeName() == null) {
                        sb = new StringBuilder();
                        break;
                    }
                    sb.append(next.getChallengeName()).append(" ");
                }
            }
            String sb2 = sb.toString();
            C89219l.m154716b(sb2, "");
            if (C13627m.m24498a(sb2)) {
                TextView textView2 = fTCAwemeDraftViewHolder.f175792d;
                if (textView2 == null) {
                    C89219l.m154710a("mAwemeChallenge");
                }
                textView2.setText(R.string.bc0);
                ImageView imageView3 = fTCAwemeDraftViewHolder.f175793e;
                if (imageView3 == null) {
                    C89219l.m154710a("mChallengeIcon");
                }
                imageView3.setImageResource(2131232257);
                TextView textView3 = fTCAwemeDraftViewHolder.f175792d;
                if (textView3 == null) {
                    C89219l.m154710a("mAwemeChallenge");
                }
                textView3.setTextColor(C0643b.m2378c(fTCAwemeDraftViewHolder.f175804p, R.color.nt));
            } else {
                TextView textView4 = fTCAwemeDraftViewHolder.f175792d;
                if (textView4 == null) {
                    C89219l.m154710a("mAwemeChallenge");
                }
                textView4.setText(sb2);
                TextView textView5 = fTCAwemeDraftViewHolder.f175792d;
                if (textView5 == null) {
                    C89219l.m154710a("mAwemeChallenge");
                }
                textView5.setTextColor(C0643b.m2378c(fTCAwemeDraftViewHolder.f175804p, R.color.rd));
                ImageView imageView4 = fTCAwemeDraftViewHolder.f175793e;
                if (imageView4 == null) {
                    C89219l.m154710a("mChallengeIcon");
                }
                imageView4.setImageResource(2131232255);
            }
            TextView textView6 = fTCAwemeDraftViewHolder.f175792d;
            if (textView6 == null) {
                C89219l.m154710a("mAwemeChallenge");
            }
            textView6.setVisibility(8);
            ImageView imageView5 = fTCAwemeDraftViewHolder.f175793e;
            if (imageView5 == null) {
                C89219l.m154710a("mChallengeIcon");
            }
            imageView5.setVisibility(8);
            Space space = fTCAwemeDraftViewHolder.f175799k;
            if (space == null) {
                C89219l.m154710a("mDraftListSpaceBottom");
            }
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            RelativeLayout relativeLayout = fTCAwemeDraftViewHolder.f175800l;
            if (relativeLayout == null) {
                C89219l.m154710a("mDraftListItemLayout");
                C89219l.m154715b();
            }
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            int b = (int) C13628n.m24520b(fTCAwemeDraftViewHolder.f175804p, 16.0f);
            int b2 = (int) C13628n.m24520b(fTCAwemeDraftViewHolder.f175804p, 96.0f);
            if (!cVar.f100926z) {
                View view = fTCAwemeDraftViewHolder.f175795g;
                if (view == null) {
                    C89219l.m154710a("mContentDivider1");
                }
                view.setVisibility(4);
                layoutParams.height = 0;
                layoutParams2.height = b2 - b;
            } else {
                View view2 = fTCAwemeDraftViewHolder.f175795g;
                if (view2 == null) {
                    C89219l.m154710a("mContentDivider1");
                }
                view2.setVisibility(0);
                layoutParams.height = b;
                layoutParams2.height = b2;
            }
            Space space2 = fTCAwemeDraftViewHolder.f175799k;
            if (space2 == null) {
                C89219l.m154710a("mDraftListSpaceBottom");
            }
            space2.setLayoutParams(layoutParams);
            RelativeLayout relativeLayout2 = fTCAwemeDraftViewHolder.f175800l;
            if (relativeLayout2 == null) {
                C89219l.m154710a("mDraftListItemLayout");
            }
            relativeLayout2.setLayoutParams(layoutParams2);
            MethodCollector.m26664o(9472);
        } else if (viewHolder instanceof C78285f) {
            C78285f fVar = (C78285f) viewHolder;
            fVar.f175848c = this.f175831a;
            C43223c cVar3 = (C43223c) this.f189754f.get(i);
            if (cVar3 == null || cVar3.f100906f == null) {
                MethodCollector.m26664o(9472);
                return;
            }
            fVar.f175453t = cVar3;
            if (fVar.f175850e) {
                TextView textView7 = fVar.f175847b;
                if (textView7 == null) {
                    C89219l.m154710a("mNext");
                }
                textView7.setVisibility(4);
            } else if (fVar.f175848c) {
                TextView textView8 = fVar.f175847b;
                if (textView8 == null) {
                    C89219l.m154710a("mNext");
                }
                textView8.setVisibility(4);
            } else {
                TextView textView9 = fVar.f175847b;
                if (textView9 == null) {
                    C89219l.m154710a("mNext");
                }
                textView9.setVisibility(0);
            }
            TextView textView10 = fVar.f175846a;
            if (textView10 == null) {
                C89219l.m154710a("mMusicName");
            }
            C69905c cVar4 = cVar3.f100906f;
            C89219l.m154716b(cVar4, "");
            textView10.setText(cVar4.getName());
            TextView textView11 = fVar.f175847b;
            if (textView11 == null) {
                C89219l.m154710a("mNext");
            }
            textView11.setOnClickListener(new C78285f.View$OnClickListenerC78287b(fVar, cVar3));
            MethodCollector.m26664o(9472);
        } else {
            if (viewHolder instanceof C78272c) {
                C78272c cVar5 = (C78272c) viewHolder;
                Object obj4 = this.f189754f.get(i);
                C89219l.m154716b(obj4, "");
                int i2 = ((C43223c) obj4).f100879B;
                if (cVar5.f175823a == null || i2 < 0) {
                    MethodCollector.m26664o(9472);
                    return;
                }
                cVar5.f175823a.setText(i2);
            }
            MethodCollector.m26664o(9472);
        }
    }
}

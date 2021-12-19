package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.experiment.C46916ew;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.setting.C68062ck;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73986be;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c */
public abstract class AbstractC72425c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: g */
    public static final C72426a f162348g = new C72426a((byte) 0);

    /* renamed from: b */
    public final ArrayList<MvImageChooseAdapter.MyMediaModel> f162349b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<CutSameVideoImageExtraData> f162350c = new ArrayList<>();

    /* renamed from: d */
    int f162351d = -1;

    /* renamed from: e */
    public int f162352e = -1;

    /* renamed from: f */
    public AbstractC72431e f162353f;

    static {
        Covode.recordClassIndex(85099);
    }

    /* renamed from: a */
    public abstract int mo114494a();

    /* renamed from: a */
    public abstract void mo114495a(int i);

    /* renamed from: a */
    public abstract void mo114498a(ArrayList<CutSameVideoImageExtraData> arrayList);

    /* renamed from: b */
    public abstract CutSameVideoImageExtraData mo114499b();

    /* renamed from: b */
    public void mo114689b(int i) {
    }

    /* renamed from: c */
    public Integer mo114690c(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        C89219l.m154721d(myMediaModel, "");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m127744a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c$a */
    public static final class C72426a {
        static {
            Covode.recordClassIndex(85100);
        }

        private C72426a() {
        }

        public /* synthetic */ C72426a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f162349b.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c$b */
    public class C72427b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f162354a;

        /* renamed from: b */
        public final SimpleDraweeView f162355b = ((SimpleDraweeView) this.itemView.findViewById(R.id.fc8));

        /* renamed from: c */
        public TextView f162356c;

        /* renamed from: d */
        public final View f162357d;

        /* renamed from: e */
        public final View f162358e;

        /* renamed from: f */
        final RelativeLayout f162359f;

        /* renamed from: g */
        final /* synthetic */ AbstractC72425c f162360g;

        /* renamed from: h */
        private final View f162361h;

        /* renamed from: i */
        private final View f162362i;

        /* renamed from: j */
        private final ViewGroup f162363j;

        static {
            Covode.recordClassIndex(85101);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c$b$a */
        public static final class View$OnClickListenerC72428a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C72427b f162364a;

            /* renamed from: b */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f162365b;

            static {
                Covode.recordClassIndex(85102);
            }

            View$OnClickListenerC72428a(C72427b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
                this.f162364a = bVar;
                this.f162365b = myMediaModel;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC72431e eVar = this.f162364a.f162360g.f162353f;
                if (eVar != null) {
                    eVar.mo114400a(this.f162365b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c$b$b */
        public static final class View$OnClickListenerC72429b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C72427b f162366a;

            /* renamed from: b */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f162367b;

            static {
                Covode.recordClassIndex(85103);
            }

            View$OnClickListenerC72429b(C72427b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
                this.f162366a = bVar;
                this.f162367b = myMediaModel;
            }

            public final void onClick(View view) {
                AbstractC72431e eVar;
                ClickAgent.onClick(view);
                if (!AbstractC72425c.m127747d(this.f162367b) && (eVar = this.f162366a.f162360g.f162353f) != null) {
                    eVar.mo114401a(this.f162367b, view);
                }
            }
        }

        /* renamed from: a */
        private void m127758a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            int a = (int) C84912r.m145930a(context, 64.0f);
            View view = this.itemView;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Context context2 = viewGroup.getContext();
            C89219l.m154716b(context2, "");
            layoutParams.width = (int) C84912r.m145930a(context2, 76.0f);
            layoutParams.height = a;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view2.setLayoutParams(layoutParams);
            View view3 = this.itemView;
            Context context3 = viewGroup.getContext();
            C89219l.m154716b(context3, "");
            int a2 = (int) C84912r.m145930a(context3, 6.0f);
            Context context4 = viewGroup.getContext();
            C89219l.m154716b(context4, "");
            int a3 = (int) C84912r.m145930a(context4, 0.0f);
            Context context5 = viewGroup.getContext();
            C89219l.m154716b(context5, "");
            int a4 = (int) C84912r.m145930a(context5, 6.0f);
            Context context6 = viewGroup.getContext();
            C89219l.m154716b(context6, "");
            view3.setPadding(a2, a3, a4, (int) C84912r.m145930a(context6, 0.0f));
            View view4 = this.f162358e;
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.width = a;
            layoutParams3.height = a;
            view4.setLayoutParams(layoutParams3);
            SimpleDraweeView simpleDraweeView = this.f162355b;
            if (simpleDraweeView != null) {
                ViewGroup.LayoutParams layoutParams4 = simpleDraweeView.getLayoutParams();
                Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                layoutParams5.width = a;
                layoutParams5.height = a;
                simpleDraweeView.setLayoutParams(layoutParams5);
            }
            View view5 = this.f162357d;
            ViewGroup.LayoutParams layoutParams6 = view5.getLayoutParams();
            Objects.requireNonNull(layoutParams6, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
            Context context7 = viewGroup.getContext();
            C89219l.m154716b(context7, "");
            layoutParams7.width = (int) C84912r.m145930a(context7, 20.0f);
            Context context8 = viewGroup.getContext();
            C89219l.m154716b(context8, "");
            layoutParams7.height = (int) C84912r.m145930a(context8, 20.0f);
            view5.setLayoutParams(layoutParams7);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72427b(AbstractC72425c cVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ab4, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f162360g = cVar;
            this.f162363j = viewGroup;
            View findViewById = this.itemView.findViewById(R.id.aqd);
            C89219l.m154716b(findViewById, "");
            this.f162356c = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.aj3);
            C89219l.m154716b(findViewById2, "");
            this.f162357d = findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.du6);
            C89219l.m154716b(findViewById3, "");
            this.f162358e = findViewById3;
            RelativeLayout relativeLayout = (RelativeLayout) this.itemView.findViewById(R.id.dnk);
            this.f162359f = relativeLayout;
            View findViewById4 = this.itemView.findViewById(R.id.aj2);
            C89219l.m154716b(findViewById4, "");
            ImageView imageView = (ImageView) findViewById4;
            this.f162354a = imageView;
            View findViewById5 = this.itemView.findViewById(R.id.d5u);
            C89219l.m154716b(findViewById5, "");
            this.f162361h = findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.bbp);
            C89219l.m154716b(findViewById6, "");
            this.f162362i = findViewById6;
            float b = C30745b.m63132b(viewGroup.getContext(), 2.0f);
            Drawable a = C84916a.m145948a(0, 1275068416, new float[]{0.0f, 0.0f, b, b, 0.0f, 0.0f, b, b});
            if (relativeLayout == null) {
                C89219l.m154715b();
            }
            if (C78099c.m136517a(relativeLayout.getContext())) {
                a = C84916a.m145948a(0, 1275068416, new float[]{b, b, 0.0f, 0.0f, b, b, 0.0f, 0.0f});
            }
            imageView.setBackground(a);
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            int i = (int) b;
            findViewById3.setBackground(C84916a.m145947a(context.getResources().getColor(R.color.bh), 0, i, i));
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height = (int) C30745b.m63132b(findViewById2.getContext(), 36.0f);
            layoutParams.width = (int) C30745b.m63132b(findViewById2.getContext(), 36.0f);
            findViewById2.setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        public final void mo114707a(MvImageChooseAdapter.MyMediaModel myMediaModel, C72427b bVar, int i) {
            int i2;
            C89219l.m154721d(bVar, "");
            int i3 = 0;
            if (myMediaModel != null) {
                if (C46916ew.m90217b()) {
                    m127758a(this.f162363j);
                }
                AbstractC72425c.m127745a(bVar, C84896h.m145871d(myMediaModel.f134662b));
                if (myMediaModel.mo96674b()) {
                    this.f162356c.setText(AbstractC72425c.m127746c(C89241a.m154730a((((float) myMediaModel.f134668h) * 1.0f) / 1000.0f)));
                    this.f162356c.setVisibility(0);
                    View view = this.f162362i;
                    if (C68062ck.m120368a()) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                } else {
                    this.f162356c.setVisibility(8);
                    this.f162362i.setVisibility(8);
                }
            }
            this.f162357d.setOnClickListener(new View$OnClickListenerC72428a(this, myMediaModel));
            RelativeLayout relativeLayout = this.f162359f;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new View$OnClickListenerC72429b(this, myMediaModel));
            }
            View view2 = this.f162361h;
            if (this.f162360g.f162352e != i) {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
    }

    /* renamed from: d */
    public static boolean m127747d(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return true;
        }
        if (!TextUtils.isEmpty(myMediaModel.f134662b) || !TextUtils.isEmpty(myMediaModel.f134671k)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo114500b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        C89219l.m154721d(myMediaModel, "");
        notifyItemInserted(getItemCount());
        this.f162349b.add(myMediaModel);
        C84911q.m145928d("VideoImageMixedBaseAdapter addMediaData originIndex " + myMediaModel.f161470u + " selectIndex " + myMediaModel.f161471v);
    }

    /* renamed from: c */
    public static String m127746c(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            String a = C1764a.m5929a(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
            C89219l.m154716b(a, "");
            return a;
        }
        String a2 = C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: a */
    public void mo114497a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            int size = this.f162349b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MvImageChooseAdapter.MyMediaModel myMediaModel2 = this.f162349b.get(i);
                C89219l.m154716b(myMediaModel2, "");
                if (C89219l.m154714a((Object) myMediaModel2.f134662b, (Object) myMediaModel.f134662b)) {
                    notifyItemRemoved(i);
                    break;
                }
                i++;
            }
            this.f162349b.remove(myMediaModel);
            C84911q.m145928d("VideoImageMixedBaseAdapter deleteMediaData originIndex " + myMediaModel.f161470u + " selectIndex " + myMediaModel.f161471v + ' ' + C73986be.m130119a());
        }
    }

    /* renamed from: a */
    public void mo114496a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(viewHolder2, "");
        mo114706a(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        C72427b bVar = (C72427b) viewHolder;
        bVar.mo114707a(this.f162349b.get(i), bVar, i);
    }

    /* renamed from: a */
    public final void mo114706a(int i, int i2) {
        int size = this.f162349b.size() - 1;
        if (i >= 0 && size >= i) {
            int size2 = this.f162349b.size() - 1;
            if (i2 >= 0 && size2 >= i2) {
                notifyItemMoved(i, i2);
                MvImageChooseAdapter.MyMediaModel remove = this.f162349b.remove(i);
                C89219l.m154716b(remove, "");
                this.f162349b.add(i2, remove);
            }
        }
    }

    /* renamed from: a */
    public static void m127745a(C72427b bVar, Uri uri) {
        AbstractC24255a aVar;
        C24246a aVar2;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(uri, "");
        C24639c a = C24639c.m47149a(uri);
        a.f58553d = new C24363d(C71812ep.m126783a(56.0d, C63247i.f143610a), C71812ep.m126783a(56.0d, C63247i.f143610a));
        REQUEST request = (REQUEST) a.mo40483a();
        C24185e b = C24182c.m45843b();
        SimpleDraweeView simpleDraweeView = bVar.f162355b;
        if (simpleDraweeView != null) {
            aVar = simpleDraweeView.getController();
        } else {
            aVar = null;
        }
        b.f57309m = aVar;
        b.f57299c = request;
        AbstractC24195a c = b.mo39827e();
        SimpleDraweeView simpleDraweeView2 = bVar.f162355b;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setController(c);
        }
        Drawable a2 = C84916a.m145947a(0, 135665699, 0, (int) C30745b.m63132b(bVar.f162357d.getContext(), 2.0f));
        SimpleDraweeView simpleDraweeView3 = bVar.f162355b;
        if (simpleDraweeView3 != null && (aVar2 = (C24246a) simpleDraweeView3.getHierarchy()) != null) {
            aVar2.mo39953a(1, a2);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m127744a(AbstractC72425c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        C89219l.m154721d(viewGroup, "");
        C72427b bVar = new C72427b(cVar, viewGroup);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        return bVar;
    }
}

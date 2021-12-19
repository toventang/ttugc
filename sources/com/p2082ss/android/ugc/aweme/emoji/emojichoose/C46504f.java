package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46605i;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46641c;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46646h;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.f */
public final class C46504f {

    /* renamed from: a */
    public View f108388a;

    /* renamed from: b */
    public GridView f108389b;

    /* renamed from: c */
    public int f108390c;

    /* renamed from: d */
    private Context f108391d;

    /* renamed from: e */
    private ViewGroup f108392e;

    /* renamed from: f */
    private C46505a f108393f;

    static {
        Covode.recordClassIndex(55089);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.f$a */
    final class C46505a extends BaseAdapter {

        /* renamed from: a */
        public List<C46447a> f108394a = new ArrayList();

        static {
            Covode.recordClassIndex(55090);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return this.f108394a.size();
        }

        public final Object getItem(int i) {
            return this.f108394a.get(i);
        }

        C46505a() {
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C46506b bVar;
            C46447a aVar = this.f108394a.get(i);
            if (view != null && aVar != null && aVar.equals(view.getTag(R.id.c25))) {
                return view;
            }
            if (view == null) {
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                int i2 = C46504f.this.f108390c;
                int i3 = R.layout.yf;
                if (i2 == 1) {
                    i3 = R.layout.yl;
                } else if (C46504f.this.f108390c == 5) {
                    i3 = i == this.f108394a.size() - 1 ? R.layout.yq : R.layout.yn;
                } else if (C46504f.this.f108390c == 4 && this.f108394a.get(i).f108221a == 2131231989) {
                    i3 = R.layout.yk;
                }
                view = C1764a.m5927a(from, i3, viewGroup, false);
                bVar = new C46506b(view);
                view.setTag(R.id.c24, bVar);
            } else {
                bVar = (C46506b) view.getTag(R.id.c24);
            }
            view.setTag(R.id.c25, aVar);
            bVar.mo78980a(aVar);
            return view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.f$b */
    final class C46506b extends C46450d<C46447a> {

        /* renamed from: b */
        private RemoteImageView f108397b;

        /* renamed from: c */
        private TextView f108398c;

        /* renamed from: d */
        private TextView f108399d;

        static {
            Covode.recordClassIndex(55091);
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: b */
        public final void mo78982b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final void mo78979a() {
            this.f108398c = (TextView) this.itemView.findViewById(R.id.auk);
            this.f108397b = (RemoteImageView) this.itemView.findViewById(R.id.aua);
            this.f108399d = (TextView) this.itemView.findViewById(R.id.title_tv);
        }

        /* renamed from: c */
        private void m89757c(C46447a aVar) {
            C46534a aVar2 = aVar.f108224d;
            if (C46459a.m89693d(aVar2)) {
                C46646h.m90043a(this.f108397b, aVar2.getStaticUrl(), null);
            } else {
                C34577e.m70592a(this.f108397b, aVar2.getStaticUrl());
            }
        }

        /* renamed from: f */
        private boolean m89760f(C46447a aVar) {
            if (!aVar.mo78961a()) {
                return false;
            }
            if (C46504f.this.f108390c == 2) {
                return true;
            }
            if (C46504f.this.f108390c == 4 && aVar.f108221a == 2131231989) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private void m89758d(C46447a aVar) {
            File file = new File(C46641c.m90023a(), C46641c.m90027c(aVar.f108224d));
            if (file.exists()) {
                m89753a(file.getAbsolutePath(), C46459a.m89693d(aVar.f108224d));
                return;
            }
            m89757c(aVar);
        }

        /* renamed from: e */
        private void m89759e(C46447a aVar) {
            TextView textView = this.f108399d;
            if (textView != null) {
                textView.setVisibility(0);
                if (m89760f(aVar)) {
                    this.f108399d.setText(C46459a.m89690b(aVar.f108224d));
                } else {
                    this.f108399d.setText("");
                }
            }
        }

        /* renamed from: b */
        private void m89755b(C46447a aVar) {
            TextView textView = this.f108399d;
            if (textView != null) {
                textView.setText("");
            }
            if (this.f108397b == null) {
                return;
            }
            if (!aVar.mo78961a() || aVar.f108224d.getStaticUrl() == null) {
                ((C24246a) this.f108397b.getHierarchy()).mo39953a(5, (Drawable) null);
                ((C24246a) this.f108397b.getHierarchy()).mo39953a(1, (Drawable) null);
                return;
            }
            ((C24246a) this.f108397b.getHierarchy()).mo39970d(R.drawable.a7p);
            ((C24246a) this.f108397b.getHierarchy()).mo39966c(R.drawable.a7p);
        }

        /* renamed from: a */
        public final void mo78980a(C46447a aVar) {
            if (aVar != null) {
                m89755b(aVar);
                Context context = this.itemView.getContext();
                if (!aVar.mo78961a() || !(aVar.f108224d instanceof C46605i)) {
                    if (aVar.mo78961a()) {
                        m89752a(context, aVar);
                    } else if (!TextUtils.isEmpty(aVar.f108223c) || aVar.f108221a > 0 || !TextUtils.isEmpty(aVar.f108222b)) {
                        m89754b(context, aVar);
                    } else {
                        RemoteImageView remoteImageView = this.f108397b;
                        if (remoteImageView != null) {
                            remoteImageView.setVisibility(8);
                        }
                        TextView textView = this.f108399d;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        TextView textView2 = this.f108398c;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                    }
                } else if (aVar.f108221a > 0) {
                    m89754b(context, aVar);
                } else {
                    m89756c(context, aVar);
                }
                m89759e(aVar);
            }
        }

        C46506b(View view) {
            super(view);
        }

        /* renamed from: a */
        private void m89753a(String str, boolean z) {
            String concat = "file://".concat(String.valueOf(str));
            if (z) {
                C46646h.m90044a(this.f108397b, concat);
            } else {
                C34577e.m70608b(this.f108397b, concat, -1, -1);
            }
        }

        /* renamed from: a */
        private void m89751a(Context context, int i) {
            C34577e.m70608b(this.f108397b, "res://" + context.getPackageName() + "/" + i, -1, -1);
        }

        /* renamed from: b */
        private void m89754b(Context context, C46447a aVar) {
            RemoteImageView remoteImageView = this.f108397b;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(0);
                C46579b.m89900a(this.f108397b, aVar);
                this.f108397b.setContentDescription(context.getString(R.string.bm0, aVar.f108223c));
            }
        }

        /* renamed from: c */
        private void m89756c(Context context, C46447a aVar) {
            TextView textView = this.f108398c;
            if (textView != null) {
                textView.setVisibility(0);
                this.f108398c.setText(((C46605i) aVar.f108224d).getPreviewEmoji());
                this.f108398c.setContentDescription(context.getString(R.string.bm0, aVar.f108223c));
            }
        }

        /* renamed from: a */
        private void m89752a(Context context, C46447a aVar) {
            RemoteImageView remoteImageView = this.f108397b;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(0);
                this.f108397b.setDrawingCacheEnabled(true);
                if (aVar.f108224d.getStickerType() == 2) {
                    if (aVar.f108221a == 2131231980) {
                        m89751a(context, aVar.f108221a);
                    } else {
                        m89758d(aVar);
                    }
                    this.f108397b.setContentDescription(context.getString(R.string.bm3));
                } else if (aVar.f108224d.getStickerType() != 10) {
                    String a = C46641c.m90025a(aVar.f108224d);
                    if (new File(a).exists()) {
                        m89753a(a, C46459a.m89693d(aVar.f108224d));
                    } else {
                        m89757c(aVar);
                    }
                    if (!TextUtils.isEmpty(aVar.f108223c)) {
                        this.f108397b.setContentDescription(context.getString(R.string.bm0, aVar.f108223c));
                    }
                } else if (aVar.f108221a == 2131231989) {
                    m89751a(context, aVar.f108221a);
                    this.f108397b.setContentDescription(context.getString(R.string.bm2));
                } else {
                    m89757c(aVar);
                    this.f108397b.setContentDescription(context.getString(R.string.bm1));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo79009a(List<C46447a> list) {
        C46505a aVar = this.f108393f;
        aVar.f108394a.clear();
        aVar.f108394a.addAll(list);
        this.f108393f.notifyDataSetChanged();
    }

    public C46504f(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f108391d = context;
        this.f108390c = i;
        this.f108392e = viewGroup;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.z0, this.f108392e, false);
        this.f108388a = a;
        GridView gridView = (GridView) a.findViewById(R.id.aud);
        this.f108389b = gridView;
        gridView.setSelector(R.color.c9);
        this.f108389b.setStretchMode(1);
        this.f108389b.setGravity(17);
        Resources resources = this.f108391d.getResources();
        int i2 = this.f108390c;
        if (i2 == 1 || i2 == 5) {
            this.f108389b.setNumColumns(7);
            this.f108389b.setColumnWidth(resources.getDimensionPixelSize(R.dimen.jg));
            this.f108389b.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.jj));
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ji);
            this.f108389b.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            this.f108389b.setNumColumns(4);
            this.f108389b.setColumnWidth(resources.getDimensionPixelSize(R.dimen.ja));
            this.f108389b.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.jd));
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.jc);
            this.f108389b.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        }
        C46505a aVar = new C46505a();
        this.f108393f = aVar;
        this.f108389b.setAdapter((ListAdapter) aVar);
    }
}

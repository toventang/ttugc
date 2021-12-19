package com.zhihu.matisse.internal.p4516ui.p4517a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C87955b;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p4514b.C87949c;
import com.zhihu.matisse.internal.p4516ui.widget.MediaGrid;

/* renamed from: com.zhihu.matisse.internal.ui.a.a */
public final class C87961a extends AbstractC87971d<RecyclerView.ViewHolder> implements MediaGrid.AbstractC87979a {

    /* renamed from: a */
    public AbstractC87964b f199788a;

    /* renamed from: b */
    public AbstractC87966d f199789b;

    /* renamed from: d */
    private final C87949c f199790d;

    /* renamed from: e */
    private final Drawable f199791e;

    /* renamed from: f */
    private C87956c f199792f = C87956c.C87957a.f199768a;

    /* renamed from: g */
    private RecyclerView f199793g;

    /* renamed from: h */
    private int f199794h;

    /* renamed from: com.zhihu.matisse.internal.ui.a.a$b */
    public interface AbstractC87964b {
        static {
            Covode.recordClassIndex(103983);
        }

        /* renamed from: b */
        void mo142500b();
    }

    /* renamed from: com.zhihu.matisse.internal.ui.a.a$d */
    public interface AbstractC87966d {
        static {
            Covode.recordClassIndex(103985);
        }

        /* renamed from: a */
        void mo142501a(Album album, Item item, int i);
    }

    /* renamed from: com.zhihu.matisse.internal.ui.a.a$e */
    public interface AbstractC87967e {
        static {
            Covode.recordClassIndex(103986);
        }

        /* renamed from: d */
        void mo142502d();
    }

    static {
        Covode.recordClassIndex(103980);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m153022a(this, viewGroup, i);
    }

    /* renamed from: a */
    private void m153023a() {
        notifyDataSetChanged();
        AbstractC87964b bVar = this.f199788a;
        if (bVar != null) {
            bVar.mo142500b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.zhihu.matisse.internal.ui.a.a$c */
    public static class C87965c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public MediaGrid f199797a;

        static {
            Covode.recordClassIndex(103984);
        }

        C87965c(View view) {
            super(view);
            this.f199797a = (MediaGrid) view;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.zhihu.matisse.internal.ui.a.a$a */
    public static class C87963a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f199796a;

        static {
            Covode.recordClassIndex(103982);
        }

        C87963a(View view) {
            super(view);
            this.f199796a = (TextView) view.findViewById(R.id.bf2);
        }
    }

    @Override // com.zhihu.matisse.internal.p4516ui.p4517a.AbstractC87971d
    /* renamed from: a */
    public final int mo142495a(Cursor cursor) {
        if (Item.m153004a(cursor).f199736a == -1) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private boolean m153024a(Context context, Item item) {
        C87955b d = this.f199790d.mo142462d(item);
        C87955b.m153008a(context, d);
        if (d == null) {
            return true;
        }
        return false;
    }

    @Override // com.zhihu.matisse.internal.p4516ui.widget.MediaGrid.AbstractC87979a
    /* renamed from: a */
    public final void mo142497a(Item item, RecyclerView.ViewHolder viewHolder) {
        AbstractC87966d dVar = this.f199789b;
        if (dVar != null) {
            dVar.mo142501a(null, item, viewHolder.getAdapterPosition());
        }
    }

    @Override // com.zhihu.matisse.internal.p4516ui.widget.MediaGrid.AbstractC87979a
    /* renamed from: b */
    public final void mo142498b(Item item, RecyclerView.ViewHolder viewHolder) {
        if (this.f199792f.f199752f) {
            if (this.f199790d.mo142465e(item) != Integer.MIN_VALUE) {
                this.f199790d.mo142459b(item);
                m153023a();
            } else if (m153024a(viewHolder.itemView.getContext(), item)) {
                this.f199790d.mo142456a(item);
                m153023a();
            }
        } else if (this.f199790d.mo142461c(item)) {
            this.f199790d.mo142459b(item);
            m153023a();
        } else if (m153024a(viewHolder.itemView.getContext(), item)) {
            this.f199790d.mo142456a(item);
            m153023a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.zhihu.matisse.internal.p4516ui.p4517a.AbstractC87971d
    /* renamed from: a */
    public final void mo142496a(RecyclerView.ViewHolder viewHolder, Cursor cursor) {
        int i;
        Drawable.ConstantState constantState;
        if (viewHolder instanceof C87963a) {
            C87963a aVar = (C87963a) viewHolder;
            Drawable[] compoundDrawables = aVar.f199796a.getCompoundDrawables();
            TypedArray obtainStyledAttributes = viewHolder.itemView.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.md});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            for (int i2 = 0; i2 < compoundDrawables.length; i2++) {
                Drawable drawable = compoundDrawables[i2];
                if (!(drawable == null || (constantState = drawable.getConstantState()) == null)) {
                    Drawable mutate = constantState.newDrawable().mutate();
                    mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                    mutate.setBounds(drawable.getBounds());
                    compoundDrawables[i2] = mutate;
                }
            }
            aVar.f199796a.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        } else if (viewHolder instanceof C87965c) {
            C87965c cVar = (C87965c) viewHolder;
            Item a = Item.m153004a(cursor);
            MediaGrid mediaGrid = cVar.f199797a;
            Context context = cVar.f199797a.getContext();
            if (this.f199794h == 0) {
                int i3 = ((GridLayoutManager) this.f199793g.getLayoutManager()).f4316b;
                int dimensionPixelSize = (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(R.dimen.ol) * (i3 - 1))) / i3;
                this.f199794h = dimensionPixelSize;
                this.f199794h = (int) (((float) dimensionPixelSize) * this.f199792f.f199761o);
            }
            mediaGrid.f199836f = new MediaGrid.C87980b(this.f199794h, this.f199791e, this.f199792f.f199752f, viewHolder);
            MediaGrid mediaGrid2 = cVar.f199797a;
            mediaGrid2.f199835e = a;
            ImageView imageView = mediaGrid2.f199833c;
            if (mediaGrid2.f199835e.mo142475b()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            mediaGrid2.f199832b.setCountable(mediaGrid2.f199836f.f199840c);
            C24639c a2 = C24639c.m47149a(mediaGrid2.f199835e.f199738c);
            a2.f58553d = new C24363d(mediaGrid2.f199836f.f199838a, mediaGrid2.f199836f.f199838a);
            REQUEST request = (REQUEST) a2.mo40483a();
            if (mediaGrid2.f199835e.mo142475b()) {
                C24185e b = C24182c.m45843b();
                b.f57309m = mediaGrid2.f199831a.getController();
                b.f57299c = request;
                b.f57306j = true;
                mediaGrid2.f199831a.setController(b.mo39827e());
            } else {
                mediaGrid2.f199831a.setImageRequest(request);
            }
            if (mediaGrid2.f199835e.mo142476c()) {
                mediaGrid2.f199834d.setVisibility(0);
                mediaGrid2.f199834d.setText(DateUtils.formatElapsedTime(mediaGrid2.f199835e.f199740e / 1000));
            } else {
                mediaGrid2.f199834d.setVisibility(8);
            }
            cVar.f199797a.setOnMediaGridClickListener(this);
            MediaGrid mediaGrid3 = cVar.f199797a;
            if (this.f199792f.f199752f) {
                int e = this.f199790d.mo142465e(a);
                if (e > 0 || !this.f199790d.mo142463d()) {
                    mediaGrid3.setCheckEnabled(true);
                    mediaGrid3.setCheckedNum(e);
                    return;
                }
                mediaGrid3.setCheckEnabled(false);
                mediaGrid3.setCheckedNum(Integer.MIN_VALUE);
            } else if (this.f199790d.mo142461c(a)) {
                mediaGrid3.setCheckEnabled(true);
                mediaGrid3.setChecked(true);
            } else if (this.f199790d.mo142463d()) {
                mediaGrid3.setCheckEnabled(false);
                mediaGrid3.setChecked(false);
            } else {
                mediaGrid3.setCheckEnabled(true);
                mediaGrid3.setChecked(false);
            }
        }
    }

    public C87961a(Context context, C87949c cVar, RecyclerView recyclerView) {
        this.f199790d = cVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.xq});
        this.f199791e = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f199793g = recyclerView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.zhihu.matisse.internal.ui.a.a$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static RecyclerView.ViewHolder m153022a(C87961a aVar, ViewGroup viewGroup, int i) {
        C87965c cVar;
        MethodCollector.m26663i(11335);
        boolean z = true;
        if (i == 1) {
            C87963a aVar2 = new C87963a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.am1, viewGroup, false));
            aVar2.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.zhihu.matisse.internal.p4516ui.p4517a.C87961a.View$OnClickListenerC879621 */

                static {
                    Covode.recordClassIndex(103981);
                }

                public final void onClick(View view) {
                    if (view.getContext() instanceof AbstractC87967e) {
                        ((AbstractC87967e) view.getContext()).mo142502d();
                    }
                }
            });
            cVar = aVar2;
        } else if (i == 2) {
            cVar = new C87965c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ak2, viewGroup, false));
        } else {
            cVar = null;
        }
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = cVar.getClass().getName();
        MethodCollector.m26664o(11335);
        return cVar;
    }
}

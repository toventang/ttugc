package com.zhihu.matisse.internal.p4516ui.p4517a;

import android.database.Cursor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;

/* renamed from: com.zhihu.matisse.internal.ui.a.d */
public abstract class AbstractC87971d<VH extends RecyclerView.ViewHolder> extends RecyclerView.AbstractC1350a<VH> {

    /* renamed from: a */
    private int f199801a;

    /* renamed from: c */
    public Cursor f199802c;

    static {
        Covode.recordClassIndex(103990);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo142495a(Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo142496a(VH vh, Cursor cursor);

    AbstractC87971d() {
        setHasStableIds(true);
        mo142507b(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        if (m153035c(this.f199802c)) {
            return this.f199802c.getCount();
        }
        return 0;
    }

    /* renamed from: c */
    private static boolean m153035c(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo142507b(Cursor cursor) {
        if (cursor != this.f199802c) {
            if (cursor != null) {
                this.f199802c = cursor;
                this.f199801a = cursor.getColumnIndexOrThrow("_id");
                notifyDataSetChanged();
                return;
            }
            notifyItemRangeRemoved(0, getItemCount());
            this.f199802c = null;
            this.f199801a = -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public long getItemId(int i) {
        if (!m153035c(this.f199802c)) {
            throw new IllegalStateException("Cannot lookup item id when cursor is in invalid state.");
        } else if (this.f199802c.moveToPosition(i)) {
            return this.f199802c.getLong(this.f199801a);
        } else {
            throw new IllegalStateException("Could not move cursor to position " + i + " when trying to get an item id");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        if (this.f199802c.moveToPosition(i)) {
            return mo142495a(this.f199802c);
        }
        throw new IllegalStateException("Could not move cursor to position " + i + " when trying to get item view type.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(VH vh, int i) {
        if (!m153035c(this.f199802c)) {
            throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
        } else if (this.f199802c.moveToPosition(i)) {
            mo142496a(vh, this.f199802c);
        } else {
            throw new IllegalStateException("Could not move cursor to position " + i + " when trying to bind view holder");
        }
    }
}

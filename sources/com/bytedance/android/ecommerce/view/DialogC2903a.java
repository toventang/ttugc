package com.bytedance.android.ecommerce.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.ecommerce.view.a */
public final class DialogC2903a extends Dialog {

    /* renamed from: a */
    public AbstractC2906a f8653a;

    /* renamed from: b */
    public String f8654b;

    /* renamed from: c */
    public String f8655c;

    /* renamed from: d */
    public String f8656d;

    /* renamed from: e */
    private TextView f8657e;

    /* renamed from: f */
    private Button f8658f;

    /* renamed from: g */
    private Button f8659g;

    /* renamed from: com.bytedance.android.ecommerce.view.a$a */
    public interface AbstractC2906a {
        static {
            Covode.recordClassIndex(3336);
        }

        /* renamed from: a */
        void mo7483a();

        /* renamed from: b */
        void mo7484b();
    }

    static {
        Covode.recordClassIndex(3333);
    }

    public DialogC2903a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.x9);
        setCanceledOnTouchOutside(false);
        AssetManager assets = getContext().getAssets();
        Typeface createFromAsset = Typeface.createFromAsset(assets, "font/ProximaNova-Bold.otf");
        Typeface createFromAsset2 = Typeface.createFromAsset(assets, "font/ProximaNova-Regular.otf");
        TextView textView = (TextView) findViewById(R.id.bij);
        this.f8657e = textView;
        textView.setText(this.f8654b);
        this.f8657e.setTypeface(createFromAsset2);
        Button button = (Button) findViewById(R.id.bih);
        this.f8658f = button;
        button.setText(this.f8655c);
        this.f8658f.setTypeface(createFromAsset2);
        Button button2 = (Button) findViewById(R.id.bii);
        this.f8659g = button2;
        button2.setText(this.f8656d);
        this.f8659g.setTypeface(createFromAsset);
        this.f8658f.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.ecommerce.view.DialogC2903a.View$OnClickListenerC29041 */

            static {
                Covode.recordClassIndex(3334);
            }

            public final void onClick(View view) {
                DialogC2903a.this.f8653a.mo7483a();
                DialogC2903a.this.dismiss();
            }
        });
        this.f8659g.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.ecommerce.view.DialogC2903a.View$OnClickListenerC29052 */

            static {
                Covode.recordClassIndex(3335);
            }

            public final void onClick(View view) {
                DialogC2903a.this.f8653a.mo7484b();
                DialogC2903a.this.dismiss();
            }
        });
    }
}

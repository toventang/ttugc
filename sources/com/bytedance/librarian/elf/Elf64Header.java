package com.bytedance.librarian.elf;

import com.bytedance.librarian.elf.Elf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Elf64Header extends Elf.Header {

    /* renamed from: j */
    private final ElfParser f48934j;

    @Override // com.bytedance.librarian.elf.Elf.Header
    /* renamed from: a */
    public final Elf.SectionHeader mo34119a() {
        return new Section64Header(this.f48934j, this);
    }

    @Override // com.bytedance.librarian.elf.Elf.Header
    /* renamed from: a */
    public final Elf.ProgramHeader mo34118a(long j) {
        return new Program64Header(this.f48934j, this, j);
    }

    @Override // com.bytedance.librarian.elf.Elf.Header
    /* renamed from: a */
    public final Elf.DynamicStructure mo34117a(long j, int i) {
        return new Dynamic64Structure(this.f48934j, this, j, i);
    }

    public Elf64Header(boolean z, ElfParser elfParser) {
        ByteOrder byteOrder;
        this.f48919a = z;
        this.f48934j = elfParser;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f48920b = elfParser.mo34123c(allocate, 16);
        this.f48921c = elfParser.mo34120a(allocate, 32);
        this.f48922d = elfParser.mo34120a(allocate, 40);
        this.f48923e = elfParser.mo34123c(allocate, 54);
        this.f48924f = elfParser.mo34123c(allocate, 56);
        this.f48925g = elfParser.mo34123c(allocate, 58);
        this.f48926h = elfParser.mo34123c(allocate, 60);
        this.f48927i = elfParser.mo34123c(allocate, 62);
    }
}

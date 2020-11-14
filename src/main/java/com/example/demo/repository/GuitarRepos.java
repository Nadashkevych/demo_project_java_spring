package com.example.demo.repository;

import com.example.demo.model.Guitar;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GuitarRepos {

    private Map<String, Guitar> database;

    public GuitarRepos() {
        database = new HashMap<String, Guitar>();
        Guitar guitar1 = new Guitar("Stratocaster", "Fender", "Eric Clapton, Jimmy Hendrix", "The Fender Stratocaster, colloquially known as the Strat, is a model of electric guitar designed from 1952 into 1954 by Leo Fender, Bill Carson, George Fullerton and Freddie Tavares. The Fender Musical Instruments Corporation has continuously manufactured the Stratocaster from 1954 to the present. It is a double-cutaway guitar, with an extended top \"horn\" shape for balance. Along with the Gibson Les Paul and Fender Telecaster, it is one of the most-often emulated electric guitar shapes. \"Stratocaster\" and \"Strat\" are trademark terms belonging to Fender. Guitars that duplicate the Stratocaster by other manufacturers are sometimes called S-Type or ST-type guitars.", "https://upload.wikimedia.org/wikipedia/commons/6/63/Fender_Stratocaster_004-2.jpg");
        Guitar guitar2 = new Guitar("Telecaster", "Fender", "Keith Richards", "The Fender Telecaster, colloquially known as the Tele, is the world's first commercially successful[note 1] solid-body electric guitar. Its simple yet effective design and revolutionary sound broke ground and set trends in electric guitar manufacturing and popular music. Introduced for national distribution as the Broadcaster in the autumn of 1950 as a two-pickup version of its sister model, the single-pickup Esquire, the pair were the first guitars of their kind manufactured on a substantial scale. A trademark conflict with a rival manufacturer's (Gretsch Broadkaster) led to the guitar being renamed in 1951. Initially, the Broadcaster name was simply cut off of the labels placed on the guitars (leading to a limited run of nameless guitars known as \"No-casters\") and later in 1951, the final name of Telecaster was applied to the guitar. The Telecaster quickly became a popular model, and has remained in continuous production since its first incarnation.", "https://megamusic.blob.core.windows.net/images/0038939_fender-vintera-50s-telecaster-modified-electric-guitar-mn-butterscotch-blonde.jpg");
        Guitar guitar3 = new Guitar("Les Paul", "Gibson", "Les Paul, Slash, Zakk Wylde", "The Les Paul was originally offered with a gold finish and two P-90 pickups. In 1957, humbucking pickups were added, along with sunburst finishes in 1958. The sunburst 1958–1960 Les Paul – today one of the best-known electric guitar types in the world – was considered a commercial failure, with low production and sales. For 1961, the Les Paul was redesigned into what is now known as the Gibson SG. The original single-cutaway, carved top bodystyle was re-introduced in 1968. The Les Paul has been produced in many versions and editions since. Along with Fender's Telecaster and Stratocaster, it was one of the first mass-produced electric solid-body guitars. Due to their versatility, Les Paul electric guitars have been used in a wide range of music genres, including rock, country, pop, soul, rhythm and blues, blues, jazz, reggae, punk, and heavy metal.", "https://image.ceneostatic.pl/data/products/17832048/i-epiphone-les-paul-standard-eb.jpg");
        Guitar guitar4 = new Guitar("Flying V", "Gibson", "Jimmy Hendrix, James Hetfield, Wolf Hoffman, Jeff Waters", "The Gibson Flying V is an electric guitar model introduced by Gibson in 1958. The Flying V offered a radical, \"futuristic\" body design, much like its siblings: the Explorer, which was released the same year and the Moderne, which was designed in 1957 but not released until 1982. The initial run of guitars used a distinctive wood of the Limba tree marketed by Gibson under the trade name \"korina\"; later models used more conventional woods.\n" +
                "\n" +
                "Perhaps too radical for its time, the initial run of Flying V guitars was not successful, and fewer than 100 were manufactured and sold. Some players, such as blues guitarist Albert King, and rock guitarist Dave Davies gravitated towards the unique design and helped popularize the model years after it had left production. After the renewed popularity led to increased demand, Gibson manufactured a small number of Flying V guitars in 1963 from leftover parts from the original run, and the guitar re-entered regular production in 1967 and has been reissued numerous times since then. A number of variant models, including the completely redesigned Flying V2 from 1979-1982, and an unusual Reverse Flying V from 2007-2008, have been released as well.", "https://www.muztorg.ru/files/cv8/67h/ofd/fs4/0gw/cgc/88g/4k0/w/cv867hofdfs40gwcgc88g4k0w.jpg");
        Guitar guitar5 = new Guitar("KH OUIJA", "ESP LTD", "Metallica's Kirk Hammet signature guitar", "https://i.pinimg.com/originals/41/8e/f3/418ef3ec2565b6ab48707b1d239f74ad.jpg");
        Guitar guitar6 = new Guitar("SG", "Gibson", "Angus Young, Tony Iommy", "The SG generally has a solid mahogany body, with a black pickguard. The 24.75\" scale mahogany neck joins the body at the 19th or 22nd fret. Early models had a smaller neck joint with a longer tenon. This neck design provided access above the 16th fret. Epiphone-made bolt-on neck models still use a 16th fret neck joint. The SG's set neck is shallower than the Gibson Les Paul's. The SG features the traditional Gibson combination of two or three humbucker pickups or P90 pickups and a Tune-o-matic bridge assembly, wraparound bridge, or vibrato tailpiece, depending on the model.", "https://www.rnr.pl/img/products/48/82/1_max.jpg");
        Guitar guitar7 = new Guitar("Warlock", "BC Rich", "Kerry King, Chris Poland, Lita Ford", "The B.C. Rich Warlock is both an electric guitar and bass guitar made by B.C. Rich. It features a distinct jagged shape and two humbucker pickups. It was designed by company founder Bernie Rico in 1969: “This was the only guitar I ever designed at a drafting table, using straight-edges and French curves. It was lots of curves going into straight lines. At first I thought it was the ugliest guitar I’d ever designed.\" The design wasn't built until local guitarist Spencer Sercombe of Shark Island, prompted Bernie to do so but once it was it soon found favor in the emerging heavy metal scene. \"The introduction of the Warlock in 1981 marked the beginning of B.C. Rich’s rise to iconic status in heavy metal. [...] The confluence of B.C. Rich’s far-out designs and the emerging hair metal culture of the late '70s and early '80s helped cement the brand’s place in the market\". Slayer's Kerry King signature guitar", "https://images.reverb.com/image/upload/s--EgvIb0tY--/a_exif,c_limit,e_unsharp_mask:80,f_auto,fl_progressive,g_south,h_1600,q_80,w_1600/v1490739597/qdh3mhrlhyzpglci8lkm.jpg");
        Guitar guitar8 = new Guitar("Jem-jr", "Ibanez", "Steve Vai", "The JEM-JR, also known as the JEM333, is a solid body electric guitar introduced by Ibanez in 2002. It is a signature model of American guitarist Steve Vai and part of Vai's JEM series. It was the most affordable JEM model.\n" +
                "\n" +
                "In terms of specifications, it is more similar to the RG350DX than the JEM7V from which it takes it's aesthetic cues. It has a basswood body with a monkey grip handle and lion's claw tremolo rout bolted to a maple Wizard II neck with a 24-fret rosewood fingerboard with dot position markers. Components include a double locking tremolo bridge and Ibanez Infinity pickups mounted in a pickguard with a pair of humbuckers flanking a single-coil.\n" +
                "\n" +
                "The JEM-JR was discontinued after 2012, but a similarly named model, the JEMJR, was brought out in 2015.", "https://m.media-amazon.com/images/I/71KCtyHEWxL._AC_SS350_.jpg");

        database.put(guitar1.getModelName(), guitar1);
        database.put(guitar2.getModelName(), guitar2);
        database.put(guitar3.getModelName(), guitar3);
        database.put(guitar4.getModelName(), guitar4);
        database.put(guitar5.getModelName(), guitar5);
        database.put(guitar6.getModelName(), guitar6);
        database.put(guitar7.getModelName(), guitar7);
        database.put(guitar8.getModelName(), guitar8);
    }

    public List<Guitar> findAll() {
        Collection<Guitar> values = this.database.values();
        return new ArrayList<>(values);
    }

    public Guitar findByName(String name) {
        return database.get(name);
    }

    public void add(Guitar guitar) {
        this.database.put(guitar.getModelName(), guitar);
    }
}

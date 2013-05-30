package india.history;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import static india.history.Constants.*;

public class DatabaseHelper extends SQLiteOpenHelper {

public static final String DATABASE_NAME = "TheFinalBuild2";
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, 2);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		
		String sql = "CREATE TABLE IF NOT EXISTS history (" +
		"_id INTEGER PRIMARY KEY AUTOINCREMENT, " + 
		"day TEXT, " +
		"month TEXT, " +
		"year TEXT, " +
		"event TEXT, " +
		"description TEXT)";
		db.execSQL(sql);

		ContentValues values = new ContentValues();
		
		

		
		values.put(DAY," ");
		values.put(MONTH," ");
		values.put(YEAR, "10000 BC");
		values.put(EVENT, "Composition Of The Rig veda");
		values.put(DESCRIPTION, "The Rig Veda is one of the oldest written works known to man. The most probable date for the composition of this work was around this year. This is the precise date as recorded by Indian historians.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH,"");
		values.put(YEAR, "8000 BC");
		values.put(EVENT, "Oldest Known Sculpture Found");
		values.put(DESCRIPTION, "A temple of this page was found in Anatolia near Nevali Cori with the stone head of a vedic priest, also regarded as one of the oldest known sculptures found.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "7000 BC");
		values.put(EVENT, "Pre-Harrappan Civilization");
		values.put(DESCRIPTION, "Archeological evidence supporting the fact that there existed an advanced civilization before Harrappan times has recently been unearthed.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "7000 BC");
		values.put(EVENT, "Approximate Date Of Mehrgarh Archeological Site");
		values.put(DESCRIPTION, "Mehrgarh, one of the most important Neolithic sites in archaeology, lies on the 'Kachi plain' of Balochistan, Pakistan. It is one of the earliest sites with evidence of farming (wheat and barley) and herding (cattle, sheep and goats) in South Asia. The earliest settlement at Mehrgarhâ€”in the northeast corner of the 495-acre siteâ€”was a small farming village dated between 7000 BCE to 5500 BCE and the whole area covers a number of successive settlements. Archaeological material has been found in six mounds, and about 32,000 artifacts have been collected.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "6000 BC");
		values.put(EVENT, "Indus valley Civilization");
		values.put(DESCRIPTION, "The Indus valley civilization was one of the most advanced pre-historic civilizations known to man. Evidence has been found suggesting that 6000 BC might be a possible start date for this civilization.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "4000 BC");
		values.put(EVENT, "Ancient Copper Heads");
		values.put(DESCRIPTION, "Perfectly preserved copper heads have been found recently in archeological excavations around Delhi. These copper heads have been dated at around 4000 BC.");
		db.insert("history",null,values);
		
		values.put(DAY, "");
		values.put(MONTH,"");
		values.put(YEAR, "3000 BC");
		values.put(EVENT, "Earliest Evidence Of Harrapan Civilization");
		values.put(DESCRIPTION, "The Harrappan civilization was the most advanced bronze age civilization in the history of mankind. They were the first to have an elaborate sewage system. The evidence of this marvel has been unearthed by archeologists near modern day Pakistan.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1400 BC");
		values.put(EVENT, "Hittite-Mittani Treaty");
		values.put(DESCRIPTION, "The Hittite and Mittani were two prominent tribes of Ancient India. An inscription unearthed recently describes a peace treaty between these two tribes. According to the inscription, the treaty was witnessed by The Gods, Indra, Varuna, Mitra and Naasatya as witnesses.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1100 BC");
		values.put(EVENT, "The Rig Veda Composed(Western Account)");
		values.put(DESCRIPTION, "The Rigveda is an ancient Indian sacred collection of Vedic Sanskrit hymns. It is counted among the four canonical sacred text of Hinduism known as the Vedas. It is one of the oldest extant texts in any Indo-European language. Philological and linguistic evidence indicate that the Rigveda was composed in the north-western region of the Indian subcontinent, roughly between 1700â€“1100 BC. This date is one given by western historians(as seen on Wikipedia). The precise date, according to Indian historians varies by approximately 9000 years.");
		db.insert("history",null,values);
		
		values.put(DAY,"");
		values.put(MONTH,"");
		values.put(YEAR, "800 BC");
		values.put(EVENT, "Ancient history of South India(Approximate Dates)");
		values.put(DESCRIPTION, "Evidence in the forms of documents and inscriptions do not appear often in the history of ancient South India. Although there are signs that the history dates back to several centuries BCE, we only have any authentic archeological evidence from the early centuries of the common era. The Kingdom of Pratipalapura (5th century BCE), identified with Bhattiprolu, in Guntur district of Andhra Pradesh appears to be the earliest known kingdom in South India. We also have an inscriptional evidence to show that king Kubera was ruling over Bhattiprolu around 230 BC followed by Sala Kings. The script of Bhattiprolu inscriptions was the progentor of Brahmi Lipi that diversified later into modern Telugu and Tamil scripts.");
		db.insert("history",null,values);
		
		
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "599 BC");
		values.put(EVENT, "Birth Of Mahavira");
		values.put(DESCRIPTION, "Mahavira is the name most commonly used to refer to the Indian sage Vardhamana who established what are today considered to be the central tenets of Jainism. According to Jain tradition, he was the 24th and the last Tirthankara.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "563 BC");
		values.put(EVENT, "Birth Of Gautama Buddha");
		values.put(DESCRIPTION, "Siddhartha Gautama was a spiritual teacher on the Indian subcontinent, on whose teachings Buddhism was Founded. In most Buddhist traditions, he is regarded as the Supreme Buddha of our age, Buddha meaning The Awakened One or The Enlightened One. By tradition, Gautama is said to have been born in the small state of Kapilavastu, in what is now Nepal, and later to have taught primarily throughout regions of eastern India such as Magadha and Koyala.");
		db.insert("history",null,values);
		


		values.put(DAY,"");
		values.put(MONTH,"");
		values.put(YEAR, "550 BC");
		values.put(EVENT, "Pandyan Empire Established");
		values.put(DESCRIPTION, "The Pandyas were one of the three ancient Tamil dynasties (Chola and Chera being the other two) who ruled the Tamil country from pre-historic times until end of the 15th century. They ruled initially from Korkai, a sea port on the southern most tip of the Indian peninsula, and in later times moved to Madurai. Pandyas are mentioned in Sangam Literature (c. 100 â€“ 200 CE) as well as by Greek and Roman sources during this period.");
		db.insert("history",null,values);
		
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "400 BC");
		values.put(EVENT, "Megasthanes Visits India");
		values.put(DESCRIPTION, "Megasthanes, a Greek traveller visited India during this time period. According to his accounts, there were 153 monarchs of the Ishwaaku dynasty who were ruling over the Indian subcontinent for more than 6000 years.");
		db.insert("history",null,values);	
		
		values.put(DAY,"");
		values.put(MONTH,"");
		values.put(YEAR, "326 BC");
		values.put(EVENT, "King Porus: Battle Of Hydaspes River");
		values.put(DESCRIPTION, "King Porus , an ancient Hindu ruler of Puru (near Punjab) fought against Alexander the Great in the famous Battle of the Hydaspes river. He is widely regarded as the first major opponent in Alexander's worldwide conquest.");
		db.insert("history",null,values);



		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "322 BC");
		values.put(EVENT, "The Mauryan Empire Established");
		values.put(DESCRIPTION, "The Mauryan Empire was founded in 322 BC by Chandragupta Maurya, who had overthrown the Nanda Dynasty and rapidly expanded his power westwards across central and western India. With an area of 5,000,000 sq km, it was one of the world's largest empires in its time, and the largest ever in the Indian subcontinent. At its greatest extent, the empire stretched to the north along the natural boundaries of the Himalayas, and to the east stretching into what is now Assam. To the west, it conquered beyond modern Pakistan, annexing Balochistan, south eastern parts of Iran and much of what is now Afghanistan, including the modern Herat and Kandahar provinces.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "321 BC");
		values.put(EVENT, "Reign Of Chandragupt Maurya Begins");
		values.put(DESCRIPTION, "Chandragupt Maurya, was the founder of the Mauryan Empire. Chandragupt is considered the first unifier of India and its first genuine emperor. His achievements, which ranged from conquering Macedonian satrapies in the northwest, to establishing centralized rule throughout South Asia, remain some of the most celebrated in the history of India. Over two thousand years later, the accomplishments of Chandragupt stand out in the history of South Asia.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "300 BC");
		values.put(EVENT, "Panini Formulates The Sanskrit Grammar");
		values.put(DESCRIPTION, "Panini was an Ancient Indian Sanskrit grammarian from Pushkalavati, Gandhara. Panini is known for his Sanskrit grammar, particularly for his formulation of the 3,959 rules of Sanskrit morphology, syntax and semantics in the grammar known as Ashtadhyayi , the foundational text of the grammatical branch of Sanskrit");
		db.insert("history",null,values);
		

		values.put(DAY,"");
		values.put(MONTH,"");
		values.put(YEAR, "300 BC");
		values.put(EVENT, "Chera Empire Established");
		values.put(DESCRIPTION, "The Chera kingdom were one of the Tamil dynasties who ruled the southern India from ancient times until around the twelfth century CE. The Early Cheras ruled over the Malabar Coast, Coimbatore, Erode, Namakkal, Karur and Salem Districts in South India, which now forms part of the modern day Indian states of Kerala and Tamil Nadu. Throughout the reign of the Early Cheras, trade continued to bring prosperity to their territories, with spices, ivory, timber, pearls and gems being exported to the Middle East and to southern Europe. Evidence of extensive foreign trade from ancient times can be seen throughout the Malabar coast (Muziris), Karur and Coimbatore districts.");
		db.insert("history",null,values);








		values.put(DAY,"");
		values.put(MONTH,"");
		values.put(YEAR, "300 BC");
		values.put(EVENT, "Chola Empire Established");
		values.put(DESCRIPTION, "The Cholas were one the three main dynasties to rule south India from ancient times. Karikala Chola was the famous king during the early centuries of the common era and managed to gain ascendency over the Pandyas and Cheras. The Chola dynasty however went into a period of decline from c. fourth century CE. This period coincided with the ascendency of Kalabhras who moved down from the northern Tamil country displacing the established kingdoms and ruled over most of south India for almost 300 years.");
		db.insert("history",null,values);

		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "269 BC");
		values.put(EVENT, "Reign Of Ashoka The Great Begins");
		values.put(DESCRIPTION, "Ashok Maurya, popularly known as Ashoka the Great, was an Indian emperor of the Maurya Dynasty who ruled almost all of the Indian subcontinent from ca. 269 BC to 232 BC. One of India's greatest emperors, Ashoka reigned over most of present-day India after a number of military conquests. His empire stretched from present-day Pakistan and Afghanistan in the west, to the present-day Bangladesh and the Indian state of Assam in the east, and as far south as northern Kerala and Andhra Pradesh. He conquered the kingdom named Kalinga, which no one in his dynasty had conquered starting from Chandragupta Maurya. He was later dedicated to the propagation of Buddhism across Asia and established monuments marking several significant sites in the life of Gautama Buddha. Ashoka was a devotee of ahimsa (nonviolence), love, truth, tolerance and vegetarianism.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "265 BC");
		values.put(EVENT, "The Kalinga War");
		values.put(DESCRIPTION, "The Kalinga War was a war fought between the Mauryan Empire under Ashoka the Great and the state of Kalinga, a feudal republic located on the coast of the present-day Indian state of Orissa. The Kalinga war is one of the major battles in the History of India. Kalinga put up a stiff resistance, but they were no match for Ashoka's brutal strength. The bloodshed of this war is said to have prompted Ashoka to adopt Buddhism.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "230 BC");
		values.put(EVENT, "Satavahana Dynasty Established");
		values.put(DESCRIPTION, "The Satavahana Empire or Andhra Empire, was a royal Indian dynasty based from Dharanikota and Amaravati in Andhra Pradesh as well as Junnar (Pune) and Prathisthan (Paithan) in Maharashtra. The territory of the empire covered much of India from 230 BCE onward.Sātavāhanas started out as feudatories to the Mauryan dynasty, but declared independence with its decline. They are known for their patronage of Buddhism which resulted in Buddhist monuments from Ellora (a UNESCO World Heritage Site) to Amaravati. The Satavahanas were one of the first Indian state to issue coins struck with their rulers embossed. They formed a cultural bridge and played a vital role in trade as well as the transfer of ideas and culture to and from the Indo-Gangetic Plain to the southern tip of India.");
		db.insert("history",null,values);


		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "185 BC");
		values.put(EVENT, "The Sunga Empire Established");
		values.put(DESCRIPTION, "The Sunga Empire was a royal Indian dynasty from Magadha that controlled vast areas of the Indian Subcontinent from around 185 to 73 BCE. The dynasty was established by Pusyamitra Sunga, after the fall of the Maurya Empire. Its capital was Pataliputra, but later emperors such as Bhagabhadra also held court at Vidisha, modern Besnagar in Eastern Malwa. The empire is noted for its numerous wars with both foreign and indigenous powers. They fought battles with the Kalingas, Satavahanas, the Indo-Greeks, and possibly the Panchalas and Mathuras.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "30");
		values.put(EVENT, "The Kushan Empire Established");
		values.put(DESCRIPTION, "The Kushan Empire was originally formed in the early 1st century AD under Kujula Kadphises. During the 1st and early 2nd centuries AD the Kushans expanded rapidly across the northern part of the Indian subcontinent at least as far as Saketa and Sarnath near Varanasi (Benares) where inscriptions have been found dated to the first few years of era of the most famous Kushan ruler, Kanishka which apparently began about 127 AD.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "78");
		values.put(EVENT, "Reign Of Gautamiputra Satakarni Begins");
		values.put(DESCRIPTION, "Gautamiputra Satakarni, often acknowledged by historians as the greatest of the Satavahana rulers, took to the throne after his father, Satakarni. Satakarni had earlier expanded the Satavahana Empire and gained considerable prosperity due to his two Aswamedha sacrifices. When Gautamiputra ascended the throne, the Satavahana Empire was loosely attached and was facing the threats of foreign invasions from Sakas and Yavanas. Gautamiputra defeated the Yavanas, Sakas, and Pahlavas and re-established the ancient glory of the Satavahanas. The Shaka rulers Nahapana and Ushavadata were ultimately defeated by the powerful Satavahana king Gautamiputra Satakarni. Gautramiputra drove the Sakas from Malwa and Western Maharashtra, forcing Nahapana west to Gujarat. Gautamiputra restruck many of Nahapana's coins. He overthrew Nahapana and restruck a large number of Ksaharata coins of the Jogalthembi hoard.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "320");
		values.put(EVENT, "Establishment Of The Gupta Empire");
		values.put(DESCRIPTION, "The Gupta Empire was an Ancient Indian empire which existed approximately from 320 to 550 CE and covered much of the Indian Subcontinent. Founded by Maharaja Sri-Gupta, the dynasty was the model of a classical civilization. The peace and prosperity created under leadership of Guptas enabled the pursuit of scientific and artistic endeavors. This period is called the Golden Age of India and was marked by extensive inventions and discoveries in science, technology, engineering, art, dialectic, literature, logic, mathematics, astronomy, religion and philosophy that crystallized the elements of what is generally known as Hindu culture. Chandragupta I, Samudragupta, and Chandragupta II were the most notable rulers of the Gupta dynasty.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "335");
		values.put(EVENT, "Reign Of Samudragupta Begins");
		values.put(DESCRIPTION, "Samudragupta, ruler of the Gupta Empire, and successor to Chandragupta I, is considered to be one of the greatest military geniuses in Indian history according to Historian V. A. Smith. His name is taken to be a title acquired by his conquests (Samudra referring to the 'oceans'). Samudragupta the Great is believed to have been his father's chosen successor even though he had several older brothers. Therefore, some believe that after the death of Chandragupta I, there was a struggle for succession in which Samudragupta prevailed.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "345");
		values.put(EVENT, "Kadamba Dynasty Established");
		values.put(DESCRIPTION, "Kadamba Dynasty, Kadambas of Banavasi was an ancient royal family of Karnataka, India that ruled northern Karnataka and the Konkan from Banavasi in present day Uttara Kannada district. At the peak of their power under King Kakushtavarma, Kadambas of Banavasi ruled large parts of Karnataka state. The dynasty was founded by Mayurasharman in 345 CE which at times showed the potential of developing into imperial proportions, an indication to which is provided by the titles and epithets assumed by its rulers. King Mayurasharman defeated the Pallavas of Kanchi possibly with help of some native tribes");
		db.insert("history",null,values);
		

		values.put(DAY,"");
		values.put(MONTH,"");
		values.put(YEAR, "350");
		values.put(EVENT, "Pallava Empire");
		values.put(DESCRIPTION, "The Pallavas were a great south Indian dynasty who ruled between the third century CE until their final decline in the ninth century CE. Their capital was Kanchipuram in Tamil Nadu. Their origins are not clearly known. However, it is surmised that they were yadavas and they probably were feudatories of Satavahanas. Pallavas started their rule from Krishna river valley, known today as Palnadu, and subsequently spread to southern Andhra Pradesh and north Tamil Nadu. Mahendravarman I was a prominent Pallava king who began work on the rock-cut temples of Mahabalipuram. His son Narasimhavarman I came to throne in 630 CE. He defeated the Chalukya king Pulakesi II in 632 CE and burned the Chalukyan capital Vatapi. Pallavas and Pandyas dominmated the souther regions of South India between the sixth and the ninth centuries CE.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "350");
		values.put(EVENT, "Establishment Of The Western Ganga Dynasty");
		values.put(DESCRIPTION, "The Western Ganga Dynasty was an important ruling dynasty of ancient Karnataka in India which lasted from about 350 to 1000 AD.The general belief is that the Western Gangas began their rule during a time when multiple native clans asserted their freedom due to the weakening of the Pallava empire in South India, a geo-political event sometimes attributed to the southern conquests of Samudra Gupta. The Western Ganga sovereignty lasted from about 350 to 550 AD, initially ruling from Kolar and later, moving their capital to Talakad on the banks of the Kaveri River in modern Mysore district.Though territorially a small kingdom, the Western Ganga contribution to polity, culture and literature of the modern south Karnataka region is considered important. The Western Ganga kings showed benevolent tolerance to all faiths but are most famous for their patronage toward Jainism resulting in the construction of monuments in places such as Shravanabelagola and Kambadahalli.");
		db.insert("history",null,values);

		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "375");
		values.put(EVENT, "Reign Of Chandragupta II The Great Begins");
		values.put(DESCRIPTION, "Chandragupta II the Great was one of the most powerful emperors of the Gupta empire. His rule spanned 375-413/15 CE, during which the Gupta Empire achieved its zenith. The period of prominence of the Gupta dynasty is very often referred to as the Golden Age of India. Chandragupta II the Great was the son of the previous ruler, Samudragupta the Great. He attained success by pursuing both a favorable marital alliance and an aggressive expansionist policy. In this his father and grandfather set the precedent.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "543");
		values.put(EVENT, "Establishment Of The Chalukya Dynasty");
		values.put(DESCRIPTION, "The Chalukya dynasty was an Indian royal dynasty that ruled large parts of southern and central India between the 6th and the 12th centuries. During this period, they ruled as three related yet individual dynasties. The rule of the Chalukyas marks an important milestone in the history of South India and a golden age in the history of Karnataka. The political atmosphere in South India shifted from smaller kingdoms to large empires with the ascendancy of Badami Chalukyas. For the first time, a South Indian kingdom took control and consolidated the entire region between the Kaveri and the Narmada rivers. The rise of this empire saw the birth of efficient administration, overseas trade and commerce and the development of new style of architecture called 'Chalukyan architecture'.");
		db.insert("history",null,values);


		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "606");
		values.put(EVENT, "Harshavardhana Establishes Empire");
		values.put(DESCRIPTION, "Harsha or Harsha Vardhana or Harshwardhan was an Indian emperor who ruled Northern India for forty one years. At the height of his power his kingdom spanned the Punjab, Rajasthan, Gujarat, Bengal, Orissa and the entire Indo-Gangetic plain North of the Narmada River. After the downfall of the Gupta Empire in the middle of the sixth century CE, North India reverted to small republics and small monarchical states. Harsha united the small republics from Punjab to Central India, and they, at an assembly, crowned Harsha king in April 606 AD when he was merely 16 years old.");
		db.insert("history",null,values);
		

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "610");
		values.put(EVENT, "Pulakesi II Ascends Throne");
		values.put(DESCRIPTION, "Pulikeshi II(610-642 CE) is the most famous ruler of the Chalukya dynasty. In his reign the Chalukyas of Badami saw their kingdom extend over most of the Deccan.Pulikeshi had to face several obstacles soon after his coronation. The Aihole inscription of 634 found in an Aihole Jainlaya says, 'the whole world was enveloped in the darkness that was enemies'. After consolidating his position, Pulikeshi II organized and enlarged his fighting forces. He then embarked upon a series of conquests to expand his dominions. The accounts of Pulikeshi's campaigns are provided in the Aihole inscription dated 634. It was composed by his court poet Ravikirti. The inscription is one of the finest pieces of poetry. Written in Sanskrit language and Hale Kannada script, it is the most important source of information regarding the rule of Pulikeshi II.");
		db.insert("history",null,values);

		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "700");
		values.put(EVENT, "Reign Of Narasimhavarman II Begins");
		values.put(DESCRIPTION, "Narasimhavarman II was a Pallava king who ruled in South India during the 6th century. Succeeding his father Paramesvaravarman I in the year 700 CE, he ruled for nearly 3 decades, until he was succeeded by his son Paramesvaravarman II in 728 CE. Narasimhavarman, like of most of Pallava kings before him, was a great militarist. That the Pallavas were recognized as a major power during his period is testified by the fact that he exchanged ambassadors with China. Some inscriptions credit him of 'offering to certain rulers assistance in their war against Arabs'. In general his period was relatively free from major wars and Pallava domination of south east Asia continued.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "753");
		values.put(EVENT, "Rashtrakuta Empire Established");
		values.put(DESCRIPTION, "The Rashtrakuta Empire was a royal dynasty ruling large parts of the Indian Subcontinent between the sixth and the 10th centuries. The earliest known Rashtrakuta inscription is a 7th century copper plate grant that mentions their rule from Manpur in the Malwa region of modern Madhya Pradesh. At their peak the Rashtrakutas of Manyakheta ruled a vast empire stretching from the Ganges River and Yamuna River doab in the north to Cape Comorin in the south, a fruitful time of political expansion, architectural achievements and famous literary contributions. During their rule, Jain mathematicians and scholars contributed important works in Kannada and Sanskrit. Architecture reached a milestone in the Dravidian style, the finest example of which is seen in the Kailasanath Temple at Ellora. Other important contributions are the sculptures of Elephanta Caves in modern Maharashtra as well as the Kashivishvanatha temple and the Jain Narayana temple at Pattadakal in modern Karnataka, all of which are UNESCO World Heritage Sites.");
		db.insert("history",null,values);

		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "814");
		values.put(EVENT, "Reign Of Amoghavarsha I Begins");
		values.put(DESCRIPTION, "Amoghavarsha I was a Rashtrakuta emperor, the greatest ruler of the Rashtrakuta dynasty, and one of the great emperors of India. His reign of 64 years is the longest precisely dated monarchical reign on record in India and one of the longest documented reigns of any monarch. Historians have compared him to the legendary Emperor Ashoka for his religious temperament and love of peace.  Amoghavarsha I was an accomplished poet and scholar. He wrote the Kavirajamarga, the earliest extant literary work in Kannada.  He moved the Rashtrakuta regal capital from Mayurkhandi in the Bidar district to Manyakheta in the Gulbarga district in the modern Karnataka state. He is said to have built the regal city to 'match that of Lord Indra'. The capital city was planned to include elaborately designed buildings for the royalty using the finest of workmanship.");
		db.insert("history",null,values);

		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1024");
		values.put(EVENT, "Ghazni Sacks Somnath Temple");
		values.put(DESCRIPTION, "Ghazni Mohammed descended on Somnath in 1024 when the temple was so prosperous that it has 300 musicians, 500 dancing girls and 300 barbers to shave the heads of visiting pilgrims. There is a description to this effect by Al Biruni, an Arab traveller. After a two-day battle, Ghazni Mohammedcarted off its fabulous wealth and also destroyed the temple, thus setting a precedent.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1026");
		values.put(EVENT, "Hoysala Empire Established");
		values.put(DESCRIPTION, "The Hoysala Empire was a prominent South Indian Kannadiga empire that ruled most of the modern day state of Karnataka between the 10th and the 14th centuries. The capital of the Hoysalas was initially located at Belur but was later moved to Halebidu. By the 13th century, they governed most of present-day Karnataka, minor parts of Tamil Nadu and parts of western Andhra Pradesh in Deccan India. The Hoysala era was an important period in the development of art, architecture, and religion in South India. The empire is remembered today primarily for its temple architecture. Over a hundred surviving temples are scattered across Karnataka, including the well known Chennakesava Temple at Belur, the Hoysaleswara Temple at Halebidu, and the Kesava Temple at Somanathapura. The Hoysala rulers also patronised the fine arts, encouraging literature to flourish in Kannada and Sanskrit.");
		db.insert("history",null,values);

		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1076");
		values.put(EVENT, "Reign Of Vikramaditya VI Begins");
		values.put(DESCRIPTION, "Vikramaditya VI became the Western Chalukya King after deposing his elder brother Somesvara II. Vikramaditya's reign is marked by the start of the Chalukya-Vikrama era. Vikramaditya VI was the greatest of the Western Chalukya kings and had the longest reign in the dynasty. He earned the title Permadideva and Tribhuvanamalla (lord of three worlds). Vikramadtiya VI is noted for his patronage of art and letters. At his peak,Vikarmaditya VI controlled a vast empire stretching from the Kaveri river in southern India to the Narmada River in central India.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1191");
		values.put(EVENT, "First Battle Of Tarain");
		values.put(DESCRIPTION, "In 1191, Ghauri, leading an army, invaded India through the Khyber Pass and was successful in reaching Punjab. Ghauri captured a fortress, either at Sirhind or Bathinda in present-day Punjab state on the northwestern frontier of Prithviraj Chauhan's kingdom. Prithviraj's strong army led by his vassal prince Govinda-Raja of Delhi, rushed to the defense of the frontier, and the two armies met at the town of Tarain, near Thanesar in present-day Haryana, approximately 150 kilometres north of Delhi.Ghauri's defeated army retreated to Lahore and, thereafter, returned to Ghazni. Prithvi Raj ignored the advice of his advisers and did not pursue the retreating army, which was a decision he later regretted.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1192");
		values.put(EVENT, "Second Battle Of Tarain");
		values.put(DESCRIPTION, "On his return to Ghazni, Ghori made hectic preparations to avenge the defeat. When he reached Lahore, he sent his envoy to Prithviraj to demand his submission, but the Chauhan ruler refused to comply. Prithviraj saw through Ghori's stratagem. So he issued a fervent appeal to his fellow Rajput chiefs to come to his aid against the Muslim invader. Prithviraj proceeded with it to meet Muhammad Ghori in Tarain where a year before he had inflicted a crushing defeats on his adversary. But fate conspired against Prithviraj the second time around. He was surrounded and killed by the Afghan troops. The seriousness of this defeat for India cannot be exaggerated. The victory of Mohammad of Ghur was decisive, and laid the foundation of the Sultanate of Delhi and, for Hinduism, the period was critical.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1199");
		values.put(EVENT, "Foundation Stone Of The Qutab Minar Laid");
		values.put(DESCRIPTION, "Qutb-Ud-Din Aibak laid the foundation of Qutab Minar in AD 1199. The minar was said to havebeen built to celebrate the victory of Mohammed Ghori, the invader from Afghanistan, over the Rajputs in 1192. He raised the first storey, to which were added three more storeys by his successor and son-in-law, Shamsu'd-Din IItutmish (AD 1211-36). All the storeys are surrounded by a projected balcony encircling the Minar and supported by stone brackets, which are decorated with a honeycomb design, more conspicuously in the first storey.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1200");
		values.put(EVENT, "Reign Of Singhana II Begins");
		values.put(DESCRIPTION, "Singhana II 1200-1247 C.E. is considered the greatest ruler of the Yadava dynasty. During his rule the kingdom expanded from Narmada to Tungabhadra, reaching its zenith at the expense of Hoysalas in the south, Kakatiya dynasty in the east, Paramaras and Chalukyas in the north.He founded the town Shinghanapur (or Singhanapur). He was a great patron of learning and literature. He established the college of astronomy to study the work of celebrated astronomer Bhaskaracharya. The Sangita Ratnakara, an authoritative Sanskrit work on Indian music was written by Sharngadeva during Singhana II's reign. He also patronized Changadeva, the Kannada poet Kamalabhava.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1206");
		values.put(EVENT, "Qutb-Ud-Din Aibak Establishes The Slave Dynasty");
		values.put(DESCRIPTION, "Qutb-Ud-Din Aibak, who rose to be the first slave-sultan of Hindustan, was purchased, early in life, by Fakhruddin, the chief Qazi of Nishapur. After the Qazi's death his sons sold Aibak to a merchant who took him to Ghazni and sold him to Sultan Muizzuddin. Aibak extended Muslim dominions in India by undertaking expeditions on behalf of his master. The Sultan seems to have desired that Aibak should succeed him in Hindustan, and after the death of the Sultan, he ascended the throne of Hindustan at Lahore in 1206 and ruled up to 1210.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1262 ");
		values.put(EVENT, "Reign Of Rani Rudramadevi Begins");
		values.put(DESCRIPTION, "The most prominent ruler of the Kakatiya dynasty was Rani Rudrama Devi 1262-1289 CE, one of the few queens in Indian history. She was born as Rudramba to Ganapathideva who had no sons. Rudramadevi was married to Veerabhadra, Eastern Chalukyan prince of Nidadavolu. Despite initial misgivings by some of her generals who resented a female ruler, she suppressed the internal rebellions and external incursions. An able fighter and ruler Rudramba defended the kingdom from the Cholas and the Yadavs, earning their respect. She remains one of the few symbols of female power in South India.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1291");
		values.put(EVENT, "Reign Of Veera Ballala III Begins");
		values.put(DESCRIPTION, "Veera Ballala III (1291-1343) was the last great king of the Hoysala Empire that ruled over what is now the South Indian state of Karnataka. Veera Ballala's commanders, Harihara (popularly known as Hakka) and Bukkaraya (popularly known as Bukka) are perhaps better known in Kannada folklore as the founders of the Vijayanagar Empire. He ruled during a time of tremendous political and cultural uncertainty, when all other major Hindu kingdoms of the Deccan and South India had fallen to the Muslim invasion from the north.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1325");
		values.put(EVENT, "Reign Of Mohammed-Bin-Tughluq Begins");
		values.put(DESCRIPTION, "Muhammad bin Tughluq was the Turkic Sultan of Delhi from 1325 to 1351. Muhammad Tughlug was a scholar versed in logic, philosophy, mathematics, astronomy and physical sciences. He had knowledge of medicine and was skillful in dialectics. He was also a calligrapher.He was well versed with several languages. Ibn Battuta (Moroccan traveler) visited him during his reign.He introduced some remarkable administrative measures which although failed but very distinct and exemplary in nature.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1336");
		values.put(EVENT, "Establishment Of The Vijayanagara Empire");
		values.put(DESCRIPTION, "The Vijayanagara Empire was a South Indian empire based in the Deccan Plateau. Established in 1336 by Harihara I and his brother Bukka Raya I of Yadava Lineage. The empire rose to prominence as a culmination of attempts by the southern powers against Islamic invasions by the end of the 13th century. It lasted until 1646 although its power declined after a major military defeat in 1565 by the Deccan sultanates. The empire is named after its capital city of Vijayanagara, whose impressive ruins surround modern Hampi, now a World Heritage Site in modern Karnataka, India. The Vijayanagara Empire created an epoch in South Indian history that transcended regionalism by promoting Hinduism as a unifying factor.");
		db.insert("history",null,values);
		
		values.put(DAY, "3");
		values.put(MONTH,"AUG");
		values.put(YEAR, "1347");
		values.put(EVENT, "Reign Of Hasan Gangu Begins");
		values.put(DESCRIPTION, "Abu'l Muzaffar Ala-ud-Din Bahman Shah (r. 3 August 1347 - 1358), whose original name was Hasan Gangu or Hansan Kanku and also bore the title of Zafar Khan was the founder of the Bahmani sultanate.His kingdom was divided into four provinces and he appointed a governor for each province. During his reign Hasan fought many wars with Vijayanagar. By the time of his death the kingdom streched from north to south from the Wainganga River to Krishna and east to west from Bhongir to Daulatabad.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1391");
		values.put(EVENT, "Establishment Of The Muzzafarid Dynasty");
		values.put(DESCRIPTION, "The Muzaffarid dynasty were sultans of Gujarat in western India from 1391 to 1583. The founder of the dynasty was Zafar Khan Muzaffar (later Muzaffar Shah I) who was governor of Gujarat under the Delhi Sultanate. During the Muzaffarid rule, Ahmedabad grew to become one of the largest and wealthiest cities in the world.");
		db.insert("history",null,values);
		
		values.put(DAY, "30");
		values.put(MONTH,"SEP");
		values.put(YEAR, "1398");
		values.put(EVENT, "Invasion Of Timur");
		values.put(DESCRIPTION, "In 1398 Timur invaded northern India, attacking the Delhi Sultanate ruled by Sultan Nasir-u Din Mehmud of the Tughlaq Dynasty. He crossed the Indus river on September 30, 1398 and captured Multan by October. His campaign was officially justified by claims that the Muslim Delhi Sultanate was too tolerant toward its Hindu subjects, but was motivated greatly by the considerable wealth to be gained. By all accounts, Timur's campaigns in India were marked by systematic slaughter and other atrocities on a truly massive scale inflicted mainly on the subcontinent's Hindu population.");
		db.insert("history",null,values);
		

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1399");
		values.put(EVENT, "Establishment Of The Mysore Kingdom");
		values.put(DESCRIPTION, "The Kingdom of Mysore was a kingdom of southern India, traditionally believed to have been founded in 1399 in the vicinity of the modern city of Mysore. The kingdom, which was ruled by the Wodeyar family, initially served as a vassal state of the Vijayanagara Empire. With the decline of the Vijayanagara Empire (c.1565), the kingdom became independent. The 17th century saw a steady expansion of its territory and, under Narasaraja Wodeyar I and Chikka Devaraja Wodeyar, the kingdom annexed large expanses of what is now southern Karnataka and parts of Tamil Nadu to become a powerful state in the southern Deccan. The kingdom reached the height of its military power and dominion in the latter half of the 18th century under the de facto ruler Haider Ali and his son Tipu Sultan. ");
		db.insert("history",null,values);

		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1414");
		values.put(EVENT, "Reign Of Khizr Khan Begins");
		values.put(DESCRIPTION, "Khizr Khan Sayyid (reigned 1414-21) was the founder of the Sayyid dynasty, the ruling dynasty of the Delhi sultanate, an independent kingdom in the late medieval north India soon after the invasion of Timur and the fall of the Tughlaq dynasty. He was known to be an able administrator. He did not take up any royal title and contended himself with the title of Rayat-i-Ala (Sublime Banners). During his reign, coins were struck in the name of Timur and after his death in the name of his successor Shah Rukh. ");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1424");
		values.put(EVENT, "Reign Of Deva Raya II Begins");
		values.put(DESCRIPTION, "Deva Raya II (reigned 1424-1446 CE) was an emperor of the Vijayanagara Empire from the Sangama Dynasty. Perhaps the greatest of the Sangama dynasty rulers, he patronised some of the famous Kannada and Telugu poets of the time. The King himself was a scholar and wrote Sobagina Sone in Kannada and  Mahanataka Sudhanidhi in Sanskrit.");
		db.insert("history",null,values);
		
		values.put(DAY, "19");
		values.put(MONTH,"APR");
		values.put(YEAR, "1451");
		values.put(EVENT, "Reign Of Bahlul Lodi Begins");
		values.put(DESCRIPTION, "Bahlul Khan Lodi was the founder of the Afghan Lodi Dynasty of the Delhi Sultanate in India upon the abdication of the last claimant from the previous Sayyid rule.In 1479, Sultan Bahlul Khan Lodi defeated and annexed Sharqi dynasty based at Jaunpur. Bahlul Khan did much to stop rebellions and uprisings in his territories, and extended his holdings over Gwalior, Jaunpur and upper Uttar Pradesh. In 1486, he appointed his son, Babrak Shah as viceroy of Jaunpur. ");
		db.insert("history",null,values);
		
		values.put(DAY, "15");
		values.put(MONTH,"APR");
		values.put(YEAR, "1469");
		values.put(EVENT, "Birth Of Guru Nanak");
		values.put(DESCRIPTION, "Guru Nanak was the founder of the religion of Sikhism and the first of the ten Sikh Gurus. The Sikhs believe that all subsequent Gurus possessed Guru Nanak's divinity and religious authority, and were named 'Nanak' in  the line of succession.Dev was born on 15 April 1469, now celebrated as Prakash Divas of Guru Nanak Dev, into a Bedi Kshatriya family in the village of Rai Bhai d? Talwandi, now called Nankana Sahib, near Lahore, Pakistan.");
		db.insert("history",null,values);

		values.put(DAY, "20");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1498");
		values.put(EVENT, "Vasco-Da-Gama Arrives In India");
		values.put(DESCRIPTION, "Vasco-Da-Gama arrived in Calicut, India on May 20, 1498. Calicut was the principle market of trade for precious stones, pearls, and spices. At first, the Portuguese were well received and accepted by the Hindu ruler. There was a great ceremony, and da Gama was taken to a Hindu temple. However, this immediate reaction did not last.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1508");
		values.put(EVENT, "Battle Of Chaul");
		values.put(DESCRIPTION, "The Battle of Chaul was a naval battle between the Portuguese and an Egyptian Mamluk fleet in 1508 in the harbour of Chaul in India. The battle ended in a Mamluk victory. It followed the Siege of Cannanore (1507) in which a Portuguese garrison successfully resisted an attack by Southern Indian rulers. This was the first Portuguese defeat at sea in the Indian Ocean.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1509");
		values.put(EVENT, "Reign Of Krishna Deva Raya Begins");
		values.put(DESCRIPTION, "Krishna Deva Raya was the greatest Emperor of the Vijayanagara Empire who reigned from 1509-1529 CE. He is the third ruler of the Tuluva Dynasty. Presiding over the empire at its zenith, he is regarded as an icon by many Indians.Much information about his reign comes from the accounts of Portuguese travelers Domingo Paes and Fernao Nuniz. Krishna Deva Raya benefited from the able prime minister Timmarusu. Travelogues indicate that the king was not only an able administrator, but also an excellent general, leading from the front in battle and even attending to the wounded");
		db.insert("history",null,values);
		
		values.put(DAY, "3");
		values.put(MONTH,"FEB");
		values.put(YEAR, "1509");
		values.put(EVENT, "Battle Of Diu");
		values.put(DESCRIPTION, "The Battle of Diu sometimes referred as the Second Battle of Chaul was a naval battle fought on 3 February 1509 in the Arabian Sea, near the port of Diu, India, between the Portuguese Empire and a joint fleet of the Sultan of Gujarat, the Mamlak Burji Sultanate of Egypt, the Zamorin of Kozhikode with support of Ottomans, the Republic of Venice and the Republic of Ragusa. The Portuguese victory was critical: Mamluks and Arabs retreated, easing the Portuguese strategy of controlling the Indian Ocean to route trade down the Cape of Good Hope, circumventing the traditional spice route controlled by the Arabs and the Venetians through the Red Sea and Persian Gulf.");
		db.insert("history",null,values);
		
		values.put(DAY, "25");
		values.put(MONTH,"NOV");
		values.put(YEAR, "1510");
		values.put(EVENT, "The Portugese Conquer Goa");
		values.put(DESCRIPTION, "In 1510 under the command of Alfonso de Albuquerque they laid siege upon Goa, then under Sultan Adil Shah of Bijapur. On February 17th he entered the city of Goa for the first time and met little resistance. Sultan Adil Shah soon came after him with a vengeance and and on May 23rd 1510 Alfonso de Albuquerque had to flee the city of Goa. Determined to win it for good, Alfonso de Albuquerque made another attempt a few months later. After an initial attack on the Arsenal and a quick and bloody battle, Alfonso de Albuquerque victoriously entered the city of Ela, Goa on St. Catherine's Day, November 25th 1510 .");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1517");
		values.put(EVENT, "Reign Of Ibrahim Lodi Begins");
		values.put(DESCRIPTION, "Sultan Ibrahim Khan Lodi (1489-1526), the youngest son of Sikandar, was the last Lodi Sultan of Delhi. Sultan Ibrahim (r.1517-26) was a fearless military leader and kept out the opposition for almost a decade. He was engaged in warfare with the Afghans and the Mughals for most of his reign and died trying to keep the Lodi Dynasty from annihilation. Sultan Ibrahim was defeated in 1526 at the Battle of Panipat. This marked the end of the Lodi Dynasty and the rise of the Mughal Empire in India led by Babur");
		db.insert("history",null,values);

		values.put(DAY, "21");
		values.put(MONTH,"APR");
		values.put(YEAR, "1526");
		values.put(EVENT, "Battle Of Panipat(First)");
		values.put(DESCRIPTION, "The first battle of Panipat took place in Northern India,and marked the beginning of the Mughal Empire. This was one of the earliest battles involving gunpowder firearms and field artillery.In 1526, the Mughal and Afghan forces of Babur, the Timurid ruler of Kabulistan, defeated the much larger Indian army of Ibrahim Lodi, Sultan of Delhi. The battle marked the foundation of the Mughal Empire in India.");
		db.insert("history",null,values);
		
		values.put(DAY, "17");
		values.put(MONTH,"MAR");
		values.put(YEAR, "1527");
		values.put(EVENT, "Battle Of Khanwa");
		values.put(DESCRIPTION, "The Battle of Khanwa was the second in a series of three major battles, victories in which gave Babur overlordship over North India. Babur defeated a formidable army raised by Rana Sanga of Mewar in this ten hour battle and firmly established his rule over northern India.Babur's grandson Akbar the Great established the city and fort of Fatehpur Sikri in honor of his grandfather's victory in this battle.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1540");
		values.put(EVENT, "Reign Of Sher Shah Suri Begins");
		values.put(DESCRIPTION, "Sher Shah Suri (1486  May 22, 1545) also known as Sher Khan (The Lion King), was the founder of the short-lived, Sur Empire in northern India, with its capital at Delhi, before its demise in the hands of the resurgent Mughal Empire. An Afghan (Pathan) by origin, he defeated the Mughals and took control of India in 1540. A soldier of fortune, Sher Khan also proved himself a gifted administrator as well as an able general. His reorganization of the empire laid the foundations for the later Mughal emperors, notably Akbar the Great, son of Humayun. During his five year rule from 1540 to 1545, he set up a new template for civic and military administration, issued the first Rupee and re-organised the postal system of India.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH,"FEB");
		values.put(YEAR, "1555");
		values.put(EVENT, "Humayun Re-Conquers Delhi");
		values.put(DESCRIPTION, "Humayun made an attempt to restore his lost empire after about fifteen years. He got an army of 14,000 men from Persia and succeeded in conquering Kabul and Kandhahar with the help of Shah of Iran in 1545. In November 1554, he marched to reconquer Hindustan. In February 1555, Humayun captured Lahore and then occupied Delhi. Thus he got back partially what he had lost due to his weakness. He appointed his son Akbar as governor of the Punjab and left his gallant general Bairam Khan to assist the young prince.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1556");
		values.put(EVENT, "Akbar The Great Ascends Mughal Throne");
		values.put(DESCRIPTION, "Akbar The Great [1542-1605], was one of the greatest rulers in Indian history.  Akbar came to throne in 1556, after the death of his father, Humayun. At that time, Akbar was only 13 years old. During the first five years of his rule, Akbar was assisted and advised by Bahram Khan in running the affairs of the country. However, after 1562, Akbar freed himself from external influences and ruled supreme.");
		db.insert("history",null,values);
		

		values.put(DAY,"5");
		values.put(MONTH,"Nov");
		values.put(YEAR, "1556");
		values.put(EVENT, "Second Battle of Panipat");
		values.put(DESCRIPTION, "The Second Battle of Panipat was fought between the forces of Samrat Hem Chandra Vikramaditya, popularly called Hemu, the Hindu king who was ruling North India from Delhi, and the army of Akbar. It was a decisive victory for Akbar's generals Khan Zaman I and Bairam Khan.");
		db.insert("history",null,values);



		values.put(DAY, "26");
		values.put(MONTH,"JAN");
		values.put(YEAR, "1565");
		values.put(EVENT, "Battle Of Talikoti");
		values.put(DESCRIPTION, "The Battle of Talikota: A watershed battle fought between the Vijayanagara Empire and the Deccan sultanates, resulted in a rout of Vijayanagara, and ended the last great Hindu kingdom in South India. Talikota is situated in northern Karnataka, about 80 km to the southeast of the city of Bijapur.");
		db.insert("history",null,values);
		
		values.put(DAY, "18");
		values.put(MONTH,"JUN");
		values.put(YEAR, "1576");
		values.put(EVENT, "Battle Of HaldiGhati");
		values.put(DESCRIPTION, "The Battle Of HaldiGhati was a four-hour confrontation between the Imperial forces of Mughal Emperor Akbar and Maharana Pratap Singh (1572-1597) of Mewar. It was an indecisive battle. Pratap was pursued by two Mughal horsemen but was saved by his brother. Pratap joined the remainder of his men, recovered from his wounds, then continued his guerilla resistance . The battle of Haldighati is significant for the tenacity displayed by the Rajputs and the art of defensive mountain warfare which Maharana Pratap Singh perfected.");
		db.insert("history",null,values);
		

		values.put(DAY,"");
		values.put(MONTH,"");
		values.put(YEAR, "1596");
		values.put(EVENT, "Chatrapati Shivaji Maharaj Ascends Throne");
		values.put(DESCRIPTION, "On the 13th day (trayodashi) of the first fortnight of the month of 'Jyeshtha' as per the Hindu calendar, in the year 1596, the coronation ceremony was held to enthrone Punyashlok Chhatrapati Shivaji Maharaj as the King of Hindavi Swaraj. The grand function took place atop the 5,000-ft high Raigad fort in Maharashtra. He became thereafter a full-fledged Chhatrapati - a Hindu emperor in his own right. The occasion holds up for the Hindu people inspiring lessons for their future march - perhaps unequalled by any other single event during the past 3-4 centuries of their history. It is the golden day of glory in the history of Hindusthan and Hindus.");
		db.insert("history",null,values);

		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1600");
		values.put(EVENT, "The English East India Company Secures Charter");
		values.put(DESCRIPTION, "In 1500 a group of merchants under the Chairman ship of Lord Mayor formed an association in London to trade with India. In 1600 Queen Elizabeth granted a charter to the governor at a company of merchants to trade freely with the countries of the east. Voyages were made to SouthEast Asia to trade in spices. Attention towards India was diverted due to the Dutch influence in the Spice islands and getting raw materials for the English. It was believed that the vast Indian mainland could be a market for the finished goods.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1605");
		values.put(EVENT, "Reign Of Jahangir Begins");
		values.put(DESCRIPTION, "From the beginning, Jahangir's life was overshadowed by the achievements of his father Akbar. Jahangir grew up resentful of his masterful parents. Historians write that despite Jahangir's acute intelligence, the Mughal ruler was generally indifferent to the larger interests of the empire. Moreover, he lacked any obvious inclination for warfare and was bored by the humdrum details of day-to-day administration. Jahangir was self-indulgent and sensual with a streak of cruelty that emanated from a weak personality.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1628");
		values.put(EVENT, "Shah Jahan Proclaimed Emperor");
		values.put(DESCRIPTION, "Shah Jahan ascended the throne in 1628 and assumed the title of Abul Muzaffar Shahbuddin Muhammad Sahib-i Kiran-i Sani. Undoubtedly, Shah Jahan was one of the greatest of the Mughals. The Mughal empire reached its greatest prosperity in the reign of Shah Jahan. He personally supervised the minutest details of the administration and appointed men of highest ability as his minister. The Peacock throne, the Taj Mahal, the Agra Fort and numerous other works of architecture and art testify to his wealth as well as his aesthetic sense.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1658");
		values.put(EVENT, "Aurangzeb Crowned Emperor");
		values.put(DESCRIPTION, "Aurangzeb was the greatest king among the Mughals and ruled over the largest territory of any ruler in Indian history. His empire extended from Kabul in present Afghanistan to areas in South India bordering Madurai in present Tamil Nadu State. Aurangzeb's rise to the throne has been criticized as being ruthless. However, once established, he showed himself a firm and capable administrator who retained his grip of power until his death at the age of 88.");
		db.insert("history",null,values);
		
		values.put(DAY, "10");
		values.put(MONTH,"NOV");
		values.put(YEAR, "1659");
		values.put(EVENT, "Battle Of Pratapgadh");
		values.put(DESCRIPTION, "The Battle of Pratapgad which can also be described as 1st defense of swarajya was a land battle fought on November 10, 1659 at the fort of Pratapgad near the town of Satara, Maharashtra,between the Maratha King Chattrapati Shivaji Maharaj and Afzal Khan of the Adilshahi.The Marathas defeated the Adilshahi forces despite being outnumbered. This led to the eventual establishment of the Maratha Empire.");
		db.insert("history",null,values);
		

		values.put(DAY,"10");
		values.put(MONTH,"Nov");
		values.put(YEAR, "1659 ");
		values.put(EVENT, "Battle of Purander");
		values.put(DESCRIPTION, "An army led by Fattekhan was defeated by Chatrapati Shivaji Maharaj in the battle of Purandhar. Meanwhile, Chatrapati Shivaji Maharaj had petitioned Emperor Shahjahan's son, Murad Baksh, who was governor of Deccan, pledging his loyalty to the Mughals to seek his support in securing the release of his father. The Mughals recognised Chatrapati Shivaji Maharaj as a Mughal sardar and pressured Adilshah to release Shahaji.On 16 May 1649 Shahaji was released after Shivaji and Sambhaji surrendering the forts of Kondhana,Bangalore and Kandarpi.");
		db.insert("history",null,values);

		
		values.put(DAY,"28");
		values.put(MONTH,"Dec");
		values.put(YEAR, "1659");
		values.put(EVENT, "Battle of Kolhapur");
		values.put(DESCRIPTION, "To counter the loss at Pratapgad and to defeat the newly emerging Maratha power, another army, this time numbering over 10,000, was sent against Shivaji, commanded by Bijapur's renowned Abyssinian general Rustamjaman. With a cavalry of 5,000 Marathas, Shivaji attacked them near Kolhapur on 28 December 1659. In a swift movement, Shivaji led a full frontal attack at the center of the enemy forces while other two portions of his cavalry attacked the flanks. This battle lasted for several hours and at the end Bijapuri forces were soundly defeated and Rustamjaman ignominiously fled the battlefield.Adilshahi forces lost about 2,000 horses and 12 elephants to the Marathas. This victory alarmed the mighty Mughal empire who now derisively referred to Shivaji as the 'Mountain Rat'. Aurangzeb the Mughal emperor was now actively preparing to bring the full might and resources of the Mughal Empire to bear down on the potential Maratha threat.");
		db.insert("history",null,values);
		


		values.put(DAY,"13");
		values.put(MONTH,"Jul");
		values.put(YEAR, "1660");
		values.put(EVENT, "Battle of Pavan Khind");
		values.put(DESCRIPTION, "It was a rear guard battle and a Last Stand that took place on July 13, 1660 at a mountain pass in the vicinity of fort Vishalgad, near the city of Kolhapur, Maharashtra, India between the Maratha sardar Baji Prabhu Deshpande and Siddi Masud of Adilshah. The Marathas held the Adilshahi forces till Shivaji Maharaj reached the fort Vishalgad. The Adilshahi forces were 15,000 strong against 300 Maratha light infantry.");
		db.insert("history",null,values);

		values.put(DAY,"3");
		values.put(MONTH,"Apr");
		values.put(YEAR, "1680");
		values.put(EVENT, "Death of Shivaji");
		values.put(DESCRIPTION, "Shivaji called upon his close associates and relatives. He asked them not to grieve upon his death and leave him in solitude. He then meditated and prayed in the last moments before giving up all his earthly attachments. It was the end of a larger-than-life figure called Shivaji - a name that stands high and steadfast like the north star in the mind of all Indians, and will remain so forever!");
		db.insert("history",null,values);

		
		values.put(DAY, "23");
		values.put(MONTH,"JUN");
		values.put(YEAR, "1757");
		values.put(EVENT, "Battle Of Plassey");
		values.put(DESCRIPTION, "The Battle Of Plassey was a decisive British East India company victory over The Nawab of Bengal and his allies. This was the battle that helped establish British power in India. This is judged to be one of the pivotal battles in the control of South Asia by the colonial powers. The British now wielded enormous influence over the Nawab and consequently acquired large amounts of concession for previous losses and revenue from trade.");
		db.insert("history",null,values);

		values.put(DAY, "14");
		values.put(MONTH,"JAN");
		values.put(YEAR, "1761");
		values.put(EVENT, "Battle Of Panipat(Third)");
		values.put(DESCRIPTION, "The Third Battle of Panipat took place 1761, at Panipat (Haryana State, India), between a northern expeditionary force of the Maratha Confederacy and a coalition of the King of Afghanistan Ahmad Shah Abdali with 2 Indian muslim allies. The battle is considered one of the largest battles fought in the 18th century, and has perhaps the largest fatalities in a single day reported in a classic formation battle between two armies.");
		db.insert("history",null,values);
		
		values.put(DAY, "22");
		values.put(MONTH,"OCT");
		values.put(YEAR, "1764");
		values.put(EVENT, "Battle Of Buxar");
		values.put(DESCRIPTION, "The Battle of Buxar was fought between the forces under the command of the British East India Company, and the combined armies of Mir Qasim, the Nawab of Bengal; Shuja-ud-Daulah, the Nawab of Awadh; and Shah Alam II, the Mughal Emperor. The battle fought at Buxar, then within the territory of Bengal, a town located on the bank of the Ganges river, was a decisive victory for the British East India Company.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1773");
		values.put(EVENT, "The Regulating Act Passed By British Parliament");
		values.put(DESCRIPTION, " By 1773 the East India Company was in dire financial straits.  Lord North decided to overhaul the management of the East India Company with the Regulating Act. This was the first step along the road to government control of India. The Act set up a system whereby it supervised (regulated) the work of the East India Company but did not take power for itself.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1780");
		values.put(EVENT, "Second Anglo-Mysore War");
		values.put(DESCRIPTION, "The Second Anglo-Mysore War (1780-1784) was a conflict in Mughal India between the Kingdom of Mysore and the British East India Company. Following the British seizure of the French port of Mah, Mysorean ruler Hyder Ali opened hostilities against the British, with significant success in early campaigns. As the war progressed, the British recovered some territorial losses. Both France and Britain sent troops and naval squadrons from Europe to assist in the war effort.");
		db.insert("history",null,values);

		values.put(DAY, "17");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1782");
		values.put(EVENT, "Signing Of Treaty Of Salbai");
		values.put(DESCRIPTION, "The Treaty of Salbai was signed after long negotiations to settle the outcome of the First Anglo-Maratha War. Under its terms, the Company retained control of Salsette and acquired guarantees that the Marathas would defeat Hyder Ali of Mysore and retake territories in the Carnatic. The Marathas also guaranteed that the French would be prohibited from establishing settlements on their territories. In return, the British agreed to pension off their protege, Raghunath Rao, and acknowledge Madhav Rao Narayan as peshwa of the Maratha Empire. ");
		db.insert("history",null,values);
		
		values.put(DAY, "11");
		values.put(MONTH,"MAR");
		values.put(YEAR, "1784");
		values.put(EVENT, "Treaty Of Mangalore");
		values.put(DESCRIPTION, "The Treaty of Mangalore which was signed between Tippu Sultan and the British East India Company brought an end to the Second Anglo-Mysore War. The great advantage of the treaty to Tipu was the psychological impact of the actual treaty on the British.The humiliation of the Treaty made the British determined to defeat and humble Tipu.");
		db.insert("history",null,values);
		
		
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1784");
		values.put(EVENT, "Pitt's India Act");
		values.put(DESCRIPTION, " After the Regulating Act of 1773 to regulate the affairs of the Company in India, the second important step taken by the British Parliament was the appointment of a Board of Control under Pitt's India Bill of 1784. It provided for a joint government of the Company (represented by the Directors), and the Crown (represented by the Board of Control). A Board of six members was constituted with two members of the British Cabinet and four of the Privy Council. One of who was the President and who soon became, in effect, the minister for the affairs of the East India Company. The Board had all the powers and control over all the acts and operations, which related to the civil, military and revenues of the Company.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1789");
		values.put(EVENT, "Third Anglo-Mysore war");
		values.put(DESCRIPTION, "The Third Anglo-Mysore War (1789-92) was a war in South India between the Kingdom of Mysore and the British East India Company and its allies, including the Mahratta Empire and the Nizam of Hyderabad. The war resulted in a sharp curtailment of Mysore's borders to the advantage of the Mahrattas, the Nizam of Hyderabad, and the Madras Presidency. The districts of Malabar, Salem, Bellary and Anantapur were ceded to the Madras Presidency.");
		db.insert("history",null,values);

		values.put(DAY, "20");
		values.put(MONTH,"JUN");
		values.put(YEAR, "1790");
		values.put(EVENT, "Battle Of Patan");
		values.put(DESCRIPTION, "The Battle of Patan was fought between the Maratha Confederacy and the Rajputs of Jaipur and their Mughal allies.From the day of Patan to the 2nd of April 1818 when Jaipur entered into protective subsidiary alliance with the British government, lay the gloomiest period in the history of Jaipur kingdom.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1793");
		values.put(EVENT, "Permanent Settlement Of Bengal");
		values.put(DESCRIPTION, " Permanent Settlement was a grand contract between the east india company government and the Bengal landholders. Under the contract, the landholders or zamindars were admitted into the colonial state system as the absolute proprietors of landed property. Besides being turned into proprietors of land, the zamindars were endowed with the	privilege of holding their proprietary right at a rate which was to continue unchanged for ever.Under the contract the government was barred from enhancing its revenue demand on the zamindars.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1798");
		values.put(EVENT, "Fourth Anglo-Mysore War");
		values.put(DESCRIPTION, "The Fourth Anglo-Mysore War (1798-1799) was a war in South India between the Kingdom of Mysore and the British East India Company under the Earl of Mornington. This war stands out in the annals of history because it was during this battle that the famous ruler Tipu Sultan met his maker, betrayed by his general, Mir Sadiq. Today, the spot where Tipu's body was discovered is fenced by the ASI and a plaque erected.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH,"MAR");
		values.put(YEAR, "1799");
		values.put(EVENT, "First Battle Of Polygar");
		values.put(DESCRIPTION, "The war between the British and Kattabomman Nayak of Panchalankurichi Palayam in the then Tirunelveli region is often classified as the First Polygar war. In 1799, a brief meeting (over pending taxes) between Kattabomman and the British ended in a bloody encounter in which the British commander of the forces was slain by the former.");
		db.insert("history",null,values);
		

		
		values.put(DAY, " ");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1802");
		values.put(EVENT, "Second Battle Of Polygar");
		values.put(DESCRIPTION, "Despite the suppression of the First Polygar War in 1799, rebellion broke out again in 1800. The Second war was more stealthy and covert in nature. The rebellion broke out when a band of Polygar armies bombed the British barracks in Coimbatore in 1800.The Second Polygar War marked the joining of the entire western Tamil Nadu with the Malabar and south Mysore regions (which was under British dominion after the death of Tipu Sultan). It was commandeered by the Kongu Chieftain Theeran Chinnamalai, with a vast army under him.");
		db.insert("history",null,values);
		
		values.put(DAY, "31");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1802");
		values.put(EVENT, "Treaty Of Bassein Signed");
		values.put(DESCRIPTION, "Matters among the Marathas were becoming worse by the Peshwa's own intrigues. In this helpless situation, Baji Rao had no hesitation to accept the Subsidiary Alliance and signed with the East India Company the Treaty of Bassein on December 31, 1802. The treaty provided for an English force of 6,000 to be permanently stationed with the Peshwa, and	for its maintenance the districts yielding twenty six lakh rupees were to be given to the Company. It	also stated that the Peshwa could not enter into any treaty or declare war without consulting the	Company and that the Peshwa's claim upon the Nizam and Gaekwar would be subject to the	arbitration of the Company. The Peshwa also renounced his claim over Surat.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1803");
		values.put(EVENT, "Second Anglo-Maratha War");
		values.put(DESCRIPTION, "The Second Anglo-Maratha War (1803-1805) was the second conflict between the British East India Company and the Maratha Empire in India.On 30 December 1803, the Daulat Scindia signed the Treaty of Surji-Anjangaon with the British after the Battle of Assaye and Battle of Argaon and ceded to the British Ganges-Jumna Doab, the Delhi-Agra region, parts of Bundelkhand, Broach, some districts of Gujarat, fort of Ahmmadnagar.Yashwantrao Holkar, however began hostilities with the British by securing the alliance of the Raja of Bharatpur. By the Treaty of Rajghat, Holkar got back most of his territories. The Holkar Maharajas retained control and overlordship over much of Rajasthan.");
		db.insert("history",null,values);
		
		values.put(DAY, "10");
		values.put(MONTH,"JUL");
		values.put(YEAR, "1806");
		values.put(EVENT, "The Vellore Mutiny");
		values.put(DESCRIPTION, "The Vellore Mutiny on 10 July 1806 was the first instance of a large-scale and violent mutiny by Indian sepoys against the British East India Company, predating the Indian Rebellion of 1857 by half a century. The revolt, which took place in the South Indian town of Vellore, was rather brief, lasting only one full day but brutal, as mutineers broke into the Vellore fort and killed or injured 200 British troops, before they were subdued by reinforcements from nearby Arcot.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH,"NOV");
		values.put(YEAR, "1817");
		values.put(EVENT, "Third Anglo-Maratha War");
		values.put(DESCRIPTION, "The Third Anglo-Maratha War was the final and decisive conflict between the British East India Company and the Maratha Empire in India. The war left the Company in control of most of India. It began with an invasion of Maratha territory by 110,400 British East India Company troops, the largest such British controlled force amassed in India. British victories were swift, resulting in the breakup of the Maratha Empire and the loss of Maratha independence. The Peshwa was defeated in the battles of Khadki and Koregaon and he was forced to flee.");
		db.insert("history",null,values);
		
		values.put(DAY, "5");
		values.put(MONTH,"MAR");
		values.put(YEAR, "1824");
		values.put(EVENT, "The Burmese War");
		values.put(DESCRIPTION, " On September 23, 1823 an armed party of Burmese attacked a British guard on Shapura, an island close to the Chittagong side, killing and wounding six of the guard. Two Burmese armies, one from Mariipur and another from Assam, also entered Cachar, which was under British protection, in January 1824. War with Burma was formally declared on the March 5, 1824. On May 17 a Burmese force invaded Chittagong and drove a mixed sepoy and police detachment from its position at Ramu, but did not follow up its success.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1829");
		values.put(EVENT, "The Abolition Of Sati");
		values.put(DESCRIPTION, " The British government in 1829 prohibited the custom of sati. British India declared the practice of sati as illegal and punishable by criminal courts. This law was met with widespread criticism from the Hindu right wing activists. But on the whole, this law was a watershed towards female empowerment.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1839");
		values.put(EVENT, "First Anglo-Afghan War");
		values.put(DESCRIPTION, "The First Anglo-Afghan War (also known as Auckland's Folly) was fought between British India and Afghanistan from 1839 to 1842. It was one of the first major conflicts during the Great Game, the 19th century competition for power and influence in Central Asia between the United Kingdom and Russia, and also marked one of the worst setbacks inflicted on British power in the region after the consolidation of British Raj by the East India Company.");
		db.insert("history",null,values);
		
		values.put(DAY, " 29");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1843");
		values.put(EVENT, "The Gwalior War");
		values.put(DESCRIPTION, " Years of turbulence and intrigue in Gwailor culminated in 1843 in the adoption of the child-heir Jayavi Rao Sinhia to the vacant throne. The British formed two armies: one at Agra under Sir Hugh Gough; and one at Jhansi under Major-General John Grey. Opposing them was an army, which included European-trained 'regulars' and a formidable force of artillery. Under these twin blows, the Gwalior regency capitulated and on 31st December 1843 a treaty was signed that effectively gave control of the country to the British.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1845");
		values.put(EVENT, "First Anglo-Sikh War");
		values.put(DESCRIPTION, "The First Anglo-Sikh War was fought between the Sikh Empire and the British East India Company between 1845 and 1846. It resulted in partial subjugation of the Sikh kingdom. The Sikh empire was until then one of the few remaining kingdoms in India after the rise of the company and the fall of the Mughal empire. Although the Khalsa was weakened by the war, resentment at British interference in the government led to the Second Anglo-Sikh War within three years.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1848");
		values.put(EVENT, "Second Anglo-Sikh War");
		values.put(DESCRIPTION, "The Second Anglo-Sikh War took place in 1848 and 1849, between the Sikh Empire and the British East India Company. It resulted in the subjugation of the Sikh Empire, and the annexation of the Punjab and what subsequently became the North-West Frontier Province by the East India Company.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1853");
		values.put(EVENT, "Introduction Of Railways And Telegraph Systems");
		values.put(DESCRIPTION, "In 1825 the first railway had run in England. In 1845 the East India Railway was set up in India. Simultaneously railway schemes were inaugurated in Madras and Bombay. The first train in India ran from Bombay to Thana in 1853. In 1851 the Telegraph system was inaugurated. During the latter half of the 19th century (1850-1900) Anglo-Indians found ample	employment on the railways, and in the telegraph and custom services.");
		db.insert("history",null,values);

		values.put(DAY, "10");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1857");
		values.put(EVENT, "The First War Of Indian Independence");
		values.put(DESCRIPTION, "It began as a mutiny of sepoys of the British East India Company's army in the town of Meerut, and soon erupted intoother mutinies and civilian rebellions largely in the upper Gangetic plain and central India, with the major The rebellion posed a considerable threat to Company power in that region,and it was contained only with the fall of Gwalior on 20 June 1858.The rebellion led to the dissolution of the East India Company in 1858.India was thereafter directlygoverned by the Crown in the new British Raj.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1858");
		values.put(EVENT, "British Crown Takes Over The Indian Government");
		values.put(DESCRIPTION, "The British Parliament finally realized that it was inappropriate for a private company like the East India Company to exercise such enormous powers and control a land the size of India. In 1858, the East India Company was dissolved, despite a brilliant defense of its	achievements by John Stuart Mill, and the administration of India became the responsibility of the	Crown. Direct rule on India was exercised through the India Office, a British department of state	and till 1947, India became known as the Raj, the Crown Jewel of Queen Victoria's extensive	empire.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1877");
		values.put(EVENT, "The Queen Of England Proclaimed Empress Of India");
		values.put(DESCRIPTION, "The title Empress of India was given to Queen Victoria in 1877 when India was formally incorporated into the British Empire. It is said Victoria's desire for such a title was motivated partially out of jealousy of the Imperial titles of some of her royal cousins in Germany and Russia. When Victoria died and her son Edward VII ascended the throne, his title became Emperor of India. The title continued until India became independent from the United Kingdom in 1947.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1878");
		values.put(EVENT, "The Vernacular Press Act");
		values.put(DESCRIPTION, "The Vernacular Press Act of 1878 was a highly controversial measure repressing the freedom of the vernacular press. Obviously this repressive measure came	under severe criticism. The newspapers themselves kept on criticizing the measure without	an end. The succeeding administration of Lord Ripon reviewed the developments consequent upon	the Act and finally withdrew it.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1878");
		values.put(EVENT, "Second Anglo-Afghan War");
		values.put(DESCRIPTION, "The Second Anglo-Afghan War was fought between the United Kingdom and Afghanistan from 1878 to 1880, when the nation was ruled by Sher Ali Khan of the Barakzai dynasty. This was the second time British India invaded Afghanistan. The war ended in a manner after attaining all the British geopolitical objectives. Most of the British and Indian soldiers withdrew from Afghanistan. The Afghans were permitted to maintain internal sovereignty but they had to cede control of their nation's foreign relations to the British.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1885");
		values.put(EVENT, "First Meeting Of The Indian National Congress");
		values.put(DESCRIPTION, "The British decided to provide an outlet to the local people where they could discuss their political problems. In order to achieve this goal, Allan Octavian Hume, a retired British civil servant, had a series of meetings with Lord Dufferin, the Viceroy. Hume consulted the local Indian leaders and started working towards the establishment of an Indian political organization. Seventy delegates, most of whom were lawyers, educationalists and journalists, attended the convention in which the Indian National Congress was established. This first session of Congress was presided over by Womesh Chandra Banerjee and he was also elected as the first president of  the organization.");
		db.insert("history",null,values);

		values.put(DAY, "16");
		values.put(MONTH,"OCT");
		values.put(YEAR, "1905");
		values.put(EVENT, "The First Partition Of Bengal");
		values.put(DESCRIPTION, "The Partition of Bengal, effected on 16 October 1905 proved to be a momentous event in the history of modern Bengal. Bengal, which included Bihar and Orissa since 1765, was admittedly much too large for a single province of British India. This premier province grew too vast for efficient administration and required reorganisation and intelligent division. The Partition of Bengal of 1905 left a profound impact on the political history of India. From a political angle the measure accentuated Hindu-Muslim differences in the region.");
		db.insert("history",null,values);
		
		values.put(DAY, "1");
		values.put(MONTH,"OCT");
		values.put(YEAR, "1906");
		values.put(EVENT, "Establishment Of The Muslim League");
		values.put(DESCRIPTION, "On the 1st of October 1906 a 35-member delegation of the Muslim nobles, aristocracies, legal professionals and other elite section of the community mostly associated with Aligarh movement gathered at Simla under the leadership of Aga Khan to present an address to Lord Minto. They demanded proportionate representation of Muslims in government jobs, appointment of Muslim judges in High Courts and members in Viceroy's council etc. Though the Shimla deputation failed to obtain any positive commitment from the Viceroy, it worked as a catalyst for foundation of The All India Muslim League to safeguard the interests of the Muslims.");
		db.insert("history",null,values);
		
		values.put(DAY, "23");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1912");
		values.put(EVENT, "Delhi Conspiracy Case");
		values.put(DESCRIPTION, "The Delhi Conspiracy case refers to a conspiracy to assassinate the then Viceroy of India, Lord Hardinge, on the occasion of transferring the capital of British India from Calcutta to New Delhi. Hatched by the Indian revolutionary underground in Bengal and Punjab and headed by Rashbehari Bose, the conspiracy culminated on an attempted assasination when a homemade bomb was thrown into the Viceroys's Howdah. Although wounded in the attempt, the Viceroy escaped with his injuries, along with Lady Hardinge, but his Mahout was killed in the attack");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1913");
		values.put(EVENT, "Founding Of Ghadar Party"); 
		values.put(DESCRIPTION, "The Ghadar Party was an organization founded by Punjabi Indians,with the aim to liberate India from British rule. The movement began with a group of immigrants known as the Hindustani Workers of the Pacific Coast. After the outbreak of World War I, Ghadar party members returned to Punjab to agitate for rebellion alongside the Babbar Akali Movement. In 1915 they conducted revolutionary activities in central Punjab and attempted to organize uprisings but their attempts were crushed by the British Government.The party was formally dissolved in 1948.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH,"FEB");
		values.put(YEAR, "1915");
		values.put(EVENT, "The February Mutiny");
		values.put(DESCRIPTION, "The February Mutiny was a prominent plan which attempted to foment unrest and trigger a Pan-Indian mutiny in the British Indian Army from Punjab to Singapore. This plot was planned to be executed in February 1915 with the aim of overthrowing the Raj from the Indian subcontinent. The February mutiny was ultimately thwarted when British intelligence infiltrated the Ghadar party, arresting key figures. Mutinies in smaller units and garrisons within India were also crushed.");
		db.insert("history",null,values);
		
		values.put(DAY, "1");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1915");
		values.put(EVENT, "Establishment Of The Provisional Govt. Of India");
		values.put(DESCRIPTION, "Provisional Government of India was established by Indian Nationalists in Afghanistan during World War I with support from the Central Powers. Its purpose was to enroll support from both the Afghan Emir, Russia, China and Japan for the Indian Movement. Established at the conclusion of the Kabul Mission composed of members of the Berlin Committee, German and Turkish delegates, the government was established on in Kabul it had Raja Mahendra Pratap as President, Maulana Barkatullah as Prime Minister, Maulavi Abaidullah Sindhi as Home Minister and Champakraman Pillai as Minister for foreign affairs. ");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH," ");
		values.put(YEAR, "1915");
		values.put(EVENT, "The Defense Of India Act");
		values.put(DESCRIPTION, "1915 legislation was designed to give the government of British India special powers to deal with revolutionary and German-inspired threats during World War I, especially in the Punjab. A special legal tribunal was set up to deal with such cases without prior commitment and with no appeal. Power was also taken for the internment of suspects.");
		db.insert("history",null,values);
		
		values.put(DAY, "23");
		values.put(MONTH,"APR");
		values.put(YEAR, "1916");
		values.put(EVENT, "The Home Rule League Founded");
		values.put(DESCRIPTION, "On April 23, 1916 Bal Gangadhar Tilak formed The Home Rule League in Bombay. Six months later Mrs. Annie Besant founded the league in Madras. The Home Rule League became popular and it broke fresh ground even in small towns that hitherto had little or no political consciousness.");
		db.insert("history",null,values);
		
		values.put(DAY, "13");
		values.put(MONTH,"APR");
		values.put(YEAR, "1919");
		values.put(EVENT, "The Jallianwala Bagh Massacare");
		values.put(DESCRIPTION, "The Jallianwala Bagh massacre took place in the Jallianwala Bagh public garden in the northern Indian city of Amritsar, and was ordered by General R.E.H. Dyer. On Sunday April 13, 1919, which happened to be 'Baisakhi', fifty British Indian Army soldiers, commanded by General Reginald Dyer, began shooting at an unarmed gathering of men, women, and children without warning. Dyer marched his fifty riflemen to a raised bank and ordered them to kneel and fire. Dyer ordered soldiers to reload their rifles several times and they were ordered to shoot to kill. Official Government of India sources estimated the fatalities at 379, with 1,100 wounded.");
		db.insert("history",null,values);
		
		values.put(DAY, "6");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1919");
		values.put(EVENT, "Third Anglo-Afghan War");
		values.put(DESCRIPTION, "The Third Anglo-Afghan War was a minor tactical victory for the British. For the British, the Durand Line was reaffirmed as the political boundary between the Emirate of Afghanistan and British India and the Afghans agreed not to foment trouble on the British side. In the aftermath, the Afghans were able to resume the right to conduct their own foreign affairs as a fully independent state.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH,"SEP");
		values.put(YEAR, "1920");
		values.put(EVENT, "Non Co-Operation Movement");
		values.put(DESCRIPTION, "The non-cooperation movement was a significant phase of the Indian struggle for freedom from British rule which lasted for years. This movement, which lasted from September 1920 to February 1922 and was led by Mohandas Gandhi, and supported by the Indian National Congress. It aimed to resist British occupation of India through non-violent means.The Gandhian ideals of ahimsa or non-violence, and his ability to rally hundreds of thousands of common citizens towards the cause of Indian independence, were first seen on a large scale in this movement.");
		db.insert("history",null,values);
		
		values.put(DAY, "9");
		values.put(MONTH,"AUG");
		values.put(YEAR, "1925");
		values.put(EVENT, "The Kakori Train Robbery");
		values.put(DESCRIPTION, "The Kakori train robbery was a train robbery that took place between Kakori and Alamnagar near Lucknow, on 9 August 1925 during the Indian Independence Movement. The idea of the robbery was conceived by Ram Prasad Bismil and Ashfaqullah Khan who belonged to the Hindustan Republican Association that was created to carry out revolutionary activities against the British Empire in India. The organization needed money for the supply of weaponry, and thus Bismil decided to loot a train on one of the Northern Railway lines. The robbery plan was executed by Ram Prasad Bismil, Ashfaqulla Khan, Rajendra Lahiri, Chandrasekhar Azad, Sachindra Bakshi, Keshab Chakravarthy, Manmathnath Gupta, Murari Sharma, Mukundi Lal and Banwari Lal.");
		db.insert("history",null,values);
		
		values.put(DAY, "8");
		values.put(MONTH,"APR");
		values.put(YEAR, "1929");
		values.put(EVENT, "Bombing Of Central Assembly");
		values.put(DESCRIPTION, "On April 8, 1929 Bhagat Singh and Batukeshwar Dutt threw bombs at the empty treasury benches in the Central Assembly at Delhi. They made no attempt to escape and courted arrest while shouting Inquilab Zindabad (Long Live the Revolution) and Samrajyavad ko nash ho (Down with Imperialism). Their rationale for the bombing was explained in a leaflet titled 'To Make the Deaf Hear'. This leaflet was also thrown in the assembly and was reproduced the next day in the Hindustan Times. No one was killed in the bombing as it was designed as a propaganda operation");
		db.insert("history",null,values);

		values.put(DAY, "26");
		values.put(MONTH,"JAN");
		values.put(YEAR, "1930");
		values.put(EVENT, "The Purna-Swaraj Declaration");
		values.put(DESCRIPTION, "The Purna Swaraj declaration, or Declaration of the Independence of India was promulgated by the Indian National Congress resolving the Congress and Indian nationalists to fight for Purna Swaraj, or complete self-rule independent of the British Empire. The flag of India had been hoisted by Congress President Jawaharlal Nehru on December 31, 1929, on the banks of the Ravi river in Lahore. The Congress asked the people of India to observe January 26 as Independence Day. The flag of India was hoisted publicly across India by Congress volunteers, nationalists and the public.");
		db.insert("history",null,values);
		
		values.put(DAY, "12");
		values.put(MONTH,"MAR");
		values.put(YEAR, "1930");
		values.put(EVENT, "The Salt Satyagraha");
		values.put(DESCRIPTION, "The Salt Satyagraha, which began with the Dandi March, was an important part of the Indian independence movement. Mahatma Gandhi led the Dandi march from his base, Sabarmati Ashram near Ahmedabad, to the sea coast near the village of Dandi. As he continued on this 24 day, 240 mile (390 km) march to produce salt without paying the tax, growing numbers of Indians joined him along the way. When Gandhi broke the salt laws at 6:30 am on April 6, 1930, it sparked large scale acts of civil disobedience against the British Raj salt laws by millions of Indians. The campaign had a significant effect on changing world and British attitudes toward Indian independence and caused large numbers of Indians to join the fight for the first time.");
		db.insert("history",null,values);
		
		values.put(DAY, "12");
		values.put(MONTH,"NOV");
		values.put(YEAR, "1930");
		values.put(EVENT, "First Round Table Conference");
		values.put(DESCRIPTION, "The Round Table Conference was opened officially by King George V on November 12, 1930 and chaired by the British Prime Minister, Ramsay MacDonald. There were fifty-seven political leaders from British India and sixteen delegates from the princely states. However, the Indian National Congress, along with Indian business leaders, kept away from the conference. The idea of an All-India Federation was moved to the centre of discussion. All the groups attending the conference supported this concept. The responsibility of the Executive to Legislature was discussed, and B.R. Ambedkar demanded a separate electorate for the so called Untouchables.");
		db.insert("history",null,values);
		
		values.put(DAY, "23");
		values.put(MONTH,"MAR");
		values.put(YEAR, "1931");
		values.put(EVENT, "Hanging Of Bhagat Singh,Rajguru and Sukhdev");
		values.put(DESCRIPTION, "Bhagat Singh, Rajguru and Sukhdev were sentenced to death in the Lahore conspiracy case and ordered to be hanged on March 24, 1931. On 23 March 1931 at 7:30 pm, Bhagat Singh was hanged in Lahore Jail with his fellow comrades Rajguru and Sukhdev. His supporters, who had been protesting against the hanging, immediately declared him as a shaheed or martyr. According to the Superintendent of Police at the time, V.N. Smith, the hanging was advanced by a day. The Jail authorities broke the rear wall of the Jail and secretly cremated the three martyrs under cover of darkness on the banks of Sutlej, about 10 km from Ferozepore.");
		db.insert("history",null,values);

		values.put(DAY, "7");
		values.put(MONTH,"SEP");
		values.put(YEAR, "1931");
		values.put(EVENT, "Second Round Table Conference");
		values.put(DESCRIPTION, "The second session opened on September 7, 1931.During the Conference, Gandhi could not reach agreement with the Muslims on Muslim representation and safeguards. At the end of the conference Ramsay MacDonald undertook to produce a Communal Award for minority representation, with the provision that any free agreement between the parties could be substituted for his award. Gandhi took particular exception to the treatment of untouchables as a minority separate from the rest of the Hindu community. He clashed with the leader of depressed classes, B. R. Ambedkar, over this issue.");
		db.insert("history",null,values);
		
		values.put(DAY, "17");
		values.put(MONTH,"NOV");
		values.put(YEAR, "1932");
		values.put(EVENT, "Third Round Table Conference ");
		values.put(DESCRIPTION, "The third and last session assembled on November 17, 1932. Only forty-six delegates attended since most of the main political figures of India were not present. The Labour Party from Britain and the Indian National Congress refused to attend. In this conference, Chaudhary Rahmat Ali, a college student, coined the name 'Pakistan' as the name for the Muslim part of partitioned India. Jinnah did not attend it. From September 1931 until March 1933, under the supervision of Samuel Hoare, the proposed reforms took the form reflected in the Government of India Act 1935.");
		db.insert("history",null,values);
		
		values.put(DAY, "23");
		values.put(MONTH,"MAR");
		values.put(YEAR, "1940");
		values.put(EVENT, "The Lahore Resolution");
		values.put(DESCRIPTION, "The Lahore Resolution commonly known as the Pakistan Resolution, was a formal political statement adopted by the Muslim League at the occasion of its three-day general session on 22-24 March 1940 that called for greater Muslim autonomy in British India. This has been largely interpreted as a demand for a separate Muslim state, Pakistan. The resolution was presented by A. K. Fazlul Huq and was authored by Muhammad Zafrulla Khan.");
		db.insert("history",null,values);
		
		values.put(DAY, "8");
		values.put(MONTH,"AUG");
		values.put(YEAR, "1942");
		values.put(EVENT, "The Quit India Resolution");
		values.put(DESCRIPTION, "The Quit India Movement, or the August Movement (August Kranti) was a civil disobedience movement launched in India in August 1942 in response to Mohandas Gandhi's call for immediate independence. Gandhi hoped to bring the British government to the negotiating table. Almost the entire Indian National Congress leadership, and not just at the national level, was put into confinement less than twenty-four hours after Gandhi's speech, and the greater number of the Congress leaders were to spend the rest of World War II in jail.");
		db.insert("history",null,values);

		values.put(DAY, " ");
		values.put(MONTH,"AUG");
		values.put(YEAR, "1942");
		values.put(EVENT, "Formation Of The Indian National Army");
		values.put(DESCRIPTION, "The Indian National Army was an armed force formed by Indian nationalists in 1942 in Southeast Asia during World War II. The aim of the army was to overthrow the British Raj in colonial India, with Japanese assistance. Initially composed of Indian prisoners of war captured by Japan in the Malayan campaign and at Singapore, it later drew volunteers from Indian expatriate population in Malaya and Burma. Initially formed in 1942 immediately after the fall of Singapore under Mohan Singh, the first INA collapsed in December that year before it was revived under the leadership of Subhas Chandra Bose in 1943. This second INA fought along with the Imperial Japanese Army against the British. The end of the war saw a large number of the troops repatriated to India where some faced trial for treason and became a galvanising point of the Indian Independence movement.");
		db.insert("history",null,values);
		
		values.put(DAY, "21");
		values.put(MONTH,"OCT");
		values.put(YEAR, "1943");
		values.put(EVENT, "Formation Of The Azad Hind");
		values.put(DESCRIPTION, "The formation of The Azad Hind was a part of a political movement originating in the 1940s outside of India with the purpose of allying with Axis powers to free India from British Rule.  Founded on October 21,	1943, the government was inspired by the concepts of Netaji Subhash Chandra Bose who was also the leader of the government and the Head of State of this Provisional Indian Government in Exile. The government proclaimed authority over Indian civilian and military personnel in Southeast Asian British colonial territory and prospective authority over Indian territory to fall to the Japanese forces and the Indian National Army. The government of Azad Hind had its own currency, court and civil code, and in the eyes of many Indians its existence gave a greater legitimacy to the independence struggle against the British.");
		db.insert("history",null,values);
		
		values.put(DAY, "18");
		values.put(MONTH,"FEB");
		values.put(YEAR, "1946");
		values.put(EVENT, "The Royal Indian Navy Mutiny");
		values.put(DESCRIPTION, "The Royal Indian Navy mutiny (also called the Bombay Mutiny) encompasses a total strike and subsequent mutiny by Indian sailors of the Royal Indian Navy on board ship and shore establishments at Bombay (Mumbai) harbour on 18 February 1946. From the initial flashpoint in Bombay, the mutiny spread and found support throughout British India, from Karachi to Calcutta and ultimately came to involve 78 ships, 20 shore establishments and 20,000 sailors.");
		db.insert("history",null,values);
		

		values.put(DAY, "15");
		values.put(MONTH,"AUG");
		values.put(YEAR, "1947");
		values.put(EVENT, "India Is Independent");
		values.put(DESCRIPTION, "At midnight, on the 14th of August 1947, India finally gained independence from British rule. The first Prime Minister of India, Pandit Jawaharlal Nehru, addressed the nation thus: 'At the stroke of the midnight hour, while the world sleeps, India awakens to Life and Freedom'.");
		db.insert("history",null,values);
		
		values.put(DAY, "15");
		values.put(MONTH,"AUG");
		values.put(YEAR, "1947");
		values.put(EVENT, "Partition Of India");
		values.put(DESCRIPTION, "The Partition of India was the partition of British India on the basis of religious demographics that led to the creation of the sovereign states of the Dominion of Pakistan and the Union of India on 14 and 15 August 1947 respectively. The partition of India was promulgated in the Indian Independence Act 1947 and resulted in the dissolution of the British Raj. The struggle between the new dominions of India and Pakistan which resulted from the partition displaced up to 12.5 million people in the former British Indian Empire, with estimates of loss of life varying from several hundred thousand to a million. The violent nature of the partition created an atmosphere of mutual hostility and suspicion between India and Pakistan that plagues their relationship to this day.");
		db.insert("history",null,values);		
		
		values.put(DAY, "21");
		values.put(MONTH,"OCT");
		values.put(YEAR, "1947");
		values.put(EVENT, "The First Indo-Pakistan War");
		values.put(DESCRIPTION, "The India-Pakistan War of 1947-48, sometimes known as the First Kashmir War, was fought between India and Pakistan over the region of Kashmir from 1947 to 1948. It was the first of four wars fought between the two newly independent nations. The result of the war still affects the geopolitics of both the countries. This war led to the establishment of the Line Of Control.");
		db.insert("history",null,values);
		
		values.put(DAY, "30");
		values.put(MONTH,"JAN");
		values.put(YEAR, "1948");
		values.put(EVENT, "The Assassination Of Mahatma Gandhi");
		values.put(DESCRIPTION, "Mohandas Karamchand Gandhi (often called Mahatma Gandhi) was assassinated on 30 January 1948, shot at point-blank range by Nathuram Godse. Since 1934, there had been five unsuccessful attempts to kill Gandhi. Gandhi was outside on the steps of a building where a prayer meeting was going to take place He was surrounded by a part of his family and some followers when three gunshots killed him.");
		db.insert("history",null,values);	
		
		values.put(DAY, "13");
		values.put(MONTH,"SEP");
		values.put(YEAR, "1948");
		values.put(EVENT, "Operation Polo");
		values.put(DESCRIPTION, "Operation Polo(code name for The Hyderabad Police Action) was a military operation in September 1948 in which the Indian Armed Forces engaged those of the State of Hyderabad and ended the rule of Nizam, annexing the state into the Indian Union. The operation took place after Nizam Osman Ali Khan decided not to join the princely State of Hyderabad to either India or Pakistan after the partition of India. Wary of a hostile independent state in the centre of India, Deputy Prime Minister Sardar Patel decided to annex the state of Hyderabad. He sent the Indian Army and the Hyderabad State Forces were defeated within five days.");
		db.insert("history",null,values);
		 
		values.put(DAY, "26");
		values.put(MONTH,"JAN");
		values.put(YEAR, "1950");
		values.put(EVENT, "The First Republic Day");
		values.put(DESCRIPTION, "The Republic Day of India commemorates the date on which the Constitution of India came into force replacing the Government of India Act 1935 as the governing document of India on 26 January 1950. The 26th of January was chosen to honour the memory of the declaration of independence of 1930. It is one of the three national holidays in India, and while the main parade takes place in the national capital New Delhi at the Rajpath, where the president views the parade, state capitals also have their state celebrations.");
		db.insert("history",null,values);
		
		values.put(DAY, "18");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1961");
		values.put(EVENT, "Liberation Of Goa");
		values.put(DESCRIPTION, "The 1961 Liberation Of Goa was an action by India's armed forces that ended Portuguese rule in its Indian enclaves in 1961. The armed action, codenamed Operation Vijay by the Indian government, involved air, sea and land strikes for over 36 hours, and was a decisive victory for India, ending 451 years of Portuguese colonial rule in Goa. Twenty two Indians and thirty Portuguese were killed in the fighting.");
		db.insert("history",null,values);
		
		values.put(DAY, "20");
		values.put(MONTH,"OCT");
		values.put(YEAR, "1962");
		values.put(EVENT, "Sino-Indian War");
		values.put(DESCRIPTION, "The Sino-Indian War was a war between China and India that occurred in 1962. A disputed Himalayan border was the main pretext for war, but other issues played a role. The Chinese launched simultaneous offensives in Ladakh and across the McMahon Line on 20 October 1962, coinciding with the Cuban Missile Crisis. The war ended when the Chinese declared a ceasefire on 20 November 1962, and simultaneously announced its withdrawal from the disputed area.");
		db.insert("history",null,values);
		

		
		values.put(DAY, " ");
		values.put(MONTH,"AUG");
		values.put(YEAR, "1965");
		values.put(EVENT, "The Second Indo-Pakistan War");
		values.put(DESCRIPTION, "The Indo-Pakistani War of 1965 was a culmination of skirmishes that took place between April 1965 and September 1965 between Pakistan and India. This conflict became known as the Second Kashmir War. The war began following Pakistan's Operation Gibraltar, which was designed to infiltrate forces into Jammu and Kashmir to precipitate an insurgency against rule by India. The five-week war caused thousands of casualties on both sides. It ended in a United Nations (UN) mandated ceasefire and the subsequent issuance of the Tashkent Declaration.");
		db.insert("history",null,values);
		
		values.put(DAY, "3");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1971");
		values.put(EVENT, "The Indo-Pakistan War Of 1971");
		values.put(DESCRIPTION, "The Indo-Pakistani War of 1971 was a military conflict between India and Pakistan. Indian, Bangladeshi and international sources consider the beginning of the war to be Operation Chengiz Khan, Pakistan's December 3, 1971 pre-emptive strike on 11 Indian airbases. Lasting just 13 days it is considered one of the shortest wars in history. The war effectively came to an end after the Eastern Command o the Pakistani Armed Forces signed the Instrument of Surrender, the first and perhaps the only public surrender to date, on December 16, 1971 following which East Pakistan seceded as the independent state of Bangladesh.");
		db.insert("history",null,values);
		
		values.put(DAY, "18");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1974");
		values.put(EVENT, "Operation Smiling Buddha");
		values.put(DESCRIPTION, "The Smiling Buddha, formally designated as Pokhran-I, was the codename given to Republic of India's first nuclear test explosion that took place at the long-constructed Indian Army base, Pokhran Test Range at Pokhran municipality, Rajasthan state on 18 May 1974 at 8:05 a.m. (IST). It was also the first confirmed nuclear test by a nation outside the five permanent members of the United Nations Security Council. The explosive yield of the bomb was reported to be 8 kt.");
		db.insert("history",null,values);
		
		values.put(DAY, "3");
		values.put(MONTH,"JUN");
		values.put(YEAR, "1984");
		values.put(EVENT, "Operation Blue Star");
		values.put(DESCRIPTION, "Operation Blue Star was an Indian military operation, ordered by Indira Gandhi, then Prime Minister of India, to remove Sikh separatists from the Golden Temple in Amritsar. The Sikh separatists, led by Jarnail Singh Bhindranwale, had amassed weapons in the Sikh temple. The operation was carried out by Indian army troops with tanks and armoured vehicles. Militarily successful, the operation aroused immense controversy, and the government's justification for the timing and style of the attack are highly debated.");
		db.insert("history",null,values);
		
		values.put(DAY, "31");
		values.put(MONTH,"OCT");
		values.put(YEAR, "1984");
		values.put(EVENT, "Assassination Of Indira Gandhi");
		values.put(DESCRIPTION, "Indira Gandhi, then Prime Minister of India, was assassinated on 31 October 1984, 9.20 am, at her 1, Safdarjung Road, New Delhi residence. She was killed by two of her Sikh bodyguards,Satwant Singh and Beant Singh, to avenge the military attack on the Harmandir Sahib during Operation Blue Star.");
		db.insert("history",null,values);
		
		values.put(DAY, "31");
		values.put(MONTH,"OCT");
		values.put(YEAR, "1984");
		values.put(EVENT, "Anti-Sikh Riots");
		values.put(DESCRIPTION, "The 1984 Anti-Sikh pogroms / riots or the 1984 Sikh Massacre were four days of violence in northern India, particularly Delhi, during which armed mobs killed Sikhs, looted and set fire to Sikh homes, businesses and schools, and attacked gurdwaras, in response to the assassination of then Prime Minister, Indira Gandhi by her Sikh bodyguards.");
		db.insert("history",null,values);
		
		values.put(DAY, "3");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1984");
		values.put(EVENT, "The Bhopal Gas Tragedy");
		values.put(DESCRIPTION, "The Bhopal disaster also known as Bhopal Gas Tragedy was a gas leak accident in India, considered one of the world's worst industrial catastrophes. It occurred on the night of December 2â€“3, 1984 at the Union Carbide India Limited (UCIL) pesticide plant in Bhopal, Madhya Pradesh, India. A leak of methyl isocyanate gas and other chemicals from the plant resulted in the exposure of hundreds of thousands of people. Estimates vary on the death toll. The official immediate death toll was 2,259 and the government of Madhya Pradesh has confirmed a total of 3,787 deaths related to the gas release.");
		db.insert("history",null,values);
		
		values.put(DAY, "21");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1991");
		values.put(EVENT, "The Assassination OF Rajiv Gandhi");
		values.put(DESCRIPTION, "The assassination of Rajiv Gandhi, the sixth Prime Minister of India, occurred as a result of a suicide bombing in Sriperumbudur in Tamil Nadu, India on 21 May, 1991. At least 14 others were also killed. The attack was blamed on the LTTE. At the time India was embroiled, through the Indian Peace Keeping Force, in the Sri Lankan Civil War. Subsequent accusations of conspiracy have been addressed by two commissions of inquiry and have brought down at least one national government. The LTTE, however, denied responsibility.");
		db.insert("history",null,values);
		
		values.put(DAY, "6");
		values.put(MONTH,"DEC");
		values.put(YEAR, "1992");
		values.put(EVENT, "Demolition Of Babri Masjid");
		values.put(DESCRIPTION, "The Demolition of Babri Masjid was the destruction of the 16th-century mosque of Babri Masjid in Ayodhya, Uttar Pradesh, India, on December 6, 1992 by Hindu Karsevaks in an attempt to reclaim the land known as Ram Janmabhoomi. The demolition occurred after a religious ceremony turned violent and resulted in several months of intercommunal rioting between India's Hindu and Muslim communities, causing the death of at least 2,000 people.");
		db.insert("history",null,values);
		
		values.put(DAY, "12");
		values.put(MONTH,"MAR");
		values.put(YEAR, "1993");
		values.put(EVENT, "The Bombay Serial Blasts");
		values.put(DESCRIPTION, "The 1993 Bombay bombings were a series of 13 bomb explosions that took place in Bombay (now Mumbai), Maharashtra, India on Friday, 12 March 1993. The coordinated attacks were the most destructive bomb explosions in Indian history. The single-day attacks resulted in up to 250 fatalities and 700 injuries.");
		db.insert("history",null,values);
		

		
		values.put(DAY, "11");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1998");
		values.put(EVENT, "Operation Shakti(Pokharan-II)");
		values.put(DESCRIPTION, "Pokharan-II refers to test explosions of five nuclear devices, three on 11 May and two on 13 May 1998, conducted by India at the Pokhran test range. These nuclear tests resulted in a variety of sanctions against India by a number of major states. Shakti was the codename of a thermonuclear device that was exploded in Pokhran as part of Pokhran-II.");
		db.insert("history",null,values);
		
		values.put(DAY, " ");
		values.put(MONTH,"MAY");
		values.put(YEAR, "1999");
		values.put(EVENT, "The Kargil War");
		values.put(DESCRIPTION, "The Kargil War was an armed conflict between India and Pakistan that took place between May and July 1999 in the Kargil district of Kashmir and elsewhere along the Line of Control (LOC). The conflict is also referred to as Operation Vijay (Victory in Hindi) which was the name of the Indian operation to clear the Kargil sector.");
		db.insert("history",null,values);
		
		values.put(DAY, "26");
		values.put(MONTH,"JAN");
		values.put(YEAR, "2001");
		values.put(EVENT, "The Gujarat Earthquake");
		values.put(DESCRIPTION, "The 2001 Gujarat earthquake occurred on January 26, 2001, India's 52nd Republic Day, at 08:46 AM local time (3:16 UTC) and lasted for over two minutes. The quake killed around 20,000 people (including 18 in South eastern Pakistan), injured another 167,000 and destroyed nearly 400,000 homes. This was an intraplate earthquake, one that occurred at a distance from any plate boundary where plate tectonics create most earthquakes, so the area was not well prepared. The event was the result of stored energy in a collision margin. The shock waves spread 700 km. 21 districts were affected and 600,000 people left homeless.");
		db.insert("history",null,values);
		
		values.put(DAY, "11");
		values.put(MONTH,"JUL");
		values.put(YEAR, "2006");
		values.put(EVENT, "The Mumbai Train Bombings");
		values.put(DESCRIPTION, "The 11 July 2006 Mumbai train bombings were a series of seven bomb blasts that took place over a period of 11 minutes on the Suburban Railway in Mumbai, the capital of the Indian state of Maharashtra and the nation's financial capital. The bombs were set off in pressure cookers on trains plying the Western line of the Suburban Railway network. 209 people were killed and over 700 were injured. According to Mumbai Police, the bombings were carried out by Lashkar-e-Toiba and Students Islamic Movement of India (SIMI).");
		db.insert("history",null,values);
		
		values.put(DAY, "26");
		values.put(MONTH,"NOV");
		values.put(YEAR, "2008");
		values.put(EVENT, "The 26/11 Terror Attacks");
		values.put(DESCRIPTION, "The 2008 Mumbai attacks (sometimes referred to as 26/11) were more than 10 coordinated shooting and bombing attacks across Mumbai, India's largest city, by Islamist attackers who came from Pakistan. The attackers received reconnaissance assistance before the attacks, Ajmal Kasab later claimed upon interrogation that the attacks were conducted with the support of Pakistan's ISI.The attacks, which drew widespread global condemnation, began on Wednesday, 26 November and lasted until Saturday, 29 November 2008, killing 164 people and wounding at least 308.");
		db.insert("history",null,values);
		
	

}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		db.execSQL("DROP TABLE IF EXISTS history");
		onCreate(db);
	}

}

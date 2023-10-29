public class FirebaseServices1 {
        private static FirebaseServices instance;
        private FirebaseAuth auth;
        private FirebaseFirestore fire;
        private FirebaseStorage storage;

        public FirebaseServices1(){
            auth = FirebaseAuth.getIntance();
            fire = FirebaseFirestore.getIntance();
            storage = FirebaseStorage.getIntance();
        }
    }


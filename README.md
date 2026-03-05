javac HeapClasher.java

java -Xmx128M \
-XX:OnOutOfMemoryError='curl -H "Content-Type: application/json" -X POST -d "{\"status\":\"OutOfMemory\",\"host\":\"$(hostname)\"}" http://<IP_DE_TU_EDA>:5000/endpoint' \
HeapClasher


ssh-keygen -f "/home/adelahoz/.ssh/known_hosts" -R "[127.0.0.1]:30022"
ssh fedora@127.0.0.1 -p 30022

ansible-playbook playbook-install-initial.yaml